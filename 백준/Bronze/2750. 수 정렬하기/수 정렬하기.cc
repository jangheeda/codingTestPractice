#include <bits/stdc++.h>
using namespace std;

int n, a, arr[1001];

int main() {
    cin >> n;
    
    for(int i = 0; i < n; i++) {
        cin >> a;
        arr[i] = a;
    }

    sort(arr, arr + n);

    for(int i = 0; i < n; i++) {
        cout << arr[i] << "\n";
    }
   
    return 0;
}
