#include <bits/stdc++.h>
using namespace std;

int n, m;
string s;
map<string, int> mp1;
map<int, string> mp2;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> s;
        mp1[s] = i + 1;
        mp2[i + 1] = s;
    }
    for (int i = 0; i < m; i++) {
        cin >> s;
        if (atoi(s.c_str()) == 0) { // 입력값이 string 이면
            cout << mp1[s] << "\n";
        } else {
            cout << mp2[atoi(s.c_str())] << "\n"; // 입력값이 숫자이면
        }
    }
}