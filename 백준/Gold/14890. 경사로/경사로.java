import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static int L;

    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int[] line = new int[N];
            for (int j = 0; j < N; j++) {
                line[j] = map[i][j];
            }
            if (canPass(line)) answer++;
        }

        for (int j = 0; j < N; j++) {
            int[] line = new int[N];
            for (int i = 0; i < N; i++) {
                line[i] = map[i][j];
            }
            if (canPass(line)) answer++;
        }

        System.out.println(answer);

    }

    static boolean canPass(int[] line) {
        boolean[] used = new boolean[N];

        for (int i = 0; i < N - 1; i++) {
            int cur = line[i];
            int next = line[i + 1];

            if (cur == next) continue;

            if(Math.abs(cur - next) >= 2) return false;

            if (next == cur + 1) {
                for (int j = i; j > i - L; j--) {
                    if (j < 0) return false;
                    if (line[j] != cur) return false;
                    if (used[j]) return false;
                }
                for (int j = i; j > i - L; j--) {
                    used[j] = true;
                }
            }else if (next == cur - 1) {
                for (int j = i + 1; j <= i + L; j++) {
                    if (j >= N) return false;
                    if (line[j] != next) return false;
                    if (used[j]) return false;
                }
                for (int j = i + 1; j <= i + L; j++) {
                    used[j] = true;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}