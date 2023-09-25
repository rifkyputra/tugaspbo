package tiga;

public class MainKendaraan {
    public static void main(String[] args) {        
        Kendaraan mobil = new Kendaraan("Cross Country", "Volvo", 2000);
        
        mobil.info();
        System.out.println( mobil.biayaPerj(12, 12500)); 
    }
}