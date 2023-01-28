import java.util.Scanner;

class hello {
    public static void main(String[] args) {

      double pi = 3.14;
      Scanner input  = new Scanner(System.in);
      int radius = input.nextInt();
      double result = pi * (radius * radius);

      System.out.println(result);




    }

}