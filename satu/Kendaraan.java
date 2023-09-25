package satu;

public class Kendaraan {
    String nama, merek;
    int cc;   

    void info(){
        System.out.println(this.merek + " [ "+ this.nama + " ] "+ this.cc );
    }

    void biayaPerj(int bns, double hrg){
        System.out.println("Biaya: "+ bns * hrg);

        // int bensin = bns;
        // double harga = hrg;
        // System.out.println("Biaya: "+ bensin * harga);
    }
}