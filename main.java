import java.util.*;

public class main{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String str1 = sc.next();
    //    sc.next();
       String str2 = sc.next();
    //    int count = 0;
    //    if(str1.length()!=str2.length()){
    //     System.out.println("False");
    //    }
    //    else{
    //     char[] arr1 = str1.toCharArray();
    //     char[] arr2 = str2.toCharArray();
    //     int check = 0;
    //     for(char ch1:arr1){
    //         for(char ch2 : arr2 ){
    //             if(ch1==ch2){
    //                 count++;
    //             }
    //         }
            
    //     }
    //     if(count==str1.length()){
    //         System.out.println(true);
    //        }
    //        else{
    //         System.out.println(false);
    //        }
    //    }

    Map<Character,Integer> nm = new HashMap<Character,Integer>();

    for(char c:str1.toCharArray()){
        if(nm.containsKey(c)){
            nm.put(c,nm.get(c)+1);
        }
        else{
            nm.put(c, 1);
        }
    }

    for(char c: str2.toCharArray()){
        if(nm.containsKey(c)){
            nm.put(c,nm.get(c)-1);
        }
        else{
            System.out.println("Not Anagram");
            System.exit(0);
        }
    }

    for(char ch:nm.keySet()){
        if(nm.get(ch)!=0){
            System.out.println("Not Anagram");
            System.exit(0);
        }
    }
    System.out.println("Anagram");
       
 }
}