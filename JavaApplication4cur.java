package javaapplication4cur;
import java.util.Scanner;

public class JavaApplication4cur {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String iq = sc.nextLine();
        System.out.println("Введите слово: ");
        String uw = sc.nextLine();  
        int count = 0;
        for (int i = 0; i < iq.length(); i++) {
            if (iq.substring(i, i + uw.length()).equalsIgnoreCase(uw)) {
                count++;
                
                i += uw.length();
            }
        }
        
        System.out.println("Количество слов: " +count);
    }
    
}
