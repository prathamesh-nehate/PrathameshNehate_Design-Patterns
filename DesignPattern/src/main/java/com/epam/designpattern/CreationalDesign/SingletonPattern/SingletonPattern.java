package com.epam.designpattern.CreationalDesign.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SingletonPattern {

public static FileInputStream getFileWrite() throws FileNotFoundException {
	FileInputStream fin = new FileInputStream("C:\\Users\\DELL\\designpatterns.txt") ;
	return fin ;
}

public static FileOutputStream getFileRead() throws FileNotFoundException {
	FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\designpatterns.txt") ;
	return fout ;
}
	
}
