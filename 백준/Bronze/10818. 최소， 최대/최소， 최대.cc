#include <bits/stdc++.h>
using namespace std;

int n;

int main() {
    cin >> n;
    int arr[n];

    for(int i = 0; i < n; i++) {
        int a;
        cin >> a;
        arr[i] = a;
    }

    cout << *min_element(arr, arr + n) << " " << *max_element(arr, arr + n) << "\n";

    return 0;
}
