import java.util.Scanner;
public class TaxProject{
    public static void main(String[] args){
        double discount = 0;  //Age Discount 
        int kids;         // amount of kids after subtraction
        int kidDiscount;  //Kid discount
        double tier1rate; //Tier 1 rate
        double tier2rate; //Tier 2 rate
        double tier3rate; //Tier 3 rate
        double tier4rate; //Tier 4 rate
        double incomeTax = 0;
        double tier1Tax;
        double tier2Tax;
        double tier3Tax;
        double tier4Tax;
        double tier5Tax;
        double tier5rate;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        System.out.println("Enter your Income");
        int income = scan.nextInt();
        System.out.println("Enter amount of kids ");
        int kid = scan.nextInt();
        //tier 1
       if(income < 10000){
         tier1rate = 0;   
       } else if (income > 10000 && income < 25000){
           tier2rate = 0.1;
           tier2Tax = (income - 10000) * tier2rate;
           incomeTax = tier2Tax;
       }else if(income > 25000 && income < 75000){
           tier3rate = 0.2;
         tier3Tax =  (income - 25000) * tier3rate;
         incomeTax = tier3Tax + 1500;
       }else if(income > 75000 && income < 250000 ){
         tier4rate = 0.3;
         tier4Tax = (income - 75000) * tier4rate;
           incomeTax = tier4Tax + 16500 ;
       }else if (income > 250000){
         tier5rate = 0.5;
            tier5Tax = (income - 250000) * tier5rate;
            incomeTax = tier5Tax + 104000;
       }
       
       
        if(kid <= 2 && kid > 0){
             kidDiscount = 1000;
            System.out.println(kidDiscount);
        }if( kid >= 2){
            kids = kid - 2;
             kidDiscount = kids * 500;
             kidDiscount = kidDiscount + 1000;
            System.out.println(kidDiscount);
        }else{
              kidDiscount = 0;
        }
        //AGE
        if(age < 15){
             discount = 0.5;
        }else if(age < 21 && age >= 15){
             discount = 0.25;
        }else if(age < 61 && age >= 21){
              discount = 1;
        }else if(age < 72 && age >= 61){
              discount = 0.33;
        }else if(age < 80 && age >= 72){
              discount = 0.66;
        }else if(age >= 80){
              discount = 0;   
        }
        System.out.println("Gross Income:");
        System.out.println(income);
        System.out.println("Gross Income Tax:");
        System.out.println(incomeTax);
        System.out.println("Age Deductible");
        System.out.println(discount);
        System.out.println("Child stipend:");
        System.out.println(kidDiscount);
        System.out.println("Tax Ammount");
        System.out.println((incomeTax * discount) - kidDiscount);

    }
}
