package year2015;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day04 {

    private static String entrada = "bgvyzdsv";

    public static void main(String[] args) {
        Integer contador = 0;
        String password;
        while(true){
            password = entrada.concat(String.valueOf(contador));
            MessageDigest md5;
            try {
                md5 = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new NoSuchAlgorithmException(e);
            }
            md5.update(StandardCharsets.UTF_8.encode(password));
            if(String.format("%032x", new BigInteger(1, md5.digest())).startsWith("000000")){
                break;
            }
            contador++;
        }
        System.out.println(contador);
    }
}
