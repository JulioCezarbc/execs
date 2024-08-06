import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] palavras = {"apple", "banana", "apple", "orange", "banana", "apple", "café"};
        Map <String, Integer> map = new HashMap<>();

        for (String word: palavras){
            if (map.containsKey(word)){
                map.put(word, map.get(word) +1);
            }else {
                map.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}