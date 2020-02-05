package w04;

import java.io.*;

public class StudentDeserial {

	public static void main(String[] args) {

		try {
			FileInputStream fileIn = new FileInputStream("output.out");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			boolean read = true;
			int stdCounter = 1;
			
			System.out.println("-------- Displaying Student Data --------");
			
			while(read) {
				Student std = (Student)in.readObject();
				
				if(std != null) {
					System.out.println("Student " + stdCounter++);
					System.out.println("Student Number: " + std.getStdID());
                    System.out.println("Student Name: " + std.getName());
                    System.out.println("Student Course(s): " + std.getCourses());
                    System.out.println();
				}else{
					read = false;
				}
			}
			fileIn.close();
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
