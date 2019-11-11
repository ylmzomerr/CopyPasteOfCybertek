import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        getNumbers();

    }
    public static void getNumbers (){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first number");
        int number1 = input.nextInt();
        System.out.println("please enter your second number ");
        int number2 = input.nextInt();
        input.nextLine();
        System.out.println("What kind of operation you want to do");
        String str = input.nextLine();
        switch (str){
            case "+" :
                System.out.println(Sum(number1,number2));
                break;
            case "-" :
                System.out.println(substractionn(number1,number2));
                break;
            case  "/" :
                System.out.println(division(number1,number2));
                break;
            case "*" :
                System.out.println(multiplication(number1,number2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    public static int multiplication(int num1, int num2){

        int multi = num1 * num2;
        return multi;
    }
    public  static  int division(int num1, int num2){

        int divis = num1 / num2;
        return  divis;
    }public static int Sum (int num1, int num2){

        int result =num1+num2;
        return result;
    }

    public static int substractionn(int num1, int num2){
        int result =0;
        result = num1-num2;
        return result;
    }
}
