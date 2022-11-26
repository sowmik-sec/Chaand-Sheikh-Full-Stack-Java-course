package com.sowmik.delete_files;

import java.io.File;

public class App {
	public static void main(String[] args) {
		File file = new File("/media/sowmik/Hard Disk/java/Chaand Sheikh Full Stack Java course/file_handling/volga.txt");
		if(file.delete()) {
			System.out.println("Deletion is successful");
		}
		else {
			System.out.println("Error while deleting");
		}
	}
}
