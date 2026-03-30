class Solution {
    public int evalRPN(String[] tokens) {

    Stack<Integer> st = new Stack<>();

    int res=0;

        for(String op : tokens){

            if(op.equals("+")){

                st.push(st.pop() + st.pop());


            }
            else if(op.equals("-")){

               int b = st.pop(); 
                int a = st.pop(); 
                st.push(a - b);


            }else if(op.equals("*")){

               st.push(st.pop() * st.pop());


            }else if(op.equals("/")){

                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else{

                st.push(Integer.parseInt(op));

            }



        }

        return st.pop();
        
    }
}
