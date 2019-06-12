import java.util.Random;
public class Array {
   public static void main(String[] args) {
      Random ran = new Random(); 
      int[] arr = new int[20];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = ran.nextInt();
         System.out.println(arr[i]); 
      }
   }
}
