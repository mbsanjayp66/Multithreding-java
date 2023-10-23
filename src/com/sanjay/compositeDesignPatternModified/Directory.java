package com.sanjay.compositeDesignPatternModified;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

	String directoryName;
	List<FileSystem>fileSystemList;
	public Directory(String name) {
		this.directoryName = name;
		this.fileSystemList = new ArrayList<>();
	}
	
	public void add(FileSystem fl) {
		fileSystemList.add(fl);
	}
	
	@Override
	public void ls() {
		System.out.println("Directory Name:"+directoryName);
		for(FileSystem fl:fileSystemList) {
			fl.ls();
		}
	}

}
