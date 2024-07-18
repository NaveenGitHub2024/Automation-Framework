package mavenProject;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\durga\\Pictures\\MyDOC\\Test.txt");
		f.createNewFile();
		System.out.println("end..");
	}

}
