import java.util.ArrayList;

public class demo2 {
    // input is bbaccbbaad ,skiping a,ans printing bbccbbd
    public static void skip(StringBuilder p, String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
         char ch=s.charAt(0);
         if(ch == 'a'){
            skip(p,s.substring(1));
         }
         else{
            skip(p.append(ch),s.substring(1));
         }
    }
    // same thing as above but not using another string
    public static String skip(String s){

        if(s.isEmpty()){
            return "";
        }
         char ch=s.charAt(0);
         if(s.startsWith("a")){
           return skip(s.substring(1));
         }
         else{
           return ch+skip(s.substring(1));
         }
    }
    public static void printsub(String a, String b){
        if(b.isEmpty()){
             System.out.println(a);
             return;
        }
        printsub(a+b.charAt(0), b.substring(1));
        printsub(a, b.substring(1));
    }
    public static ArrayList<String> sub(String a, String b){
        if(b.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(a);
            return list;
        }
             ArrayList<String> left=sub(a+b.charAt(0),b.substring(1));
             ArrayList<String> right=sub(a,b.substring(1));
             left.addAll(right);
             return left;
    }
    // above this has same work as this
    public static ArrayList<String> sub(String a, String b){
        if(b.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(a);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
             ans.addAll(sub(a+b.charAt(0),b.substring(1)));
             ans.addAll(sub(a,b.substring(1)));
             return ans;
    }
    public static void main(String[] args) {
        String str="bbaccadd";
        // skip(new StringBuilder(""),str);
        // System.out.println(skip(str));
        printsub("", "abc");
    }
}
