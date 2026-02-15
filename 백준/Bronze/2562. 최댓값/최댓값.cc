#include <bits/stdc++.h>
using namespace std;

int n, temp = 0, idx;
int arr[9];

int main() {
    for(int i = 0; i < 9; i++) {
        cin >> n;
        if(temp < n) {
            temp = n;
        }
        arr[i] = n;
    }
    for(int i = 0; i < 9; i++) {
        if(arr[i] == temp) idx = i;
    }
    cout << temp << "\n" << idx + 1 << "\n";

    return 0;
}