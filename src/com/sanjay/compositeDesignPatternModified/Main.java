package com.sanjay.compositeDesignPatternModified;

public class Main {
	public static void main( String[] args) {
		Directory dir = new Directory("Sanjay");
		FileSystem fl1 = new File("kumar");
		FileSystem fl2 = new File("kumar2");
		dir.add(fl1);
		dir.add(fl2);
		Directory dir2 = new Directory("Desktop");
		FileSystem fl3 = new File("User1");
		FileSystem fl4 = new File("User2");
		
		dir2.add(fl4);
		dir2.add(fl3);
		dir.add(dir2);
		dir.ls();
	}
}
