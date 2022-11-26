package abstrak;

public class Persegi extends bangunDatar{

    private float panjang;
    private float lebar;

    public Persegi(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override

    public void gambar(){
        System.out.println("gambar persegi");
    }

    @Override
    public float luas(){
        return this.panjang * this.lebar;
    }
    

}
