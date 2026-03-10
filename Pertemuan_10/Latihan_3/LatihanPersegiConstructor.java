/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk membuat class Persegi dengan constructor dan validasi input
*/
class Persegi{
    int sisi;
    int luas;
    int keliling;

    public Persegi(int sisi){
        if (sisi <= 0){
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        }
        else{
            this.sisi = sisi;
        }

        this.keliling = sisi*4;
        this.luas = sisi*sisi;
    }

    void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println("\n");
    }
}  

public class LatihanPersegiConstructor {
    public static void main(String[] args) { 
        Persegi persegi1 = new Persegi(5);
        persegi1.tampilkanHasil(); 
        
        Persegi persegi2 = new Persegi(0);
        persegi2.tampilkanHasil(); 
        
    }    
}
