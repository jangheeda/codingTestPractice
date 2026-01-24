#include <bits/stdc++.h>
using namespace std;
int A, B, C;
int st, et;
int cnt[100];
int result;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> A >> B >> C;
    for (int i = 0; i < 3; i++) {
        cin >> st >> et;
        for(int j = st; j < et; j++) {
            cnt[j]++;
        }
    }

    for (int i = 0; i < 100; i++) {
        if (cnt[i] == 1) {
            result += A;
        } else if (cnt[i] == 2) {
            result += (2 * B);
        } else if (cnt[i] == 3) {
            result+= (3 * C);
        }
    }
    cout << result << "\n";
    
    return 0;
}