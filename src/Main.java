import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//input area for user to get N number.
        System.out.print("N Sayısını Giriniz: ");
int n = input.nextInt();

//adding double to get exact number and adding formula to get result phase.
double result = 0.0;
for (double i = 1; i<= n; i++){
    result += (1/i);
}
//final result output.
        System.out.println(result);

    }
}