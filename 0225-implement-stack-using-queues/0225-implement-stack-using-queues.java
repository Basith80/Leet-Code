class MyStack {
    Queue<Integer> q;
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyStack() {
        q = new LinkedList<>();
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        while (!q.isEmpty()) {
            s1.push(q.remove());
        }
        int ans = s1.pop();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            q.add(s2.pop());
        }
        return ans;
    }

    public int top() {

        while (!q.isEmpty()) {
            s1.push(q.remove());
        }
        int ans = s1.peek();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            q.add(s2.pop());
        }
        return ans;
    }

    public boolean empty() {
        return q.isEmpty();
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