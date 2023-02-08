import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Mec mecA = new Mec("A");
Mec mecB = new Mec("b");
Mec mecC = new Mec("C");
Thread thread1 = new Thread(mecA);
Thread thread2 = new Thread(mecB);
Thread thread3 = new Thread(mecC);
        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}