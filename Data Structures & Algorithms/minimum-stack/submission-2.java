// class MinStack {
//     Stack<Integer> stack;
//     Stack<Integer> minStack;

//     public MinStack() {
//         stack = new Stack<>();
//         minStack = new Stack<>();
//     }
    
//     public void push(int val) {
//         stack.push(val);
//         if(minStack.isEmpty() || val <= minStack.peek()){
//             minStack.push(val);
//         }
//     }
    
//     public void pop() {
//         if(stack.isEmpty()) return;
//         int top = stack.pop();
//         if(top == minStack.peek()){
//             minStack.pop();
//         }
//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return minStack.peek();
//     }
// }


class MinStack{
    private Node head;

    public MinStack(){
        head=null;
    }

    public void push(int val){
        if(head==null){
            head = new Node(val, val, null);
        }
        else{
            head = new Node(val, Math.min(val,head.min), head);
        }
    }

    public void pop(){
        head= head.next;
    }

    public int top(){
        return head.val;
    }

    public int getMin(){
        return head.min;
    }

    private class Node{
        int val;
        int min;
        Node next;
        Node(int val, int min, Node next){
            this.val =val;
            this.min =min;
            this.next =next;
        }
    }
}
