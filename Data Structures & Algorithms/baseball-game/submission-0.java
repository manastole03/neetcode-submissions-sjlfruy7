class Solution {
    public int calPoints(String[] operations) {


        int res = 0;

        Stack<Integer> st = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);

                res = res + newTop;
            }
            else if (op.equals("D")){
                st.push(2*st.peek());
                res = res + st.peek();
            }
            else if(op.equals("C")){
                res = res - st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
                res = res + st.peek();
            }
        }

        return res;
        
    }
}