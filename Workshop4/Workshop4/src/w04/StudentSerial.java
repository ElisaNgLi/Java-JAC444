package w04;

import java.io.*;
import java.util.Scanner;

public class StudentSerial {
	public static void main(String[] args) {

	
		try {
			
			FileOutputStream fileOut = new FileOutputStream("output.out");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			Scanner reader = new Scanner(System.in);

			boolean addStd = true;

            do {
                int stdID = 0;
                String firstName;
                String lastName;
                Student student = new Student();
                System.out.println("-------- Student Data Entry -------------");

                System.out.println("Enter student number: ");
                while(stdID == 0){
                    try{
                        stdID = reader.nextInt();
                        student.setStdID(stdID);
                    } catch (Exception exception) {
                        System.out.println("Invalid student number! Please enter a valid student number: ");
                    }
                    reader.nextLine();
                }
                
                System.out.println("Enter student's first name: ");
                        firstName = reader.nextLine();
                        student.setFirstName(firstName);

                System.out.println("Enter student's last name: ");
                        lastName = reader.nextLine();
                        student.setLastName(lastName);

                boolean addCourse = true;

                do {
                    System.out.println("Enter Course's <Enter 0 to finish>: ");
                    String course = reader.nextLine();

                    if (course.equals("0")) {
                        addCourse = false;
                    } else {
                        student.setCourses(course);
                    }

                } while (addCourse);

                out.writeObject(student);
                out.flush();

                System.out.println("Would you like to enter another student? (y or n): ");
                String answer = reader.nextLine();

                while(!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n"))){
                    System.out.println(answer + " is an invalid answer. Please enter y or n: ");
                    answer = reader.nextLine();
                }

                if(answer.equalsIgnoreCase("n")){
                    addStd = false;
                }

            }while(addStd);

            out.flush();
            fileOut.close();
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
	

}
