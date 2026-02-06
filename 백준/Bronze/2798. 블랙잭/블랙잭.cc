#include <bits/stdc++.h>
using namespace std;

int n, m;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;
    
    vector<int> v(n);
    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }
    int ans = 0;

    for(int i = 0; i < n - 2; i++) {
        for(int j = i + 1; j < n - 1; j++) {
            for(int k = j + 1; k < n; k++) {
                int sum = v[i] + v[j] + v[k];
                if(sum <= m) {
                    ans = max(ans, sum);
                }
            }
        }
    }

    cout << ans << "\n";

    return 0;
}
