import java.util.ArrayList;
import java.util.List;

/**
* @Author: Jiehang CAO
* @Description:
* @Date: 4:06 PM 2018/10/27
*/
public class InsertionSort {
      public static void main(String[] args) {
          /**
           * test for insertion sort.
           */
          int[] a = {4,6,1,3,2,8,7};
          for(int  b:insertionSort(a)) {
              System.out.print(b+",");
          }
      }

    /***
     * implements for insertion sort
     * compare number[k] and number[k-1],if number[k-1] > number[k],exchange the location.
     * @param numbers
     * @return
     */
      public static int[] insertionSort(int[] numbers) {

          int i = numbers.length;

          for(int j =0;j<i-1;j++) {
              for (int k = j + 1; k > 0; k--) {
                  if (numbers[k - 1] > numbers[k]) {
                      int temp = numbers[k - 1];
                      numbers[k - 1] = numbers[k];
                      numbers[k] = temp;

                  }
              }
          }
          return numbers;

      }


}
