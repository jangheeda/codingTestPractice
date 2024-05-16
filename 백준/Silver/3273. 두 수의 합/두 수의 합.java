import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    static int N, X, ans;
    static int arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 배열 크기
        arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()); // 버퍼로 한줄 데이터 받아서 문자열 나누기
        for (int i = 0; i < N; i++) { // 배열로 받아서 set으로 저장
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        X = Integer.parseInt(br.readLine()); // 두 수의 합 받기

        for(int i = 0; i < N; i++) { // arr[i] + (X - arr[i]) = X 가 존재하는지 확인
            if(set.contains(X - arr[i])) {
                ans++;
            }
        }

        System.out.println(ans/2); // 중복 카운트 나누기

    }

}