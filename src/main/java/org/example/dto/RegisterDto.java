package org.example.dto;

import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class RegisterDto {

    private String emailAddress;
    private String password;

    private StudentDto studentDto;

    //AES ENCRYPTED
    private static final String AES_ALGORITHM="AES";
    private static final String MY_SECRET_KEY ="MY_SECRET_AES_KEY";

    public RegisterDto(StudentDto studentDto, String password, String emailAddress) {
        this.studentDto = studentDto;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    //method
    //şifreleme
    private static String encryptPassword(String password) {
        try {
            SecretKey key = (SecretKey) generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            //return new String(encryptedBytes, StandardCharsets.UTF_8); // 1.YOL
            return Base64.getEncoder().encodeToString(encryptedBytes); // 2.YOL
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed", exception);
        }
    }

    //AES sifre cozme;
    public static String deEncryptoPassword(String encryptoPassword) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        try {
            SecretKey key = (SecretKey) generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] decryptoBytes = cipher.doFinal(Base64.getDecoder().decode(encryptoPassword));
            return new String(decryptoBytes, StandardCharsets.UTF_8);
        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Ecryption Failed",exception);

        }
    }

    //anahtar
    private static Key generateKey()   {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            return keyGenerator.generateKey();
        }catch (NoSuchAlgorithmException exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }

    }
    //toString

    @Override
    public String toString() {
        return "RegisterDto{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", studentDto=" + studentDto +
                '}';
    }


    //getter setter

    public StudentDto getStudentDto() {
        return studentDto;
    }

    public void setStudentDto(StudentDto studentDto) {
        this.studentDto = studentDto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
