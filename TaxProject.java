import java.util.Scanner;
public class TaxProject{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        System.out.println("Enter your Income");
        int income = scan.nextInt();
        System.out.println("Enter amount of kids ");
        int kids = scan.nextInt();
       //tier 1
       if(income < 10000){
        int rate = 0;   
       } if(income < 25000){
        int rate = 10;
       }if(income < 75000){
        double  t3= income-25000;
        double  t3tax = t3 * .2;
        double  t2tax = 15000 * .1;
        double  t1tax = 10000;
       }if (income < 250000){

       }
       //tier 2
       //tier 3
       
       
        if(kids < 2.5 && kids > 0){
            int kidis = 1000;
            System.out.println(kidis);
        }if( kids > 2.5){
            int kd = kids - 2;
            int kdis = kd * 500;
            int kidis = kdis + 1000;
            System.out.println(kidis);
        }else{
             int kidis = 0;
        }
        if(age < 15){
            double discount = .5;
        }if(age < 21 && age > 15){
            double discount = .25;
        }if(age < 61 && age > 21){
            double  discount = 1;
        }if(age < 72 && age > 61){
            double  discount = .33;
        }if(age < 80 && age > 72){
            double  discount = .66;
        }if(age > 80){
            double  discount = 0;   
        }



    }
}