package com.sowmik.creating_directory;

import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File directory = new File("habib/ginnie/volga");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("habib/ginnie/volga/test.txt");
		file.createNewFile();
		System.out.println("File created");
	}
}
