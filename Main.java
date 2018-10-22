package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        nilaiMhs.setNilaiQuis(75);
        nilaiMhs.setNilaiUts(45);
        nilaiMhs.setNilaiUas(34);
        System.out.println("QUIZ \t\t= "+nilaiMhs.getNilaiQuis());
        System.out.println("UTS \t\t= "+nilaiMhs.getNilaiUts());
        System.out.println("UAS \t\t= "+nilaiMhs.getNilaiUas());
        System.out.println("");
        System.out.println("Nilai Akhir \t= "+nilaiMhs.nilaiAkhir
                (nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),nilaiMhs.getNilaiUas()));
        System.out.println("");
        System.out.println("Index \t= "+nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas())));

        System.out.println("Keterangan = "+nilaiMhs.keterangan
                (nilaiMhs.index(nilaiMhs.nilaiAkhir(
                        nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                        nilaiMhs.getNilaiUas()))));

    }
}
