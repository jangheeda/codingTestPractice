#include <bits/stdc++.h>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    set<string> st;
    string before = "";
    for (int i = 0; i < words.size(); i++) {
        string s = words[i];
        if (before != "" && (before.back() != s.front()) || st.find(s) != st.end()) {
            return {i % n + 1, i / n + 1};
        }
        st.insert(s);
        before = s;
    }
    
    return {0, 0};
}