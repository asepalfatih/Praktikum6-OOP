package abstrak;

public class Segitiga extends bangunDatar {

    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar(){
        System.out.println("gambar segitiga");
    }

    @Override
    public float luas(){
        return this.alas * this.tinggi * 1/5;
    }
    
}
