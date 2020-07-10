package practice22;

public class Calculator {
    public static int divide(int x, int y) throws IllegalInputException {
        try {
            return x / y; // <- 0除算したら例外が発生
        } catch (ArithmeticException e) { // <- ここでキャッチ
            throw new IllegalInputException(e); // ArithmeticExceptionをラップして送出する
        }
    }
}
