class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;

    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(min_stack.isEmpty() || value <= min_stack.peek())
            min_stack.push(value);
    }
    
    public void pop() {
        if (stack.isEmpty()) 
            return;
        int top = stack.pop();
        if (top == min_stack.peek()) {
            min_stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */