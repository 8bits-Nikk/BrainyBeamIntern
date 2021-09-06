package Day13_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidName(String name){
        if(name.isEmpty()){
            System.out.println("Name require for registration.");
            return false;
        }else return true;
    }

    public static boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        if(!(matcher.find() && matcher.group().equals(email))){
            System.out.println("Not Valid Email");
            return false;
        }else return true;
    }

    public static boolean isValidPassword(String password, String cPassword){
        if(password.isEmpty() || cPassword.isEmpty() || !password.equals(cPassword)){
            System.out.println("Password Not Matched");
            return false;
        }else return true;

    }

    public static boolean isValidPassword(String password){
        if(password.isEmpty()){
            System.out.println("Password Can't be Empty.");
            return false;
        }else return true;
    }

    public static boolean isValidMoNumber(String moNumber){
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(moNumber);
        if(!(matcher.find() && matcher.group().equals(moNumber))){
            System.out.println("Not Valid Mobile Number..");
            return false;
        }else return true;
    }
}
