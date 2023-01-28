import java.util.Scanner;

class hello {
    public static void main(String[] args) {

      
      Scanner input  = new Scanner(System.in);
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double total = (num1 * num2);

      System.out.printf("%.2f",total);




    }

}