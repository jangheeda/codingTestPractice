#include <bits/stdc++.h>
using namespace std;

int n, m, l = 1, r, a, x, ret = 0;

int main() {
    cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;
    cin >> a;

    for(int i = 0; i < a; i++) {
        r = l + m - 1;
        cin >> x;
        if(x >= l && x <= r) continue;
        else {
            if(x < l) {
                ret += (l - x);
                l = x;
            } else {
                l += (x - r);
                ret += (x - r);
            }
        }      
    }

    cout << ret << "\n";

    return 0;
}
