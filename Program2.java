import java.util.Scanner;
class Program2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int num=1;
        for(int i=1;i<=a;i++){
            System.out.print(num+"\t");
            num+=2;
        }
    }
}