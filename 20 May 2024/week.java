//1.Write a Java program that takes a number from 1 to 7 and prints the corresponding
//day of the week (1 for Monday, 2 for Tuesday, etc.).


public class week {
    public static void main(String[] args) {
        int day=7;
        switch(day) {
            case 1:
            System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                    System.out.println("Wednesday");
                        break;
            case 4:
                System.out.println("Thursday");;
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                 break;
            case 7:
                System.out.println("Sunday");
            break;
            
        }
    }
}
