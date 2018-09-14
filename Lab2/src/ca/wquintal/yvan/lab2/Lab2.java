/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.yvan.lab2;

import ca.wquintal.lib.*;
/**
 *
 * @author wq
 */
public class Lab2 {
	
	static Lab2BD db;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ModelBD m = new ModelBD(1, "loddddlol", 0213, "1995/07/05", 0.43f);
		try {
			db = new Lab2BD();
			db.AddModelDB(m,false);
			db.AddModelDB(m,true);
			db.UpdateModelBD(m, false);
			m.setPk(2);
			db.UpdateModelBD(m, true);
			db.DeleteModelBD(1,false);
			db.DeleteModelBD(2, true);
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
}
