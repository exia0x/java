/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk membuat class Buku dengan 2 constructor (overloading)
*/

class Buku{
    String judul;
    String pengarang;
    int harga;

    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public Buku(){
        this.judul = "Belum diisi";
        this.pengarang = "Belum diisi";
        this.harga = 0;
    }

    void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga : Rp " + harga);
        System.out.println("\n");

    }
}
    
public class LatihanBukuConstructor {
    public static void main(String[] args) { 
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }    
}
