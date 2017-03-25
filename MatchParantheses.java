import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MatchParantheses {


	public boolean isBalance(String str) {	
	
		Stack st = new Stack<String>();
		
		for(char c : str.toCharArray()) {
			if(c == '{' || c == '(' || c == '[') {
				st.push(c);
			} else {
				if(st.peek().toString().equals("{") && Character.toString(c).equals("}")) {
					st.pop();
				}
				else if(st.peek().toString().equals("(") && Character.toString(c).equals(")")) {
					st.pop();
				}
				else if(st.peek().toString().equals("[") && Character.toString(c).equals("]")) {
					st.pop();
				}	
			}
		}
		
		if(st.empty()) {
			return true;
		}
		
		return false;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		MatchParanthesis mp = new MatchParanthesis();
		String inputString = input.nextLine();
		System.out.println("------------"+mp.isBalance(inputString));		

	}
}
