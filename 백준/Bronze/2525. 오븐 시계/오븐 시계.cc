#include <bits/stdc++.h>
using namespace std;

int h, m, c, total;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> h >> m >> c;

    total = h * 60 + m;

    total = (total + c + 1440) % 1440;

    cout << total / 60 << " " << total % 60 << "\n";
    

    return 0;
}
