import java.util.*;

public class main{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String str1 = sc.next();
    //    sc.next();
       String str2 = sc.next();
       int count = 0;
       if(str1.length()!=str2.length()){
        System.out.println("False");
       }
       else{
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        for(char ch1:arr1){
            for(char ch2 : arr2 ){
                if(ch1==ch2){
                    count++;
                }
            }
        }
        if(count==str1.length()){
            System.out.println(true);
           }
           else{
            System.out.println(false);
           }
       }

       
    }
}