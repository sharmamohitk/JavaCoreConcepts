package com.test.ideas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * 
 * @author mhitsharma
 *
 */
public class OutdatedSoftwareWriter {

	/**
	 * Write the list of server to a file into classpath
	 * @param servers
	 * @throws IOException 
	 */
	public static void writeOutDatedSoftware(List<Server> servers) throws IOException {
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("oudatedSoftware.txt")))){
			for (Server server : servers) {
				bufferedWriter.write(server.getServerName());bufferedWriter.write(",");
				bufferedWriter.write(server.getSoftwareType());bufferedWriter.write(",");
				bufferedWriter.write(server.getInstaledSoftwareName());bufferedWriter.write(",");
				bufferedWriter.write(server.getSoftwareVersion());bufferedWriter.newLine();
			}
			
		}catch(IOException iox) {
			throw new IOException();
		}
	}
}
