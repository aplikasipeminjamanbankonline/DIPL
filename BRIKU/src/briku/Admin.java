/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briku;

//Membuat class admin extends dengan kelas Nasabah
public class Admin extends Nasabah {
    //Inisiasi variabel yang dibutuhkan
    private int idAdmin;
    private String namaAdmin;
    private int idNasabah;
    
    //Buat method setter
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    //Override method setter kelas nasabah 
    @Override
    public void setIdNasabah(int idNasabah) {
        this.idNasabah = idNasabah;
    }

    //Buat method setter kelas nasabah 
    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }
    
    //Override method getter kelas nasabah 
    @Override
    public int getIdNasabah() {
        return idNasabah;
    }
    
}
