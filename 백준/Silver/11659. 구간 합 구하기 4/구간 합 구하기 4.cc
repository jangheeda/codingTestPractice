#include <bits/stdc++.h>
using namespace std;

int n, m;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    
    cin >> n >> m;

    vector<long long> psum(n + 1, 0);
    for (int i = 1; i <= n; i++) {
        long long x;
        cin >> x;
        psum[i] = psum[i - 1] + x;
    }

    while (m--) {
        int a, b;
        cin >> a >> b;
        cout << psum[b] - psum[a - 1] << "\n";
    }

    return 0;
}