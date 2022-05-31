/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briku;

// kelas kepala cabang
public class KepalaCabang extends Nasabah { // kamus kepala cabang
    int idKelapaCabang;
    String namaKepalaCabang;
    int idNasabah;
    String Pencairan;

    public void setIdKelapaCabang(int idKelapaCabang) {  // isi fungsi id kepala cabang
        this.idKelapaCabang = idKelapaCabang;
    }

    public void setNamaKepalaCabang(String namaKepalaCabang) {  // isi fungsi nama kepala cabang
        this.namaKepalaCabang = namaKepalaCabang;
    }

    @Override
    public void setIdNasabah(int idNasabah) { // isi fungsi idnasabah
        this.idNasabah = idNasabah;
    }

    public void setPencairan(String Pencairan) { // isi fungsi pencairan
        this.Pencairan = Pencairan;
    }

    public int getIdKelapaCabang() {  // menampilkan id kepala cabang
        return idKelapaCabang;
    }

    public String getNamaKepalaCabang() { // menampilkan nama kepala cabang
        return namaKepalaCabang;
    }

    @Override
    public int getIdNasabah() { // menampilkan id nasabah
        return idNasabah;
    }

    public String getPencairan() {  //menampilkan pencairan
        return Pencairan;
    }
    
}
