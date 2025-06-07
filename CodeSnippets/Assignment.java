import java.util.HashMap;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 4, 2, 4};
        int n = arr.length;
       
    }
    public static void anagram(String str, int n){
       HashMap<Character, Integer> map = new HashMap<>();

       for(int i = 0;i<n;i++){
       char ch = str.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
       }
    }
}
