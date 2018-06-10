package com.test.ideas;

/**
 * 
 * @author mohitsharma
 *
 */
public class Server {

	private String serverName;
	private String softwareType;
	private String instaledSoftwareName;
	private String softwareVersion;
	
	public Server() {
	}
	
	public Server(String serverName, String softwareType, String instaledSoftwareName, String softwareVersion) {
		super();
		this.serverName = serverName;
		this.softwareType = softwareType;
		this.instaledSoftwareName = instaledSoftwareName;
		this.softwareVersion = softwareVersion;
	}



	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getSoftwareType() {
		return softwareType;
	}
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}
	public String getInstaledSoftwareName() {
		return instaledSoftwareName;
	}
	public void setInstaledSoftwareName(String instaledSoftwareName) {
		this.instaledSoftwareName = instaledSoftwareName;
	}
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instaledSoftwareName == null) ? 0 : instaledSoftwareName.hashCode());
		result = prime * result + ((serverName == null) ? 0 : serverName.hashCode());
		result = prime * result + ((softwareType == null) ? 0 : softwareType.hashCode());
		result = prime * result + ((softwareVersion == null) ? 0 : softwareVersion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Server other = (Server) obj;
		if (instaledSoftwareName == null) {
			if (other.instaledSoftwareName != null)
				return false;
		} else if (!instaledSoftwareName.equals(other.instaledSoftwareName))
			return false;
		if (softwareType == null) {
			if (other.softwareType != null)
				return false;
		} else if (!softwareType.equals(other.softwareType))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Server [serverName=" + serverName + ", softwareType=" + softwareType + ", instaledSoftwareName="
				+ instaledSoftwareName + ", softwareVersion=" + softwareVersion + "]";
	}
	
}
