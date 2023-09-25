// package 2;
package dua;

public class Kendaraan {
    String nama, merek;
    int cc;

    void info(){
        System.out.println(this.merek + " [ "+ this.nama + " ] "+ this.cc );
    }

    double biayaPerj(int bns, double hrg){
        return bns * hrg;
    }
}