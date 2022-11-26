package com.sowmik.creating_file;

import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File file = new File("/media/sowmik/Hard Disk/java/Chaand Sheikh Full Stack Java course/file_handling/volga.txt");
		file.createNewFile();
		System.out.println("File created");
	}
}
