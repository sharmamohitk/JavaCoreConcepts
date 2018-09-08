package com.practice.designpattern.factorymethod;

public class ComputerFactory {

	public ComputerFactory() {
	}
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		Computer computer = null;
		
		if(ComputerEnum.PC.getVal().equals(type)) {
			computer = new PC(ram, hdd, cpu);
		}else if(ComputerEnum.SERVER.getVal().equals(type)) {
			computer = new Server(ram, hdd, cpu);
		}
		return computer;
	}
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "17GB", "1TB", "i5");
		System.out.println(pc.getCPU()+" _ "+pc.getRAM());
		
		Computer server = ComputerFactory.getComputer("SERVER", "99GB", "100TB", "i8");
		System.out.println(server.getCPU()+" _ "+server.getRAM());
		
	}

}
