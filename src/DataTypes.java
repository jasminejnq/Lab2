import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        int s = 0;
        for (int i = 0; i < numbers.size(); i++) {
            s += numbers.get(i);
        }
        return s;
    }
}
