/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briku;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
class Controller_DB {
// mengkoneksikan ke database
   private static Controller_DB dbObject;
   private static java.sql.Connection koneksi;
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/briku";  // menghubungkan ke localhost 
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password); // get connect dengan (url,user,password)
                System.out.println("Connection Sukses"); // connect berhasil
            }catch (SQLException e){
                System.out.println("Tidak Dapat Melakukan Koneksi Ke Database"); // connect gagal 
                int msg_gagalkoneksi = JOptionPane.showOptionDialog(null, 
                                "Tidak Dapat Melakukan Koneksi Ke Database, Apakah Anda Ingin Melakukan Koneksi Ulang ?", 
                                "Koneksi Database Gagal", 
                                JOptionPane.YES_NO_OPTION, //option yes or no
                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                if(msg_gagalkoneksi == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Melakukan Koneksi Ke Database..."); // mengkoneksi database
                    getKoneksi();
                }
            }
        }
        return koneksi; // output connect
    }
    private Controller_DB() {      
   }
    public static Controller_DB getInstance() {

      // create object if it's not already created
      if(dbObject == null) {
         dbObject = new Controller_DB();
      }

       // returns the singleton object
       return dbObject;
   }

   public void getConnection() {
       System.out.println("You are now connected to the database.");
   }
}
    
   
