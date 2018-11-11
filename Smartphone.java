import java.util.Scanner;
public class Smartphone {
    public static void spesifikasi (int a) {
        switch (a) {
            case 1:
            System.out.println("Merk : Oppo F9");
            System.out.println("Kapasitas : 64GB");
            System.out.println("Warna : Biru");
            System.out.println("Berat : 500 Gram");
            System.out.println("Prosesor: Mediatek");
            System.out.println("Harga : Rp3.960.000");
            break;
            case 2:
            System.out.println("Merk : Oppo A3S");
            System.out.println("Kapasitas : 16GB");
            System.out.println("Warna : Merah");
            System.out.println("Berat :153 Gram");
            System.out.println("Prosesor : Mediatek");
            System.out.println("Harga : Rp1.900.000");
            break;
            case 3:
            System.out.println("Merk : Oppo F7");
            System.out.println("Kapasitas : 64GB");
            System.out.println("Warna : Hitam");
            System.out.println("Berat : 500 Gram");
            System.out.println("Prosesor : Mediatek");
            System.out.println("Harga : Rp3.499.000");
            break;
        }  
    }
    
    public static void main (String[] args){
    Smartphone input = new Smartphone();
    Scanner in = new Scanner(System.in);
    System.out.println("Data Smartphone");
    System.out.println("1.Oppo F9");
    System.out.println("2. Oppo A3S");
    System.out.println("3. Oppo F7");
    System.out.println("Masukan Kode : ");
    int a = in.nextInt();
    input.spesifikasi(a);
    }
}