package javaapplication5cur;
import java.util.Scanner;

public class JavaApplication5cur {

   
    public static void main(String[] args) {
    Scanner zxc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int N = zxc.nextInt();
        int ary[] = new int[N];
        for (int i=0; i<N; i++){
            ary[i]=i;
            System.out.print(ary[i]+", ");
        }
        
        System.out.println(" ");
        for (int i=10; i<N; i++){
            int a=ary[i];
            int b = a;
            int c = 0;
            while (b>0) {
                c=c*10+b%10;
                b=b/10;
            }
            if (c==a){
            System.out.println("Палиндром: " +ary[i]);}
            
            
        }
    }
    
}
