#include <bits/stdc++.h>
using namespace std;

int n, ret = 0;
string s;

int main() {

    cin >> n >> s;
    
    for (char c : s) {
        ret += c - '0';        
    }

    cout << ret << "\n";

    return 0;
}
