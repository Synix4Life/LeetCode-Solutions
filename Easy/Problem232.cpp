/*
* Runtime: 0ms -> Beats 100% of users with C++
* Memory: 9.52MB -> Beats 95.17% of user with C++
*/

class MyQueue {
private:
    std::vector<int> list;
public:
    MyQueue() = default;
    
    void push(int x) {
        list.push_back(x);
    }
    
    int pop() {
        int res = list[0];
        list.erase(list.begin());
        return res;
    }
    
    int peek() {
        return list[0];
    }
    
    bool empty() {
        return list.size()==0;
    }
};
