package w01;

public class Stack {
	private int top;
    private char[] arr;
    
    //Check for the top at end of the string to see if is empty
    public boolean isEmpty() {
        return (top == -1);
    }
   
    // pop will return the element at the top and removes it
    public char pop() {
        return arr[top--];
    }

    //pushes the element to the stack
    public void push(String str) {
    	//takes out all white space before putting it on the array
        str = str.replaceAll("\\s", "");
        this.arr = new char[str.length()];
        //converts the string into a sequence of character "toCharArray()"
        this.arr = str.toCharArray();
        top = str.length() - 1;
    }
}
