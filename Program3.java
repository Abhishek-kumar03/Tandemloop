import java.util.Scanner;
class Program3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a%2!=0){
            int num=1;
        for(int i=1;i<=a;i++){
            System.out.print(num+"\t");
            num+=2;
        }
        }else{
            int num=1;
            a-=1;
            for(int i=1;i<=a;i++){
            System.out.print(num+"\t");
            num+=2;
        }
        }
    }
}