package com.sowmik.serialization_of_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		try(FileInputStream FIO = new FileInputStream("/media/sowmik/Hard Disk/java/Chaand Sheikh Full Stack Java course/file_handling/src/com/sowmik/serialization_of_objects/vehicles.dat")) {
			try(ObjectInputStream obj = new ObjectInputStream(FIO)) {
				try {
					Vehicle v1 = (Vehicle) obj.readObject();
					Vehicle v2 = (Vehicle) obj.readObject();
					System.out.println("Object 1: "+v1);
					System.out.println("Object 2: "+v2);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
