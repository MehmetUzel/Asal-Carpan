import java.util.ArrayList;
import java.util.List;

public class asal {


//asalcarpan fonksiyonu girilen sayıyı sırasıyla doğal sayılara bölüp eğer sayı onu tam bölüyorsa
//onu listenin içine atıp sayıyı o asal çarpana bölüp bu işleme devam edşyor ve onun asal çarpanlarını veriyor.

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
            System.out.println("Primefactors of 155");
            for (Integer integer : asalcarpan(155)) {
                System.out.println(integer);
            }
            System.out.println("Primefactors of 6");
            for (Integer integer : asalcarpan(6)) {
                System.out.println(integer);
            }
            System.out.println("Primefactors of 32");
            for (Integer integer : asalcarpan(32)) {
                System.out.println(integer);
            }
        }
    }

