/*
* Runtime: 0ms -> Beats 100% of users with C++
* Memory: 9.17MB -> Beats 14.31% of user with C++
*/

class Solution {
public:
    bool isValid(string s) {
        unordered_map<char, char> M = { {')', '('} , {'}', '{'} , {']', '['} };
        stack<char> st;

        for(char c : s){
            if(M.count(c)){
                if(st.empty() || st.top() != M[c]){
                    return false;
                }
                st.pop();
            } else {
                st.push(c);
            }
        }

        return st.empty();
    }
};