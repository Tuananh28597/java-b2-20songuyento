
import java.util.Scanner;
public class hienthi100snt {


    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if(check(i)){
                System.out.println(i+"");
            }
        }
    }

    public static boolean check(int n) {   //ham check dieu kien snt, kieu boolean
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

}
