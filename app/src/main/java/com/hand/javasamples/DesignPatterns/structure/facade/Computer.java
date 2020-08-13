package com.hand.javasamples.DesignPatterns.structure.facade;

/**
 * 门面模式，封装接口，封装内部复杂实现，对外提供简单易用接口
 */
public class Computer implements Sourceable {

	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new CPU();  
        memory = new Memory();  
        disk = new Disk(); 
	}
	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        disk.startup();  
        System.out.println("start computer finished!");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		 System.out.println("begin to close the computer!");  
	        cpu.shutdown();  
	        memory.shutdown();  
	        disk.shutdown();  
	        System.out.println("computer closed!");
	}

}
