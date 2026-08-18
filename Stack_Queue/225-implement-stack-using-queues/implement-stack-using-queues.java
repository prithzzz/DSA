class MyStack {
    private Queue<Integer> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }
    
    // Time: O(n)
    // Space: O(n)
    public void push(int x) {
        stack.offer(x);
        int i = stack.size() - 1; //initiate loop at bottom of queue
        while(i>0){
            stack.offer(stack.poll()); //move the element at front of queue to the last 
            i--; //decrement the end/last postion until the newely offered(added) element is at the front/top of stack
        }        
    }
    
    // Time O(1)
    public int pop() {
        return stack.poll(); //queue remove - poll
    }
    
    public int top() {
        return stack.peek(); 
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */