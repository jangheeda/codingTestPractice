#include <bits/stdc++.h>
using namespace std;

string s;
int cnt = 0;

int main() {
    cin >> s;

    vector<int> arr(26, -1);

    for(char a : s) {
        if(arr[a - 97] != -1 && arr[a - 97] >= 0) cnt++;
        else {
            arr[a - 97] = cnt;
            cnt++;
        }
        
    }

    for(int i = 0; i < 26; i++) {
        cout << arr[i] << " ";
    }

    cout << "\n";

    return 0;
}
