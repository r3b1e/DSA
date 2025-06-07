import java.util.*;

public class Exp_2 {
    public class emp {
        String Name, Address;
        int yoj;

        emp(String name, String add, int yoj) {
            this.Name = name;
            this.Address = add;
            this.yoj = yoj;
        }

        String getname() {
            return Name;
        }

        int getyoj() {
            return yoj;
        }

        String getadd() {
            return Address;
        }
    }

    public static void main(String[] args) {
        Exp_2 outer = new Exp_2(); // Create an instance of the outer class
        emp e1 = outer.new emp("Sunny", "Ulhasnagar", 2503); // Create an instance of the inner class
        System.out.println("Name: " + e1.getname());
        System.out.println("Year of Joining: " + e1.getyoj());
        System.out.println("Address: " + e1.getadd());
    }
}
