#include <bits/stdc++.h>
using namespace std;

int a, b, c;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> a >> b >> c;

    int ans;
    if (a == b && b == c) {
        ans = 10000 + a * 1000;
    } else if (a == b || a == c) {
        ans = 1000 + a * 100;
    } else if (b == c) {
        ans = 1000 + b * 100;
    } else {
        ans = max({a, b, c}) * 100;
    }

    cout << ans << "\n";
    return 0;
}