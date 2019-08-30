import java.util.ArrayList;
import java.util.List;

public class asal {


//asalcarpan fonksiyonu girilen sayıyı sırasıyla sayının kendisine kadar olan doğal sayılara bölüp eğer sayı onu tam bölüyorsa
//onu listenin içine atıp sayıyı o asal çarpana bölüp bu işleme devam ediyor ve onun asal çarpanlarını veriyor.

        public static List<Integer> asalcarpan(int number) {
            int n = number;
            List<Integer> carpan = new ArrayList<Integer>();
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    carpan.add(i);
                    n /= i;
                }
            }
            return carpan;
        }

        public static void main(String[] args) {
            System.out.println("155'in asal çarpanları :");
            for (Integer integer : asalcarpan(155)) {
                System.out.println(integer);
            }
            System.out.println("6'nın asal çarpanları :");
            for (Integer integer : asalcarpan(6)) {
                System.out.println(integer);
            }
            System.out.println("32'nin asal çarpanları :");
            for (Integer integer : asalcarpan(32)) {
                System.out.println(integer);
            }
        }
    }

