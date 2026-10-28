import java.util.Scanner;
import java.util.Stack;

public class RADC {
    public String RemoveDuplicate(String s){
        Stack<Character> chars = new Stack<Character>();
        if (s.equals(s.toLowerCase())){
            for (int i = 0; i<s.length(); i++){
                char current = s.charAt(i);
                if (!chars.isEmpty() && current == chars.peek()){
                    chars.pop();
                }
                else {
                    chars.push(current);
                }
            }

        }
        StringBuilder string = new StringBuilder();
        for (int i=0; i<chars.size(); i++){
            string.append(chars.get(i));
        }
        return string.toString();

    }


}
