package com.test.ideas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author mhitsharma
 *
 */
public class OutdatedSoftwareOnServerFactory {

	private static Map<String,Server> outDatedSoftwareMap = new HashMap<>();
	private static Map<String,Server> upDatedSoftwareMap = new HashMap<>();
	
	
	public static List<Server> getServerWithOutdatedSoftware(List<Server> servers) throws IOException {
		
		for (Server server : servers) {
			String serverObjKey = server.getSoftwareType()+server.getInstaledSoftwareName();
			
			if(upDatedSoftwareMap.containsKey(serverObjKey)) {
				
				Server tempServerObj = upDatedSoftwareMap.get(serverObjKey);
				
				if( server.getSoftwareVersion().compareTo(tempServerObj.getSoftwareVersion())  == 0) {
					upDatedSoftwareMap.put(serverObjKey, server);
				}
				else if (server.getSoftwareVersion().compareTo(tempServerObj.getSoftwareVersion())  > 0) {
					upDatedSoftwareMap.put(serverObjKey, server);
					outDatedSoftwareMap.put(serverObjKey, tempServerObj);
				}else {
					outDatedSoftwareMap.put(serverObjKey, server);
				}
				
			}else {
				upDatedSoftwareMap.put(serverObjKey, server);
			}
		}
		
		return new ArrayList<>(outDatedSoftwareMap.values());
	}
}
