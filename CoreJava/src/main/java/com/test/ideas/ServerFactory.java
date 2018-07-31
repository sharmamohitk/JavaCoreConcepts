package com.test.ideas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mohitsharma
 *
 */
public class ServerFactory {

	/**
	 * read line of server from text file and 
	 * @return the list of servers
	 * @throws IOException
	 */
	public static List<Server> getServer() throws IOException {
		
		List<Server> servers = new ArrayList<>();
		
		// read text file frm class path and create a list of server 
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("servers.txt")) ){
			String content = null;
			while((content= bufferedReader.readLine()) != null) {
				String [] serverLine = content.split(",");
				 servers.add( new Server(serverLine[0], serverLine[1], serverLine[2], serverLine[3]));
			}
			return servers;
		}catch(IOException ex) {
			throw new IOException();
		}
	}
 }
