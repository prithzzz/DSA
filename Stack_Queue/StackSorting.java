/* Approach:
Create a temporary stack.
While input is not empty-
1. Pop number from input stack
2. While temp stack is not empty and if the top of the temp stack is greater than the popped element: pop from temp stack and push it to the input stack
3. Push popped number into temp stack
Return sorted temp stack
*/

import java.util.Stack;

public class StackSorting{
    public Stack<Integer> stackSorting(){
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        Stack<Integer> temp = new Stack<>();

        while(!input.isEmpty()){
            int num = input.pop();
            while(!temp.isEmpty() && temp.peek() > num)
                input.push(temp.pop());
            
            temp.push(num);
        }

        return temp;
    }

     public static void main(String[] args) {
        StackSorting obj = new StackSorting();
        Stack<Integer> result = obj.stackSorting();
        System.out.println(result);
    }
}