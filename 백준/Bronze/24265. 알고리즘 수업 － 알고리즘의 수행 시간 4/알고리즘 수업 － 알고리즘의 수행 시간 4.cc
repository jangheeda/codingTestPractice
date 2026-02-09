#include <bits/stdc++.h>
using namespace std;

long n, ret;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    ret = (n * (n - 1)) / 2;

    cout << ret << "\n" << 2;

    return 0;
}
