package tiga;

public class Kendaraan {
    String nama, merek;
    int cc;   
 
    Kendaraan(String nm, String mr, int cc){
        this.nama = nm;
        this.merek = mr;
        this.cc = cc;
    }

    void info(){
        System.out.println(this.merek + " [ "+ this.nama + " ] "+ this.cc );
    }

    double biayaPerj(int bns, double hrg){
        return bns * hrg;
    }
}

