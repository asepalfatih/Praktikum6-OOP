# Praktikum6-OOP

1. membuat abstrack class dengan nama bangunDatar dengan variabel warna yang bertipe data String, membuat method abstarct gambar dan method abstract luas
untuk diwarisi ke subclass diantaranya Lingkaran, segitiga, dan persegi. didalam kedua method abstract tersebut tidak diberikan nilai dan akan di berikan nilai di kelas turunan atau subclass

2. class lingkaran mengextends kepada class abstraact bangundatar terdapat variabel r yang bersifat private dengan tipe data int, lalu membuat contructor dengan parameter int r dengan nilai this.r = r, lalu override method gambar yang telah dibuat di abstract class bangunDatar 
kepada file lingkaran, dan override method luas pada class lingkaran dengan mengisikan nilai return (Math.PI * r * r) math.PI dapat dipanggil ketika telah memanggil import java.lang.math

3. class SEgitiga mengextends kepada class abstraact bangundatar terdapat variabel alas dan tinggi yang bersifat private dengan tipe data int, lalu membuat contructor dengan parameter int alas dan int tinggi dengan nilai this.alas = alas dan this.tinggi = tinggi, lalu override method gambar yang telah dibuat di abstract class bangunDatar 
kepada class segitiga, dan override method luas pada class segitiga dengan mengisikan nilai return this.alas * this.tinggi * 1/2

4. class Persegi mengextends kepada class abstraact bangundatar terdapat variabel tinggi dan lebar yang bersifat private dengan tipe data float, lalu membuat contructor dengan parameter float tinggi dan float lebar dengan nilai this.tinggi = tinggi dan this.lebar = lebar, lalu override method gambar yang telah dibuat di abstract class bangunDatar 
kepada class segitiga, dan override method luas pada class persegi dengan mengisikan nilai return this.tinggi * this.lebar



 


![praktikum6](https://user-images.githubusercontent.com/115930300/204088395-2153972e-f696-47d2-9926-389851eeb6bb.png)
