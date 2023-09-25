package dua;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Fiesta";
        mobil.merek = "Ford";
        mobil.cc = 2400;

        System.out.println( mobil.biayaPerj(12, 12500)); 
        mobil.info();
    }
}
