#include <bits/stdc++.h>
using namespace std;

int n, m, i, j;
int arr[101];

int main() {
    cin >> n >> m;

    for(int i = 1; i <= n; i++) {
        arr[i] = i;
    }

    for (int k = 0; k < m; k++) {
    cin >> i >> j;
    while (i < j) swap(arr[i++], arr[j--]);
}

    for (int i = 1; i <= n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
