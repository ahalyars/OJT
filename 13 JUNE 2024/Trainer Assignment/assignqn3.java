public class assignqn3{
    public static void main(String[] args){
        //array creation
        int[] newarr = {5,3,2,1,7,6,5};
        int sum = 0;
        for(int i=0; i<newarr.length; i++){
            //check the even numbers
           if(newarr[i] % 2 == 0){
                sum= sum+newarr[i];
           }    
        }
        //printing the sum
        System.out.println("Sum of even numbers in array :"+sum);
    }
}