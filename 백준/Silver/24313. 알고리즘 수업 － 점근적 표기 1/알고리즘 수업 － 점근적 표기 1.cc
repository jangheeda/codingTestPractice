#include <bits/stdc++.h>
using namespace std;

long long a1, a0, c, n0;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> a1 >> a0 >> c >> n0;

    long long f0 = a1 * n0 + a0;
    long long g0 = c * n0;

    if (a1 <= c && f0 <= g0) cout << 1 << "\n";
    else cout << 0 << "\n";

    return 0;
}