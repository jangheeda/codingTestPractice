import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // File file = new File("input.txt");
        // Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            int num = Integer.parseInt(sc.nextLine());
            sum += num;
            list.add(num);
        }

        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}