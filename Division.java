import java.util.Scanner;

class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 / number2);
        scanner.close();
    }
}