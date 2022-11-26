package com.sowmik.serialization_of_objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 94444);
		Vehicle car = new Vehicle("Car", 4243);
		try(FileOutputStream fos = new FileOutputStream("/media/sowmik/Hard Disk/java/Chaand Sheikh Full Stack Java course/file_handling/src/com/sowmik/serialization_of_objects/vehicles.dat")) {
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}
	}

}
