/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.yvan.lab1;

import ca.wquintal.lib.FileUtils;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wq
 */
public class Auth {

	private static final String RootDirectory = System.getProperty("user.dir");
		
	// AuthGrid contient les infos de login pour la bd
	private static final String[][] AuthGrid = new String[][] {
		{ "wquintal", "linux"}, 
		{ "cbrossard", "windows"}, 
		{ "olapierre","mac"}
	};
	
	
	
	
	public static Boolean AuthUser(String username, String password) {
		if (username.equals("") || password.equals(""))
			return false;
		for(String[] item : AuthGrid)
			if (item[0].equals(username) && item[1].equals(password))
				return true;
		return false;
	}
	
	public static void OnLoginSuccessful(String username) {
		DateFormat formatHeure = new SimpleDateFormat("HH:mm:ss");
		DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		
		String heure = formatHeure.format(cal.getTime());
		String date = formatDate.format(cal.getTime());
		
		String logLine = String.format("USER=%s DATE=%s HEURE=%s",username,date,heure);
		
		FileUtils file = new FileUtils();
		file.WriteLineFile("journal.txt",logLine);
		
		
	}
	
	
}
