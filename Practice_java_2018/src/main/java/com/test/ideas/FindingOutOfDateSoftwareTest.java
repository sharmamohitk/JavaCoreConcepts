package com.test.ideas;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author mhitsharma
 *
 */
public class FindingOutOfDateSoftwareTest {
	
	public static void main(String[] args) throws IOException {
		
		/**
		 * populate the list of server from provided text file i.e.
		 * reading file and return the list of serversoftware
		 */
		List<Server> servers = ServerFactory.getServer();
		
		/**
		 *  finds the list of servers having outdated software
		 *  we can further optimize it so that it can compare/find from server having 
		 *  software version like 2.6.3 
		 *  current implementation will works for software version having 2 digits like 5.7
		 *  as per current requirement with provided text file it works perfectly
		 */
		List<Server> serverWithOutdatedSoftware = OutdatedSoftwareOnServerFactory.getServerWithOutdatedSoftware(servers);
		
		/**
		 * write list of out of date software/serve to a file
		 * into classpath
		 */
		OutdatedSoftwareWriter.writeOutDatedSoftware(serverWithOutdatedSoftware);
		
		
	}


}
