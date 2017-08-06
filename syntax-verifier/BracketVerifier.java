import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class BracketVerifier {

    public void verifyBracket(String codeLine) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < codeLine.length(); i++) {
            char ch = codeLine.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }
            else if (ch == ']' || ch == '}' || ch == ')') {
                if (!stack.empty()) {
                    char topSymbol = stack.pop();

                    if ((ch == '}' && topSymbol != '{') || (ch == ']' && topSymbol != '[')
                            || (ch == ')' && topSymbol != '(')) {

                        System.out.println("Brackets do not match...");
                    }
                }
                else {
                    System.out.println("Extra closing bracket...");
                }
            }
        }

        if (!stack.empty()) {
            System.out.println("Missing brackets...");
        }
        else {
            System.out.println("Brackets are balanced...");
        }

    }

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/thurani/Desktop/Sample.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        StringBuffer stringBuffer = new StringBuffer();

        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
        }

        BracketVerifier bracketVerifier = new BracketVerifier();
        bracketVerifier.verifyBracket(stringBuffer.toString());

    }

}

