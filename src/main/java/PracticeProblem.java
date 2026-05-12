/**
 * File Name: Stack and Queue
 * Author: Tom Leung
 * Date Created: May 8, 2026
 * Date Last Edited: May 8, 2026
 */
import java.util.ArrayDeque;

public class PracticeProblem {

	public static void main(String args[]) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.add("a");
        stack.add("b");
        stack.add("c");
        stack.add("d");
        stack.removeLast();
        
        System.out.println(stack);
	}

	public static String processBackspaces(String input) {
        String result = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            String ch = input.substring(i,i+1);

            if (ch.equals("#") ) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
                
            }
        }

        while (!stack.isEmpty()){
            result = result + stack.peekLast();
            stack.removeLast();
        }

        return result;
    }


    public static String simulateLine(String[] cmds){
        int count = 0;
        String result ="";
        ArrayDeque<String> dq = new ArrayDeque<String>();
        for (int i = 0; i < cmds.length; i++){            
            int space = cmds[i].indexOf(" ");
            String name = cmds[i].substring(space+1);
            if (cmds[i].contains("ENQUEUE")){
                dq.add(name);
            }
            else if (cmds[i].contains("VIP")){
                dq.addFirst(name);
            }

            else if (cmds[i].contains("SERVE")){
                dq.removeFirst();
            }

            else if (cmds[i].contains("REQUEUE")){
                String first = dq.peek();
                dq.removeFirst();
                dq.add(first);
            }
            else if (cmds[i].contains("SCARE")){
                dq.removeLast();
            }
        }

        while (!dq.isEmpty()){
            if (count == 0){
               result = result + dq.peek();
               dq.remove();  
            }
            else{
              result = result + ", " + dq.peek();
              dq.remove();
            }
            count++;
           
        }

        return "[" + result + "]" ;
        
    }


}
