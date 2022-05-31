/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// import untuk menggenerate tanggal
package briku;
 import java.sql.Date;

public class Nasabah { //membuat class untuk nasabah
    int idNasabah;
    String namaNasabah;
    Date TanggalLahir;
    String TempatLahir;
    int noRekening;
    String status;
    int JumlahDipinjam;
    
    //setter untuk memperbarui nilai variabel dari tiap class
    //dan getter untuk membaca nilai variabel dari tiap class

    public int getIdNasabah() { //class id nasabah
        return idNasabah;
    }

    public void setIdNasabah(int idNasabah) {
        this.idNasabah = idNasabah;
    }

    public String getNamaNasabah() { //class menentukan nama nasabah
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Date getTanggalLahir() { //class menentukan tanggal lahir
        return TanggalLahir;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getTempatLahir() { //class menentukan tempat lahir
        return TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public int getNoRekening() { //class menentukan no rekening
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

    public String getStatus() { //class menentukan status apakah berhasil atau tidak
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJumlahDipinjam() { //class menentukan jumlah yang dipinjam dari nasabah
        return JumlahDipinjam;
    }

    public void setJumlahDipinjam(int JumlahDipinjam) {
        this.JumlahDipinjam = JumlahDipinjam;
    }
}
