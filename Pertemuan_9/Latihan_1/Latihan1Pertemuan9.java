/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk menyimpan data attribut di sebuah objek dan mengeluarkannya menggunakan method
*/
class Buku{
    String judul;
    String pengarang;
    int harga;

    void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga : Rp" + harga);
        System.out.println("\n");

    }
}
    


public class Latihan1Pertemuan9 {
   
    public static void main(String[] args) { 
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;
    
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;
        
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }    
}
