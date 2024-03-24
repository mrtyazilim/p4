import java.util.Scanner;
import java.security.SecureRandom;

public class PasswordMaker {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("Şifre uzunluğunuz kaç haneli olsun? ");
            int number=kb.nextInt();
            System.out.println("Şifreniz büyük harf içersin mi? -e-h" );
            boolean isUpperCase = kb.next().equalsIgnoreCase("E");
            System.out.println("Şifreniz küçük harf içersin mi? -e-h" );
            boolean isLowerCase = kb.next().equalsIgnoreCase("E");
            System.out.println("Şifreniz özel karater içersin mi? -e-h" );
            boolean isSpecialChars = kb.next().equalsIgnoreCase("E");
            System.out.println("Şifreniz rakam içersin mi? -e-h" );
            boolean isNumber = kb.next().equalsIgnoreCase("E");
            System.out.println(passwordGenerater( number, isUpperCase, isLowerCase, isSpecialChars, isNumber));
            System.out.println("Şifreniz hoşunuza gitti mi? -e-h" );
            boolean isGood = kb.next().equalsIgnoreCase("E");
            if (isGood) {
                break;
            }
        }
    }
    public static String passwordGenerater( int number,boolean isUpperCase,boolean isLowerCase,boolean isSpecialChars, boolean isNumber){

        StringBuilder chars=new StringBuilder();
        SecureRandom random=new SecureRandom();
        StringBuilder password=new StringBuilder();
        String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String NUMS = "1234567890";
        String SPECIAL = "!@#$%&*()./\\<>?_+{}";

        if (isUpperCase) {
            chars.append(UPPER_CASE);
        }
        if (isLowerCase) {
            chars.append(LOWER_CASE);
        }
        if (isNumber) {
            chars.append(NUMS);
        }
        if (isSpecialChars) {
            chars.append(SPECIAL);
        }

        for (int i = 0; i < number ; i++) {
            int index = random.nextInt(chars.length());
            char selectedChar=chars.charAt(index);
            password.append(selectedChar);
        }
        return password.toString();
    }

    
}
