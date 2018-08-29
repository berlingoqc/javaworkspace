/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.wquintal.lib;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class FileUtilsTest {

	private static final String FolderName = "TestFileUtils";
	private static final String[] TestFiles = {"newfile.log","test.txt","lol.txt"};
	
	public FileUtilsTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
		// Crée le repertoire de test et les deux dossier
		File f = new File(FolderName);
		f.mkdir();
		for(String tf : TestFiles) {
			f = new File(FolderName,tf);
			try {
			f.createNewFile();
			} catch(IOException e) {
				fail("Failt to setUp class");
			}
		}
		f = new File(FolderName,"Dir");
		f.mkdir();
	}
	
	@AfterClass
	public static void tearDownClass() {
		try {
			Files.walk(Paths.get(FolderName))
				.map(Path::toFile)
				.sorted((o1, o2) -> -o1.compareTo(o2))
				.forEach(File::delete);
		} catch (IOException ex) {
			Logger.getLogger(FileUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of GetFilesWorkspace method, of class FileUtils.
	 */
	@Test
	public void testGetFilesWorkspace() {
		System.out.println("GetFilesWorkspace");
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		
		File[] result = instance.GetFilesWorkspace();
		if(result == null)
			fail("GetFilesWorkspace is null");
	}

	/**
	 * Test of CreateNewDirectory method, of class FileUtils.
	 */
	@Test
	public void testCreateNewDirectory() {
		System.out.println("CreateNewDirectory");
		String name = "NewDir";
		Boolean overwrite = false;
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		File expResult = new File(FolderName,name);
		File result = instance.CreateNewDirectory(name, overwrite);
		assertEquals(expResult, result);
	}

	/**
	 * Test of CreateNewFile method, of class FileUtils.
	 */
	@Test
	public void testCreateNewFile_3args() {
		System.out.println("CreateNewFile");
		String file = "newfile.log";
		Boolean overwrite = true;
		FileUtils.FileType type = FileUtils.FileType.File;
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		File expResult = new File(FolderName,file);
		File result = instance.CreateNewFile(file, overwrite, type);
		assertEquals(expResult, result);
	}

	/**
	 * Test of Mv method, of class FileUtils.
	 */
	@Test
	public void testMv() {
		System.out.println("Mv");
		String file = "test.txt";
		String newRoot = "Dir";
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		File[] files = instance.GetFilesWorkspace();
		Boolean expResult = true;
		Boolean result = instance.Mv(file, newRoot);
		assertEquals(expResult, result);
	}

	/**
	 * Test of Cp method, of class FileUtils.
	 */
	@Test
	public void testCp() {
		System.out.println("Cp");
		String file = "lol.txt";
		String newRoot = "Dir";
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		Boolean expResult = false;
		Boolean result = instance.Cp(file, newRoot);
		assertEquals(expResult, result);
	}


	/**
	 * Test of DeleteFile method, of class FileUtils.
	 */
	@Test
	public void testDeleteFile() {
		System.out.println("DeleteFile");
		String name = "test.txt";
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		Boolean expResult = true;
		Boolean result = instance.DeleteFile(name);
		assertEquals(expResult, result);
	}
/**
	 * Test of WriteLineFile method, of class FileUtils.
	 */
	@Test
	public void testWriteLineFile() {
		System.out.println("WriteLineFile");
		String file = "lol.txt";
		String line = "test\n";
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		Boolean expResult = true;
		Boolean result = instance.WriteLineFile(file, line);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of GetAllLinesFile method, of class FileUtils.
	 */
	@Test
	public void testGetAllLinesFile() {
		System.out.println("GetAllLinesFile");
		String file = "lol.txt";
		FileUtils instance = new FileUtils();
		instance.setmRootDirectory(FolderName);
		String[] expResult = new String[] {};
		String[] result = instance.GetAllLinesFile(file);
		assertArrayEquals(expResult, result);
	}
	
}
