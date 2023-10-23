package com.sanjay.compositeDesignPatternModified;

public class File implements FileSystem {

	String fileName;
	public File(String file) {
		this.fileName = file;
	}
	@Override
	public void ls() {
		System.out.println("File Name:"+fileName);
	}

}
