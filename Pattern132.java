import java.util.Stack;
public class Pattern132 {
    public static void main(String[] args){
Stack<Integer> st = new Stack<>();
int arr[] = {3,5,4,0,7,-1};
boolean ans = pattern(st,arr);
System.out.println(ans);
    }
    public static boolean pattern(Stack<Integer> st, int[] arr){
        int k = Integer.MIN_VALUE;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]<k){
                return true;
            }
            while(!st.isEmpty() && st.peek()<arr[i]){
                k = st.pop();
        }
        st.add(arr[i]);

    }
    return false;
}
}
