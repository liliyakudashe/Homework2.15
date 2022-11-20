import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new LinkedHashMap<>();
        stringMap.put(25, " двадцать пять ");
        stringMap.put(59, " пятьдесят девять ");
        stringMap.put(81, " восемьдесят один ");
        stringMap.put(54, " пятьдесят четыре ");
        stringMap.put(44, " сорок четыре ");
        stringMap.put(21, " двадцать один ");
        stringMap.put(72, " семьдесят два ");
        stringMap.put(62, " шесдесят два ");
        stringMap.put(89, " восемьдесят девять ");
        stringMap.put(33, " тридцать три ");

        System.out.println(stringMap);
    }
}