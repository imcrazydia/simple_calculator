import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner op = new Scanner(System.in);
        System.out.println("Welke operation wil je gebruiken?\n -----------------\noptellen\naftrekken\nvermenigvuldigen\ndelen\nmodulo");
        operation = op.nextLine();

        System.out.println("Typ het eerste cijfer dat je wilt " + operation + ":");
        num1 = op.nextInt();
        System.out.println(num1 + " " + operation + " " + "met ...");
        num2 = op.nextInt();

        if (operation.equals("optellen")) {
            System.out.println(num1 + " " + operation + " " + "met " + num2 + " = " + optellen(num1, num2));
        }
        if (operation.equals("aftrekken")) {
            System.out.println(num1 + " " + operation + " " + "met " + num2 + " = " + aftrekken(num1, num2));
        }
        if (operation.equals("vermenigvuldigen")) {
            System.out.println(num1 + " " + operation + " " + "met " + num2 + " = "  + vermenigvuldigen(num1, num2));
        }
        if (operation.equals("delen")) {
            System.out.println(num1 + " " + operation + " " + "met " + num2 + " = "  + delen(num1, num2));
        }
        if (operation.equals("modulo")) {
            System.out.println(num1 + " " + operation + " " + "met " + num2 + " = "  + modulo(num1, num2));
        }
    }

    public static int optellen(int num1, int num2) {
        int answer;
        answer = num1 + num2;
        return answer;
    }
    public static int aftrekken(int num1, int num2) {
        int answer;
        answer =  num1 - num2;
        return answer;
    }
    public static int vermenigvuldigen(int num1, int num2) {
        int answer;
        answer = num1 * num2;
        return answer;
    }
    public static int delen(int num1, int num2) {
        int answer;
        answer = num1 / num2;
        return answer;
    }
    public static int modulo(int num1, int num2) {
        int answer;
        answer = num1 % num2;
        return answer;
    }



}
