package abstrak;

public class utama {
    public static void main(String[] args) {
        bangunDatar luas1 = new Lingkaran(20);

        bangunDatar luas2 = new Segitiga(5, 10);

        bangunDatar luas3 = new Persegi(50, 50);

        luas1.gambar();
        luas2.gambar();
        luas3.gambar();

        System.out.println("Luas Lingkaran : " + luas1.luas());
        System.out.println("Luas Segitiga : " + luas2.luas());
        System.out.println("Luas Persegi : " + luas3.luas());
    }
}
