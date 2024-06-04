import java.util.ArrayList;
import java.util.Collections;
public class sort_array {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(0);
        nums.add(3);
        Collections.sort(nums);
        for(int num_S:nums)
        {
            System.out.println(num_S);
        }

    }
}
