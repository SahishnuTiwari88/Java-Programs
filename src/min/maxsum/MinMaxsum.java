/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min.maxsum;

/**
 *
 * @author Sahishnu
 */


    /**a=[1,2,3,4,5]
 *Minsum starts from index 0 to 4 i.e. 1+2+3+4=10;
 * Maxsum=2+3+4+5=14 i.e. we have to find overall Minimum sum & Maximum sum
 * @author Sahishnu
 */
import java.util.*;
  public class MinMaxsum {  

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
       long  sum=0,s=0;int j,i,temp;
for(i=0;i<=4;i++){
     j=i;
     while(j>0 && (arr[j]<arr[j-1])){
         temp=arr[j];
         arr[j]=arr[j-1];
         arr[j-1]=temp;
         j--;
     }
}
for(i=1;i<5;i++){
  System.out.println(+arr[i]);
  }
  

 
for( i=0;i<4;i++){
      sum=sum+arr[i];}
     for(i=1;i<=4;i++){
     s=s+arr[i];}
     System.out.println(+sum+" "+s);   
}
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
System.out.println("Enter the terms");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

