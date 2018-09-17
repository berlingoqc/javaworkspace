/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.lib;

/**
 *
 * @author wq
 */

    public class ConnectionInfo {
        String driver;
        String host;
        String database;
        String user;
        String password;

        public ConnectionInfo(String host,String db,String user,String password, String driver) {
            this.host = host;
            this.database = db;
            this.user = user;
            this.password = password;
            this.driver = driver;
        }

        public String GetConnection() {
		return "jdbc:mysql://"+host+"/"+database;
        }
        public String GetUser() { return user;}
        public String GetPassword() { return password; }
        public String GetDriver() { return driver; }
    }