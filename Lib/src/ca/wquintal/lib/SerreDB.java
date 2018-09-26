/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.lib;

import com.obctech.growbe.proto.serre.SerreData.SerreDataReport;
import java.sql.SQLException;
import sun.font.CreatedFontTracker;

/**
 *
 * @author william
 */
public class SerreDB extends MyBD {

    public SerreDB(ConnectionInfo info) throws SQLException, ClassNotFoundException {
        super(info);
        // ne crée pas les tables assumes qu'ils sont déja la
    }
    
    // SaveHub sauvegarde un nouveau hub dans la bd
    public void SaveHub() throws SQLException {
        
    }
    
    public SerreDataReport GetLatestDataReport(int id) {
        
        
        return null;
    }
    
    
    
}
