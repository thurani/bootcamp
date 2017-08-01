import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> data) {

        	Stack<Integer> sortedStack = new Stack<Integer>();

        	while (!data.empty()) {
            		int temp = data.pop();
            		while (!sortedStack.empty() && sortedStack.peek() > temp) {
                		data.push(sortedStack.pop());
            		}
            		sortedStack.push(temp);
        	}

        	return sortedStack;

    	}

	public static void main(String[] args) {

		Stack<Integer> data = new Stack<Integer>();
		
		data.push(90);
		data.push(50);
		data.push(33);
		data.push(78);
		data.push(21);
		data.push(43);
		data.push(12);
		data.push(67);
		data.push(11);
		data.push(85);

		System.out.println("Input Data: " + data);
        	System.out.println("Sorted Stack: " + sortStack(data));

	}

}
