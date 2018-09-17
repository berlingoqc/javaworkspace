/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.lib;

import java.io.IOException;
import java.sql.*;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MyBD {

    public static final String[] Drivers = new String[]{
        "org.mariadb.jdbc.Driver"
    };

    
    protected Connection connection;


    public MyBD(ConnectionInfo info) throws SQLException, ClassNotFoundException {
        // Load JDBC driver
        Class.forName(info.driver);
        System.out.println("Driver loaded");

	String infoConnection = info.GetConnection();
	
        connection = DriverManager.getConnection(
            infoConnection,info.GetUser(),info.GetPassword()
        );
    }

    public Boolean CreateTableFromFile(String file) {
        FileUtils f = new FileUtils();
	String content = f.GetContentFile(file);
	if (content.equals("")) return false;
        Statement stmt;
        try {
		stmt = connection.createStatement();
		stmt.executeUpdate(content);
		stmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }

        return false;
    }

    public Boolean Close() {
	    try {
		    if(!connection.isClosed()) {
			connection.close();
			return true;
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
	    return false;
    }
}
