#include <bits/stdc++.h>
using namespace std;

int a, cnt;
bool arr[42];

int main() {
    for(int i = 0; i < 10; i++) {
        cin >> a;
        arr[a % 42] = true;
    }

    for(int i = 0; i < 42; i++) {
        if(arr[i] == true) cnt++;
    }

    cout << cnt << "\n";
    
    return 0;
}
