/**
using single stack: In this we will be using single stack and what we will be doing is: 
we will be pushing every element and along with that if the new element's value is less
than the previous minimum we will be pushing the previous minimum along with the new value 
and will update our minimum value to the new element's value. and while popping if the popped 
value is equal to the minimum value at that point we will pop 2 values one for the element to
be popped and the other one is going to be the value which will be used to update the minimum
variable. and with top and getmin function we can just get the topmost value and the minimum 
variable's value respectively for both the functions.
*/




import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    int min = Integer.MAX_VALUE;

    public MinStack(){
    }
    public void push(int x){
        if(x<=min){
            st.push(min);
            min = x;
        }
        st.push(x);
    }
    public void pop(){
       int popped = st.pop();
       if(popped == min){
           min = st.pop();
       }
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();

         obj.push(5);
         obj.pop();
         int param_3 = obj.top();
         int param_4 = obj.getMin();
    }
}
