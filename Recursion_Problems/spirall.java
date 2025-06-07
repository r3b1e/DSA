import java.util.*;
import java.util.ArrayList;

public class spirall {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 4, 5};
        boolean[] istrue = {false};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findThree(arr, 3, 0, list, istrue));
        System.out.println(list);
       
    //     int start = 0, end = 8;
    // while (start <= end) {
    //     int mid = start + (end-start) / 2;
    //     if (n[mid]>5) start = mid + 1;
    //     else end = mid-1;            
    // }        
    // System.out.println(end);
        // int rs = 0;
        // int cs = 0;

        // int[][] matrix = {
        //     {1, 2, 3, 4, 5},
        //     {4, 5, 6, 4, 9},
        //     {7, 8, 9, 4, 0},
        //     {8, 5, 6, 7, 3}
        // };

        // int re = matrix.length - 1;
        // int ce = matrix[0].length - 1;

        // while (rs <= re && cs <= ce) {
        //     // Traverse right
        //     for (int i = cs; i <= ce; i++) {
        //         System.out.print(matrix[rs][i] + " ");
        //     }
        //     rs++;

        //     // Traverse down
        //     for (int i = rs; i <= re; i++) {
        //         System.out.print(matrix[i][ce] + " ");
        //     }
        //     ce--;

        //     // Traverse left
        //     if (rs <= re) { // Ensure we are still within bounds
        //         for (int i = ce; i >= cs; i--) {
        //             System.out.print(matrix[re][i] + " ");
        //         }
        //         re--;
        //     }

        //     // Traverse up
        //     if (cs <= ce) { // Ensure we are still within bounds
        //         for (int i = re; i >= rs; i--) {
        //             System.out.print(matrix[i][cs] + " ");
        //         }
        //         cs++;
        //     }
        // }
    }
   
    public static ArrayList<Integer> findThree(int[] arr, int n, int look, ArrayList<Integer> list, boolean[] istrue) {
        if (n == 0 && !istrue[0]) {
            System.out.println(list);
            istrue[0] = true;
            return list;
        }

        for (int i = look; i < arr.length; i++) {
            if (list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                findThree(arr, n - 1, i + 1, list, istrue);
                list.remove(list.size() - 1);
                if (istrue[0]) {
                    return list;
                }
            }
           
            }
            return list;
        }
    }
