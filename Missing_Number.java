import java.util.*;

public class demo{

  public static int missingnum(int x[], int size){

    int count = 0;
    for(int i =1; i<=size; i++){
      count +=i;
    }
    int count1 = 0;
    for (int j = 0; j<size; j++){
      count1 +=x[j];
    }
    int result =count-count1;
    return result;
  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int arrsize = sc.nextInt();
    int[] arr = new int[arrsize];

    for(int i =1; i<arrsize; i++){
      arr[i] = sc.nextInt();
    }

    int result = missingnum(arr,arrsize);
    System.out.println(result);
  }
}