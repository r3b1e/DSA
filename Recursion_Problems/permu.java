import java.util.ArrayList;
public class permu {
    // printing all subarray p="",up="abc"
    public static void allsub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            allsub(f+ch+s, up.substring(1));
        }
    }
    // putting all subarray in the list ans returing it p="",up="abc"
    public static ArrayList<String> allinlist(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           ans.addAll(allinlist(f+ch+s, up.substring(1)));
        }
        return ans;
    }
    // to find number of subarray ans returing it
    public static int allincou(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           count=count + allincou(f+ch+s, up.substring(1));
        }
        return count;
    }
    public static ArrayList<String> number(String p, String up){
        // leetcode:leter combination of a phone number
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch=up.charAt(0);
        int dight = ch-'0';
        for(int i = (dight-1)*3;i < dight*3;i++){
            char s=(char)('a'+i);
            ans.addAll(number(p+s, up.substring(1)));
        }
        return ans; 
    }
    //  amazon
    // all combination with dia to get a target that is up p="",up=target=4
    public static void possi(String p, int up){
        if(up==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=up;i++){
           possi(p+i,up-i);
        }
    }
    // same as above but returing in array
    public static ArrayList<String> possiinarr(String p, int up){
        if(up==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=up;i++){
           ans.addAll(possiinarr(p+i,up-i));
        }
        return ans;
    }
    // maze 
    // printing all combination to go at end box
    public static void maze(int r, int d, String p){
        if(r==1 && d==1){
            System.out.println(p);
            return;
        }
        if(r==1){
            maze(r, d-1, p+'d');
        }
        if(d==1){
            maze(r-1, d, p+'r');
        }
        if(r>1 && d>1){
        maze(r-1, d, p+'r');
        maze(r, d-1, p+'d');
        }
    }
     // printing count to go at end box with diagonal
    public static int maze2(int r, int d, String p){
        int first=0;
        int second=0;
        int third=0;
        if(r==1 && d==1){
            return 1;
        }
        if(r==1){
            first += maze2(r, d-1, p+'d');
        }
        if(d==1){
            second += maze2(r-1, d, p+'r');
        }
        if(r>1 && d>1){
            first += maze2(r-1, d, p+'r');
            second +=maze2(r, d-1, p+'d');
            third += maze2(r-1, d-1, p+'d');
        }
        return first+second+third;
    }
    // printing all combination to go at end box with diagonal
    public static void mazewithdia(int r, int d, String p){
        if(r==1 && d==1){
            System.out.println(p);
            return;
        }
        if(r==1){
            mazewithdia(r, d-1, p+'d');
        }
        if(d==1){
            mazewithdia(r-1, d, p+'r');
        }
        if(r>1 && d>1){
        mazewithdia(r-1, d, p+'r');
        mazewithdia(r, d-1, p+'d');
        mazewithdia(r-1, d-1, p+'D');
        }
    }
    public static ArrayList<String> mazeinarr(int r, int d, String p){
        ArrayList<String> left= new ArrayList<>();
        ArrayList<String> right= new ArrayList<>();
        if(r==1 && d==1){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        // ArrayList<String> ans=new ArrayList<>();
        if(r==1){
            left=mazeinarr(r, d-1, p+'d');
        }
        if(d==1){
            right=mazeinarr(r-1, d, p+'r');
        }
        if(r>1 && d>1){
        right=mazeinarr(r-1, d, p+'r');
        left=mazeinarr(r, d-1, p+'d');
        }
        right.addAll(left);
        // ans.addAll(right);
        return right;
        
    }
    public static void maze1(int r, int d, String p){
        if(r==1 && d==1){
            System.out.println(p);
            return;
        }
        // interchangeing both if case getting different output
        if(r>1){
            maze(r-1, d, p+'r');
        }
        if(d>1){
            maze(r, d-1, p+'d');
        }
    }
    public static void main(String[] args) {
        
        // System.out.println(allincou("","abc"));
        // ArrayList<String> list=number("", "213");
        // System.out.println(list);
        System.out.println(possiinarr("", 8));
        //   System.out.println(maze2(3, 3, ""));
        // System.out.println(mazeinarr(3, 3, ""));
    } 
}
