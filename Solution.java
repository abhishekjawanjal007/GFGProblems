
import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    
    // First Method
    // public static void rotateDeque(Deque<Integer> dq, int type, int k) {
    //     // code here
        
    //     int n=dq.size();
    //     if(n==0) return ;
        
    //     k=k%n;
    //     if(k==0) return ;
        
    //     if(type==1){
    //         k=n-k;
    //     }
        
    //     for(int i=0;i<k;i++){
    //         dq.addLast(dq.removeFirst());
            
    //     }
    
    
    // }
    
   public static void rotateDeque(Deque<Integer> dq, int type, int k) {
    int n = dq.size();
    if (n == 0) return;
    
    k = k % n;
    if (k == 0) return;
    
    if (type == 1) { 
        for (int i = 0; i < k; i++) {
            dq.addFirst(dq.removeLast());
        }
    } else { 
        for (int i = 0; i < k; i++) {
            dq.addLast(dq.removeFirst());
        }
    }
}
}
