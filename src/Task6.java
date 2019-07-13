import java.io.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа" );
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        findingArithmeticMean(number1, number2, number3);
    }
    static void findingArithmeticMean (int a, int b, int c){
        double x =  (a + b + c)/3;
        System.out.println("Среднее арифметическое равно: " + x);
        int y = (int) (x/2);
        if (y > 3 ){
            System.out.println("Программа выполнена корректно");
        }
    }
}
