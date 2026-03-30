class MinStack {

    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {

        st.push(val);
        
    }
    
    public void pop() {

        st.pop();
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        Stack<Integer> stMin = new Stack<>();

        int min = st.peek();

        while(!st.isEmpty()){
            min = Math.min(min, st.peek());
            stMin.push(st.pop());
        } 

        while(!stMin.isEmpty()){
            st.push(stMin.pop());
        }

        return min;

        
    }
}
