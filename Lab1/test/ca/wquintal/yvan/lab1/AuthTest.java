/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.yvan.lab1;

import ca.wquintal.yvan.lab1.Auth;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wq
 */
public class AuthTest {
	
	public AuthTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of AuthUser method, of class Auth.
	 */
	@Test
	public void testAuthUser() {
		System.out.println("AuthUser");
		String username = "wquintal";
		String password = "linux";
		Boolean expResult = true;
		Boolean result = Auth.AuthUser(username, password);
		assertEquals(expResult, result);
		
		expResult = false;
		username = "reckt";
		result = Auth.AuthUser(username, password);
		assertEquals(expResult,result);
	}

	/**
	 * Test of OnLoginSuccessful method, of class Auth.
	 */
	@Test
	public void testOnLoginSuccessful() {
		System.out.println("OnLoginSuccessful");
		String username = "wquintal";
		Auth.OnLoginSuccessful(username);
		File f = new File("journal.txt");
		if(!f.exists()) {
			fail("journal.txt dont exists");
		}
		
	}
	
}
