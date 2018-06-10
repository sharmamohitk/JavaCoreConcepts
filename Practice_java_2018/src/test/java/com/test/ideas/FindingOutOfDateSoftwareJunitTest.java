package com.test.ideas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class FindingOutOfDateSoftwareJunitTest {
	
	@Test
	public void testMain() throws IOException {
		
		String[] args = null;
		FindingOutOfDateSoftwareTest.main(args);
		List<Server> servers = new ArrayList<>();
		// read text file frm class path and create a list of server 
		getListOfServerInOutputFile(servers);
		Assert.assertTrue(servers.size() == 2);
		 
	}
	
    /**
     * Add the items in output list
     * @param servers
     * @throws IOException
     */
	private void getListOfServerInOutputFile(List<Server> servers) throws IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("oudatedSoftware.txt")) ){
			String content = null;
			while((content= bufferedReader.readLine()) != null) {
				String [] serverLine = content.split(",");
				 servers.add( new Server(serverLine[0], serverLine[1], serverLine[2], serverLine[3]));
			}
		}catch(IOException ioe) {
			throw new IOException();
		}
	}
	
}
