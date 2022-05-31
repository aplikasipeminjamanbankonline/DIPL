/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briku;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WINDOWS 10
 * melakukan koneksi terhadap database
 */
public class KoneksiDB {
    static Connection con;
    public static Connection connection(){
        /**
         * melakukan koneksi ke database terhadap mysql
         * dengan nama "briku"
         * yang memiliki username "root"
         * dan password "" kosong
        */
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setPort(3306);
            data.setDatabaseName("briku");
            data.setUser("root");
            data.setPassword("");
        
        try {
            con=data.getConnection();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    return con;
    }

}