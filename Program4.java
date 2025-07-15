import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Program4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array Element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> dict=new HashMap<>();
        for(int i=1;i<=9;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]%i==0){
                    count++;
                }
            }
            dict.put(i,count);
        }
        System.out.println(dict);
    }
}