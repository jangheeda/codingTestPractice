#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

ll n, ret;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    ret = (n * (n - 1) * ( n - 2)) / 6;    

    cout << ret << "\n" << 3;

    return 0;
}