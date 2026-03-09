/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk membuat class Mobil dengan atribut merk, warna, tahun, dan kecepatan serta memiliki method tampilkanSpesifikasi(), percepat(), dan tampilkanKecepatan()
*/
class Mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("\n");
    }

    void percepat(){
        System.out.println("Mobil dipercepat...");
    }

    void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + "km/jam");
    }   
}

public class Latihan2Pertemuan9 {
   
    public static void main(String[] args) { 
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota Avanza";
        mobil.warna = "Silver";
        mobil.tahun = 2020;

        mobil.tampilkanSpesifikasi();

        mobil.percepat();
        mobil.percepat();

        mobil.tampilkanKecepatan();
    }    
}
