/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.lib;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class SettingsDBTest {
    
    public SettingsDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        File f = new File(SettingsDB.FileName);
        f.delete();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of OpenConfig method, of class SettingsDB.
     */
    @Test
    public void testOpenConfig() {
        System.out.println("OpenConfig");
        SettingsDB instance = new SettingsDB();
        Boolean expResult = false;
        // Supposer retourner false la premier fois parce qu'il n'existe pas
        Boolean result = instance.OpenConfig();
        assertEquals(expResult, result);
        
        // Save la config
        ConnectionInfo ci = new ConnectionInfo("localhost","website_serre","wq","office");
        result = instance.SaveConfig(ci);
        assertEquals(true,result);
        
        // Ouvre la config
        result = instance.OpenConfig();
        assertEquals(true, result);
        
    }

}
