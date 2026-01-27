#include <bits/stdc++.h>
using namespace std;

int n;
double ret, score[1000];

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> score[i];
    }
    sort(score, score + n);
    for (int i = 0; i < n; i++) {
        ret += (score[i] / score[n - 1]) * 100;
    }

    cout << ret / n << "\n";
}