class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
int size = 0;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        
    }

    public void push(int x) {
            q1.add(x);
            size++;
    }

    public int pop() {
        int count = 1;
        int popped = 0;
            while(!q1.isEmpty()){
                if(count != size){
                    q2.add(q1.remove());
                    count++;
                }else{
                    popped = q1.remove();
                }
            }
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
            size--;
            return popped;
    }

    public int top() {
int count = 1;
        int popped = 0;
            while(!q1.isEmpty()){
                if(count != size){
                    q2.add(q1.remove());
                    count++;
                }else{
                    popped = q1.remove();
                    q2.add(popped);
                }
            }
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
            return popped;
    }

    public boolean empty() {
     return q1.isEmpty();
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