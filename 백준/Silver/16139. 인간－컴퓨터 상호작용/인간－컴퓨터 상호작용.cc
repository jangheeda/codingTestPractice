#include <bits/stdc++.h>
using namespace std;

string s;
int n, q, l, r;

int main() {
    cin >> s;
    n = (int)s.size();

    vector<array<int, 26>> psum(n + 1);

    for(int i = 0; i < n; i++) {
        psum[i + 1] = psum[i];
        psum[i + 1][s[i] - 'a']++;
    }

    cin >> q;

    while(q--) {
        char c;
        cin >> c >> l >> r;
        int idx = c - 'a';
        cout << psum[r + 1][idx] - psum[l][idx] << "\n"; 
    }

    return 0;
}
