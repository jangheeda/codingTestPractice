#include <bits/stdc++.h>
using namespace std;

string s;
int cnt = 0;

int main() {
    getline(cin, s);
    
    for(int i = 0; i < s.size(); i++) {
        if(s[i] != ' ' && (i == 0 || s[i-1] == ' ')) {
            cnt++;
        }
    }
    cout << cnt << '\n';

    return 0;
}
