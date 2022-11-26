package abstrak;

import java.lang.Math;

public class Lingkaran extends bangunDatar{

    private int r;

    public Lingkaran(int r){
        this.r = r;
    }

    @Override
    public void gambar(){
        System.out.println("Gambar Lingkaran");
    }

    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
}
