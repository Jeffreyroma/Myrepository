package my.task.hw9;

public class Calculator  {

    public static <T extends Number>void sum(T num1, T num2) {
        System.out.print("Result sum method: ");
        System.out.println(num1.doubleValue() + num2.shortValue());
    }

    public static <T extends Number>void multiply(T num1, T num2) {
        System.out.print("Result multiply method: ");
        System.out.println(num1.doubleValue() * num2.shortValue());
    }

    public static <T extends Number>void divide(T num1, T num2) {
        System.out.print("Result divide method: ");
        System.out.println(num1.doubleValue() / num2.shortValue());
    }

    public static <T extends Number>void subtraction(T num1, T num2) {
        System.out.print("Result subtraction method: ");
        System.out.println(num1.doubleValue() - num2.intValue());
    }
}
