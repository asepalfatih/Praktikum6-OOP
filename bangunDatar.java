package abstrak;

public abstract class bangunDatar {
    String warna;

    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return this.warna;
    }

    

    public abstract void gambar();
    public abstract float luas();
    
}
