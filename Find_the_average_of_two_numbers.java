import java.util.Scanner;

class hello {
    public static void main(String[] args) {

      
      Scanner input  = new Scanner(System.in);
      float num1 = input.nextInt();
      float num2 = input.nextInt();
      float total = (num1 + num2);
      double result = total/2;

      System.out.printf("%.4f",result);




    }

}