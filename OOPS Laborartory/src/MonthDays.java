import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int n=sc.nextInt();

        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("Number of days: 31");
        }
        else if(n==2){
            System.out.println("Number of days: 28 / 29 ");
        }
        else if(n==4 || n== 6 || n==9 || n==11){
            System.out.println("Number of days: 30");
        }
        else{
            System.out.println("Invalid Month !...");
        }


    }
}
