package javaapplication2cur;
import java.util.Scanner;


public class JavaApplication2cur {

    
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число 1: ");
        int a = sc.nextInt(); int c = a;
        System.out.println("Введите целое число 2: ");
        int b = sc.nextInt(); int d = b;
        
        while (a!= b) {
            if (a > b) {
                a=a-b;
            }
                else b=b-a;    
        }
    
    
        System.out.println("НОД=" +a); 
        System.out.println("НОК=" +(c*d/a));
    } catch (Exception e) {
        System.out.println("Ошибка. Введено не целое число");
    }
        
    }
}
 
     
      
 
    
