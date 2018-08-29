/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.yvan.lab1;
import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author wq
 */
public class Lab1 {
	private static Object lock = new Object();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ouvre le frame d'authentification pour qui fasse ca job
        AuthFrame authFrame = new AuthFrame();
	authFrame.setVisible(true);

    }
    
}
