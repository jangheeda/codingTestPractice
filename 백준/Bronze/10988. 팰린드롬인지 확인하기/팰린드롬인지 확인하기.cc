#include <bits/stdc++.h>
using namespace std;
string str, tmp;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> str;
    tmp = str;

    reverse(tmp.begin(), tmp.end());

    if (str == tmp) {
        cout << 1 << "\n";
    } else {
        cout << 0 << "\n";
    }
    return 0;
}