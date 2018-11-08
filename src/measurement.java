/**
* @Author: Jiehang CAO
* @Description:
* @Date: 2:08 PM 2018/11/7
*/
public class measurement {

    /**
     * original problem: when program throws exception,it will stop running.
     * solution: use try catch , catch the exception and return the value you want to store.
     * @return
     */
    public static int measurement() {
        try {
            int res = (int) (Math.random() * 3);
            if (res == 0) {
                throw new IllegalArgumentException();
            } else {
                res = res;
            }
            return res;
        }catch (IllegalArgumentException e) {
            return -1;
        }

    }

    /**
     * try catch block in the loop
     * @param n
     * @return
     */
    public static int[] measurementSeries(int n) {
    int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                {
                    if (measurement() == -1) {
                        throw new IllegalArgumentException();
                    } else {
                        result[i] = measurement();
                    }
                }
            } catch (IllegalArgumentException l) {
                result[i] = -1;
            }
        }
    return result;
    }


public static void main(String[] args) {
       for(int a :measurementSeries(10)) {
           System.out.println(a);
       }

}


}
