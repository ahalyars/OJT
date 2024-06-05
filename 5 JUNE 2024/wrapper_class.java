import java.util.ArrayList;
public class wrapper_class {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(8);
        for( int numbers:nums)
        {
            System.out.println(numbers);
        }
    }
}
