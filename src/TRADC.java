import java.util.Stack;

public class TRADC {
    public String TripleRemoveDuplicate(String s){
                Stack<Character> chars = new Stack<>();
                for (int i = 0; i < s.length(); i++) {
                    char current = s.charAt(i);
                    int total = 0;
                    for (int j = 0; j < s.length(); j++){
                        if (s.charAt(j) == current){
                            total++;
                        }
                    }
                    if (total != 3){
                        chars.push(current);
                    }
                }

                StringBuilder result = new StringBuilder();

                for (char c : chars) {
                    result.append(c);
                }

                return result.toString();
            }
}
