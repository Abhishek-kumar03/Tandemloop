import java.util.Scanner;
class Calculator{
    void calculate(double a,double b,String operation){
        System.out.println(operation);
        if(operation.equalsIgnoreCase("addition")){
            System.out.println("Result :"+(a+b));
        }else if(operation.equalsIgnoreCase("subtraction")){
            System.out.println("Result :"+(a-b));
        }else if(operation.equalsIgnoreCase("division")){
            if(b==0){
                System.out.println("Denominator never be Zero");
            }else{
                System.out.println("Result :"+(a/b));
            }
        }else if(operation.equalsIgnoreCase("multiplication")){
            System.out.println("Result :"+(a*b));
        }else{
            System.out.println("Invalid Operation");
        }
    }
}

class Program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();

        System.out.println("Enter Value to a ");
        double a=sc.nextDouble();
        System.out.println("Enter Value to b ");
        double b=sc.nextDouble();
        System.out.println("Enter the Operation to do ");
        String operation=sc.next();

        calculator.calculate(a,b,operation);
    }
}