package uc;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class SignIdAndKey {
    public static void main(String[] args) throws Exception {
        //http://60.30.84.70:8002/tms/back-bill?timeStamp=1699543669069&sign=bOoK8dWiGvQpXbvUDeZTPw==  你们可以拿这个模拟测试
        StringBuilder sb = new StringBuilder();

        sb.append("swtj");
        sb.append("293cee69-5921-4414-86af-c9334c9dbc93");
        sb.append(1699543669069L);
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(sb.toString().getBytes(StandardCharsets.UTF_8));
        byte[] digest = md.digest();
        String encodedString = Base64.getEncoder().encodeToString(digest);
        System.out.println(encodedString);
    }
}
