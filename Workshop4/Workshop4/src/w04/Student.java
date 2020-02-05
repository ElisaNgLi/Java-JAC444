package w04;

import java.util.ArrayList;

public class Student implements java.io.Serializable{

	private int stdID;
    private String firstName;
    private String lastName;
    private ArrayList<String> courses;
    
    // Constructor
    public Student() {
        courses = new ArrayList<String>();
    
    }

    // Getters
    public int getStdID() {
        return stdID;
    }
    
    public String getName() {
        return firstName + ' ' + lastName;
    }
    
    public ArrayList<String> getCourses() {
        return courses;
    }
    
    // Setters
    public void setFirstName(String firstName) throws Exception {
    	if (firstName != null){
    		this.firstName = firstName;
    	}else {
    		throw new Exception("Invalid First Name");
    	}
        
    }

    public void setLastName(String lastName) throws Exception {
        if (lastName != null){
        	this.lastName = lastName;
        }else {
        	throw new Exception("Invalid Last Name");
        }
    	
    }

    public void setStdID(int stdID) throws Exception {
    	// Check for the student number input
        if(stdID > 0) {
            this.stdID = stdID;
        }
        else{
            throw new Exception("Invalid student ID!");
        }
    }

    public void setCourses(String courses) throws Exception {
    	if (courses != null){
    		this.courses.add(courses);
    	}else{
    		 throw new Exception("Invalid course! Add some courses");
    	}
        
    }

}
