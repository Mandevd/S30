import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    int min = Integer.MAX_VALUE;

    public MinStack(){
    }
    public void push(int x){
        if(min<=x){
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
