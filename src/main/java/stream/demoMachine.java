package stream;

import java.util.Scanner;

public class demoMachine {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    int total=0;
    System.out.println("Please vote "+"\n For A Press 1:"+"\n For B Press 2:"+"\n For C Press 3:");
    while(sc.hasNextInt()){
        Integer count=sc.nextInt();

        total++;
        switch (count) {
            case 1: a++;
                
                break;
                case 2: b++;
                
                break;
                case 3: c++;
                
                break;
        
            default:d++;
                break;
        }
    }
  System.out.println("Total Vote count:" +total);
  //System.out.println("Do you want me to show result");
  //if(sc.hasNext()){
  //String ans=sc.next();
  //while(ans.toLowerCase().equals("yes")){
    c=c+a%10+b%10;
    b=b-b%10;
    a=a-a%10;
    System.out.println("A got the vote "+a);
    System.out.println("B got the vote "+b);
    System.out.println("C got the vote "+c);
    System.out.println("Nota got the vote "+d);
    
  //}  
//}
}
}
