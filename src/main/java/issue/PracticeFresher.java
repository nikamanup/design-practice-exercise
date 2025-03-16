package issue;

import java.util.ArrayList;
import java.util.List;

public class PracticeFresher {
    public static void main(String[] args) {
        System.out.println(revString("ABB"));

        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int[] direction:directions){
        System.out.println("direction::"+direction[0]);
        System.out.println("direction::"+direction[1]);
    }
        System.out.println("new:::::::"+reString1("anup"));
        evenAndOdd(25);
        primeNumber(7);
        int num=2;
        int multiply=num<<2;
        System.out.println("multiply:"+multiply);
        int[] numArray={3,4,5};
        System.out.println("sum::::"+generateSubsetSum(numArray));

    }

    static List<Integer> generateSubsetSum(int[] nums){
        List<Integer> sums=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!= 0){
                    sum+=nums[j];
                }
            }
            sums.add(sum);
        }
    return sums;
    }
    static String revString(String inputString){
     String str="";
     for(int i=inputString.length()-1;i>=0;i--){
        str=str+inputString.charAt(i);

     }

     if(inputString.equals(str)){
        System.out.println("::::::Palimdrome");
     }else{
        System.out.println("Not Palimdrome");
     }
     return str;
    }
    static String reString1(String iString){
        StringBuffer sb=new StringBuffer(iString);
        return sb.reverse().toString();
    }

    static void evenAndOdd(Integer number){
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("ODD");
        }
    }

    static void primeNumber(Integer number){
        int count=0;
        for(int i=1;i<=number;i++){
        if(number%i==0){
            count++;
        }
    }
    
    if(count==2){
        System.out.println(":::::Prime Number");
    }else{
        System.out.println("not prime number");
    }
}
static palimdromNumber(Integer number){
    
}

    
}
