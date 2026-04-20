#include <bits/stdc++.h>
using namespace std;

const int max_n = 104;
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};
int n, ny, nx, a[max_n][max_n], visited[max_n][max_n];
int max_h = 0, max_ret = 1, ret;

void DFS(int y, int x, int h) {
    visited[y][x] = 1;
    for(int i = 0; i < 4; i++) {
        ny = y + dy[i];
        nx = x + dx[i];
        if(ny < 0 || ny >= n || nx < 0 || nx >= n) continue;
        if(a[ny][nx] > h && !visited[ny][nx]) {
            DFS(ny, nx, h);
        }
    }
    return;
}

int main() {
    cin.tie(NULL); cout.tie(NULL);

    cin >> n;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cin >> a[i][j];
            if(a[i][j] > max_h) max_h = a[i][j];
        }
    }

    for(int h = 1; h < max_h; h++) {
        fill(&visited[0][0], &visited[0][0] + 104 * 104, 0);
        ret = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i][j] > h && !visited[i][j]) {
                    DFS(i, j, h);
                    ret++;
                }
            }
        }
        max_ret = max(max_ret, ret);
    }
    cout << max_ret << "\n";

    return 0;
}
