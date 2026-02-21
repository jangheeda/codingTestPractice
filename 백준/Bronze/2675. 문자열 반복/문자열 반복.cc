#include <bits/stdc++.h>
using namespace std;

string s;
int n, a;

int main() {
    cin >> n;

    while(n--) {
        cin >> a >> s;
        for(char c : s) {
            for(int i = 0; i < a; i++) cout << c;
        }
        cout << "\n";
    }

    return 0;
}
