package u9;

public class CountN {
    public int findNAndCount(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='N'){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountN countN = new CountN();
        int result = countN.findNAndCount("N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',N'',");
        System.out.println(result);
    }
}
