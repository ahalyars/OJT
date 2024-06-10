public class try_catch {
    public static void main(String[] args) {
        try
        {
            int[] nums={1,2,3,4};
            System.out.println(nums[1]);
            System.out.println(nums[5]);
           
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
