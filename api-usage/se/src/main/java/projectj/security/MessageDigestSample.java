package projectj.security;

import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @author Yale
 */
public class MessageDigestSample {

    public static void main(String[] args) {
        // 生成MessageDigest使用SHA-256的demo
//        hashing();
//        coding();
        aesEncryptAndDecrypt();
    }


    public static void coding() {
        String input = "Lucy";
        System.out.println(Base64.getEncoder().encodeToString(input.getBytes()));
    }

    // 散列
    public static void hashing() {
        try {
            // 创建 SHA-256/MD5 消息摘要对象
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 输入数据
            String input = "Hello, World!";

            // 将字符串转换为字节数组并更新摘要对象
            digest.update(input.getBytes(StandardCharsets.UTF_8));

            // 计算摘要
            byte[] hash = digest.digest();

            // 打印 Base64 编码后的摘要
            System.out.println("SHA-256 hash: " + Base64.getEncoder().encodeToString(hash));
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Digest algorithm not found.");
            e.printStackTrace();
        }
    }

    /**
     * AES加密
     */
    public static void aesEncryptAndDecrypt() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey pk = keyGenerator.generateKey();
            String painText = "Hello World!";
            String encryptStr = aesEncrypt(painText, pk);
            System.out.println("Encrypted Text: " + encryptStr);

            String decryptData = aesDecrypt(encryptStr, pk);
            System.out.println("Decrypted Data: " + decryptData );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String aesEncrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptData = cipher.doFinal(plainText.getBytes((StandardCharsets.UTF_8)));
        return Base64.getEncoder().encodeToString(encryptData);
    }

    public static String aesDecrypt(String encryptedText, SecretKey key) throws Exception {
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptData = cipher.doFinal(encryptedBytes);
        return new String(decryptData, StandardCharsets.UTF_8);
    }

    /**
     * RSA加密解密
     */

    public static void rsaEncryptAndDecrypt() {
        try {

        } catch (Exception e) {

        }
    }

    public static String generateSignature() {
        return null;
    }

    public static boolean verifySignature() {
        return false;
    }

}
