
public class measurement {

    public static int measurement() {

        int res = (int) (Math.random() * 3);
        if (res == 0) {
            res = -1;
           // throw new IllegalArgumentException();
        } else {
            res = res;
        }
        return res;
    }
    public static int[] measurementSeries(int n) {
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        if (measurement() == -1) {
            result[i] = -1;
            throw new IllegalArgumentException();
        }
        else {
            result[i] = measurement();
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
