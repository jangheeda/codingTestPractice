#include <bits/stdc++.h>
using namespace std;

int n, m, a, b, c;

int main() {
    cin >> n >> m;
    vector<int> arr(n, 0);

    for(int i = 0; i < m; i++) {
        cin >> a >> b >> c;
        for(int j = a - 1; j < b; j++) {
            arr[j] = c;
        }
    }

    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    
    return 0;
}