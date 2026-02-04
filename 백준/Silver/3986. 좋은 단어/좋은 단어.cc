#include <bits/stdc++.h>
using namespace std;

int n, ret;
string s;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> s;
        stack<char> stack;
        for(char c : s) {
            if(stack.size() && stack.top() == c) stack.pop();
            else stack.push(c);
        }
        if (stack.size() == 0) ret++;
    }

    cout << ret << "\n";

    return 0;
}
