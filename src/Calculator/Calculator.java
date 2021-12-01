package Calculator;
/*Написать простейший калькулятор – консольное приложение(реализовать как минимум 4 операции:
сложение, вычитание, умножение, деление) с вводом\выводом значений\результатов;*/
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter operation: ");
        String operation = sc.next();
        switch (operation){
            case "*":
                double result = a * b;
                System.out.println(result);
                break;
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            default:
                result = a / b;
                System.out.println(result);
                break;
        }
    }
}