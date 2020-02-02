package w01;

public class Palindrome {

	public static void main(String[] args) {
		// Check if there's anything enter on the command line 
        if (args.length > 0) {
            for (String str : args) {
            	// creating a new object
                Stack stack = new Stack();
                String reverseInput = "";
                
                for(int i=0; i< str.length(); i++){
                	stack.push(str);
                }
                //reversing the string
                while (!stack.isEmpty()) {
                	reverseInput += stack.pop();
                }
                // comparing the reverse string with the string and ignoring white space 
                if(str.replaceAll("\\s", "").equalsIgnoreCase(reverseInput.toString())){
                    System.out.println(str + " is a palindrome!");
                }
                else {
                    System.out.println(str + " is not a palindrome!");
                }

            }
        }else{
        	System.out.print("Empty! Please input something");
        }
	}
}
