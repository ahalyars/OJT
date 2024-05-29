public class break_contin{
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            
            if(i%5==0){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Over");
        int j = 0;
        while (j <= 10) {
            if (j %5 ==0) {
            j++;
            continue;
            }
        System.out.println(j);
        
        j++;
        
    } 
    System.out.println("Over");
    }
    
}