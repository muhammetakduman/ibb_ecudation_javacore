package org.example.dto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class RegisterDto {

    private String emailAddress;
    private String password;

    private StudentDto studentDto;

    //AES ENCRYPTED
    private static final String ARS_ALGORITHM="AES";
    private static final String MY_SECRET_KEY ="MY_SECRET_AES_KEY";

    public RegisterDto(StudentDto studentDto, String password, String emailAddress) {
        this.studentDto = studentDto;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    //method
    //şifreleme
    private static String encrypto(String data){
        try{
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE,generateKey());

        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }

    }
    //anahtar
    private static Key generateKey()   {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }

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
