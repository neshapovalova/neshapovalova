package javaapplication3cur;
import java.util.Scanner;
import java.util.Arrays;
public class JavaApplication3cur {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.println("Введите слова одной строкой через пробел");
            String iq = sc.nextLine();
            int count = 0;
            if(iq.length() != 0){
                count++;
                for (int i = 0; i < iq.length(); i++) {
                    if(iq.charAt(i) == ' '){
                        count++;
                    }
                }
                String[] words = iq.split("\\s+");
                Arrays.sort(words);
                System.out.println("Количество введеных слов: "+count);
                System.out.println("Отсортированные слова: " + Arrays.toString(words));
            }
        String ou = "";//все слова с заглавной буквы.
        String[] words = iq.split(" ");//разделяем на массив из слов
        for(String word:words){
        String first = word.substring(0,1).toUpperCase();
        String all = word.substring(1);
        ou+=first+all+" ";
        }
   System.out.println("Первая буква каждого слова заглавная: " + ou);          
    }
    
}
