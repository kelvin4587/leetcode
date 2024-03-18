package ocr;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ErBao
 * @version v 1.0
 * @date 2023/12/7 19:18
 */
public class OcrUtil {

    public static void main(String[] args) {
        File file = new File("D:\\12345.json");
        JSONObject utf8 = JSONUtil.readJSONObject(file, Charset.forName("gbk"));
        System.out.println(check(utf8));;
    }


    // 正则表达式模式
    private static final String idPattern = "\\d{18}|\\d{17}[Xx]";


    public static String find(String pattern,String value){
        // 匹配住址
        Pattern addressRegex = Pattern.compile(pattern);
        Matcher addressMatcher = addressRegex.matcher(value);
        if (addressMatcher.find()) {
            if(idPattern.equals(pattern)){
                return addressMatcher.group();
            }
            return addressMatcher.group(1);
        }
        return null;
    }

    public static ArrayList<People> check(JSONObject jsonObject){
        ArrayList<People> peopleList = new ArrayList<>();
            JSONObject state = jsonObject.getJSONObject("state");
            if(0==state.getInt("code")||state.getBool("success")){
                //响应成功
                JSONObject body = jsonObject.getJSONObject("body");
                JSONArray pages = body.getJSONArray("pages");
                for (Object page : pages) {
                    JSONObject parse = JSONUtil.parseObj(page);
                    JSONArray lines = parse.getJSONArray("lines");
                    People.PeopleBuilder builder = People.builder();
                    String  address = "";
                    String  addressD= "";
                    for (Object line : lines) {
                        JSONObject lineObj = JSONUtil.parseObj(line);
                        JSONArray words = lineObj.getJSONArray("words");
                        for (Object entry : words) {
                            JSONObject entryObj = JSONUtil.parseObj(entry);
                            String content = entryObj.getStr("content");
                            String [] arr1 = new String[]{"省","市","区"};
                            Optional<String> first1 = Arrays.stream(arr1).filter(content::contains).findFirst();
                            if(first1.isPresent()){
                                address = content.replace("住址","");
                                continue;
                            }
                            String [] arr2 = new String[]{"镇","村","乡","楼"};
                            Optional<String> first2 = Arrays.stream(arr2).filter(content::contains).findFirst();
                            if(first2.isPresent()){
                                addressD = content;
                                continue;
                            }

                            String [] arr = new String[]{"身份号","出生","住址","性","男","民族","女","姓"};
                            Optional<String> first = Arrays.stream(arr).filter(content::contains).findFirst();
                            if(first.isPresent()){
                                if(content.contains("民族")&&content.length()>2){
                                    builder.nation(getNation(content));
                                }
                                if(content.contains("姓")&&content.length()>2){
                                    builder.name(content.replace("姓名",""));
                                }
                                continue;
                            }

                            if(!getNation(content).equals("未知")){
                                builder.nation(getNation(content));
                            }


                            String s = find(idPattern, content);
                            if(s !=null){
                                builder.birthday(getBirthdayByIdCard(s));
                                builder.sex(getSexByIdCard(s));
                                builder.idCard(s);
                                continue;
                            }
                            //最后查名字
                            builder.name(content);
                        }
                        builder.address(address+addressD);
                    }
                    peopleList.add(builder.build());
                }
                return peopleList;
            }else{
                return new ArrayList<>();

            }

    }


    public static LocalDate getBirthdayByIdCard(String idCard){
        String substring = idCard.substring(6, 14);
        return LocalDate.parse(substring,DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String getSexByIdCard(String idCard){
        String substring = idCard.substring(16, 17);
        int i = Integer.parseInt(substring);
        return i%2==1?"男":"女";
    }
    public static String getProvince(String idCard){
        String substring = idCard.substring(0, 2);
        JSONObject data = JSONUtil.parseObj("{\"11\":\"北京市\",\"12\":\"天津市\",\"13\":\"河北省\",\"14\":\"山西省\",\"15\":\"内蒙古自治区\",\"21\":\"辽宁省\",\"22\":\"吉林省\",\"23\":\"黑龙江省\",\"31\":\"上海市\",\"32\":\"江苏省\",\"33\":\"浙江省\",\"34\":\"安徽省\",\"35\":\"福建省\",\"36\":\"江西省\",\"37\":\"山东省\",\"41\":\"河南省\",\"42\":\"湖北省\",\"43\":\"湖南省\",\"44\":\"广东省\",\"45\":\"广西壮族自治区\",\"46\":\"海南省\",\"50\":\"重庆市\",\"51\":\"四川省\",\"52\":\"贵州省\",\"53\":\"云南省\",\"54\":\"西藏自治区\",\"61\":\"陕西省\",\"62\":\"甘肃省\",\"63\":\"青海省\",\"64\":\"宁夏回族自治区\",\"65\":\"新疆维吾尔自治区\",\"71\":\"台湾省\",\"81\":\"香港特别行政区\",\"82\":\"澳门特别行政区\"}\n");
        return data.getStr(substring);
    }

    public static String getNation(String nationStr){
        String a = "蒙古、回、藏、维吾尔、苗、彝、壮、布依、朝鲜、满、侗、瑶、白、土家、哈尼、哈萨克、傣、黎、僳僳、佤、畲、高山、拉祜、水、东乡、纳西、景颇、柯尔克孜、土、达斡尔、仫佬、羌、布朗、撒拉、毛南、仡佬、锡伯、阿昌、普米、塔吉克、怒、乌孜别克、俄罗斯、鄂温克、德昂、保安、裕固、京、塔塔尔、独龙、鄂伦春、赫哲、门巴、珞巴、基诺、汉";
        System.out.println();
        Optional<String> first = Arrays.stream(a.split("、")).filter(nationStr::contains).findFirst();
        return first.orElse("未知");
    }

}
