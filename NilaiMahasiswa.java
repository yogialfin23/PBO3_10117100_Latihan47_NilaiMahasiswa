package com.company;

public class NilaiMahasiswa {
    private double nilaiQuis;
    private double nilaiUts;
    private double nilaiUas;

    public double getNilaiQuis() {
        return nilaiQuis;
    }

    public void setNilaiQuis(double nilaQuis) {
        this.nilaiQuis = nilaQuis;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double nilaiAkhir(double nilaiQuis, double nilaiUts, double nilaiUas){

        double NA = 20*nilaiQuis/100 + 30*nilaiUts/100 + 50*nilaiUas/100;
        return NA;
    }
    public char index(double NA){
        char idx;
        if((NA >= 80) && (NA<= 100)){
            idx ='A';
        } else if ((NA >=68) && (NA<=80)){
            idx = 'B';
        } else if ((NA>=56)&&(NA<=68)){
            idx ='C';
        }else if((NA>=45)&&(NA<=56)){
            idx='D';
        }

        else{
            idx = 'E';
        }
        return idx;
    }
    public String keterangan(char idx){
        String ket;
        switch (idx) {
            case 'A':
                ket = "SANGAT BAIK";
                break;
            case 'B':
                ket ="BAIK";
                break;
            case 'C':
                ket ="CUKUP";
                break;
            case 'D':
                ket ="KURANG";
                break;
            case 'E':
                ket = "SANGAT KURANG";
                break;

            default:
                ket = "Tidak terdeteksi ";
                break;
        }
        return ket;
    }
}
