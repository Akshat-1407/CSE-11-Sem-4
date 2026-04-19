import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        // Comparator<Integer> lsb = new Comparator<Integer>() {
        //     public int compare(Integer a, Integer b) {
        //         if (a % 10 > b % 10)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        Comparator<Integer> lsb = (a, b) -> (a % 10 > b % 10) ? 1 : -1;

        List<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(32);
        nums.add(69);
        nums.add(87);
        nums.add(12);
        nums.add(41);

        System.out.println("Before Sorting: " + nums);

        Collections.sort(nums, lsb);
        
        System.out.println("After Sorting: " + nums);
    }
}