import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // File file = new File("input.txt");
        // Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int minNum = 0;
        int sum = 0;

        for(int i = 0; i < 7; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num % 2 == 1) {

                if (minNum == 0)
                    minNum = num;

                if (minNum > num) {
                    minNum = num;
                }
                sum += num;
            }

        }
        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(minNum);
        }
    }
}