import java.util.Scanner;

class hello {
    public static void main(String[] args) {
      Scanner input  = new Scanner(System.in);
      float input1 = input.nextInt();
      float input2 = input.nextInt();
      float input3 = input.nextInt();
      float semi_perimeter = (input1 + input2 + input3 )/ 2;
      float first = semi_perimeter - input1;
      float second = semi_perimeter - input2;
      float third = semi_perimeter - input3;
      float three_results = first * second * third;
      float perimeter = semi_perimeter * three_results;
      double sqrt = Math.sqrt(perimeter);
      System.out.printf("%.2f", sqrt );
      

      input.close();
    }
}