import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate todaySeoul = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(todaySeoul);
    }
}