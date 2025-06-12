import java.util.Scanner;

public class Main{
    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();

        System.out.print("Введите действие (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) 
                    result = num1 / num2;
                else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}


