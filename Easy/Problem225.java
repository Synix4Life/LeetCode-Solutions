/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 41.49MB -> Beats 49.29% of user with Java
*/

class MyStack {
    private LinkedList<Integer> list;

    public MyStack() {
        list = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        list.addFirst(x);
    }
    
    public int pop() {
        return list.removeFirst();
    }
    
    public int top() {
        return list.getFirst();
    }
    
    public boolean empty() {
        return list.size() == 0;
    }
}
