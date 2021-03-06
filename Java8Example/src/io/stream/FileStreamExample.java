package io.stream;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileStreamExample {

	public static void main(String[] args) {

		//write your text path with windows
		//you should write the path with escape "\"
		Path path = Paths.get("C:\\xxx\\Documents\\tmp\\test.txt");
		
		try{
			//read file
			Files.lines(path).distinct()
			//print out each text line
			.forEach(s->System.out.println(s));
		}catch(IOException e){
			Logger.getLogger(FileStreamExample.class.getName())
			.log(Level.SEVERE, "IO Exception", e);
		}
		
	}

}
