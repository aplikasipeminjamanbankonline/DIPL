/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briku;

/**
 *
 * @author ASUS
 */
public class BRIKU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menampilkan halaman registrasi
        Registrasi tl = new Registrasi();
        tl.setVisible(true);
        Controller_DB db1;
        
        db1 = Controller_DB.getInstance();
        
        db1.getConnection();
        
    }
    
}
