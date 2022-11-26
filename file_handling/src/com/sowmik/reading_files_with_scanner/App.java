package com.sowmik.reading_files_with_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("fan/light/switch/battery.txt"));
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file");
		}    
	}
}
