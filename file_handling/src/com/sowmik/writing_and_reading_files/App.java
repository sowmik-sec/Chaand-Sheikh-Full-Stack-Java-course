package com.sowmik.writing_and_reading_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		File file = new File("fan/light/switch");
		file.mkdirs();
		file = new File("fan/light/switch/battery.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("error occured, while creating the file");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write("Ahsan");
			bw.newLine();
			bw.write("Habib");
			bw.newLine();
			bw.write("Sowmik");
			bw.newLine();
			System.out.println("Writing onto the file completed");
			bw.close();
		} catch (IOException e) {
			System.out.println("error occured, while  writing onto file");
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("fan/light/switch/battery.txt"));
			System.out.println("**************");
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
