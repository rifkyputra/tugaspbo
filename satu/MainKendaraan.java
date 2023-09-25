package satu;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Fiesta";
        mobil.merek = "Ford";
        mobil.cc = 2400;

        mobil.info();
        mobil.biayaPerj(12, 12500);
        mobil.biayaPerj(3, 10000);
        mobil.biayaPerj(4, 14500);
    }
}
