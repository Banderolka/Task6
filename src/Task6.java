import java.io.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа" );
        double number1 = Double.parseDouble(reader.readLine());
        double number2 = Double.parseDouble(reader.readLine());
        double number3 = Double.parseDouble(reader.readLine());
        findingArithmeticMean(number1, number2, number3);
    }
    static void findingArithmeticMean (double a, double b, double c){
        double x =  (a + b + c)/3.0;
        System.out.println("Среднее арифметическое равно: " + x);
        int y = (int) (x/2);
        if (y > 3 ){
            System.out.println("Программа выполнена корректно");
        }
    }
}
