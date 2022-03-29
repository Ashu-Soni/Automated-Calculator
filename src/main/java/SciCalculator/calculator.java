package SciCalculator;

import java.util.Scanner;
import java.lang.Math;

public class calculator {
    public double sqrt(double value){
        return Math.sqrt(value);
    }

    public long factorial(int value){
        int tp = value;
        long ans=1;
        while (tp>0){
            ans*=tp;
            tp--;
        }
        return ans;
    }

    public double natural_log(double value){
        return Math.log(value);
    }

    public double power(double value, int p){
        double ans=1;
        for(int i=1;i<=p;i++){
            ans*=value;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("##### Automated Calculator Program #####");
        System.out.println("########################################");

        boolean flag=true;

        calculator cal = new calculator();

        while (flag){
            System.out.println("Calculator Options");
            System.out.println("1. square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm(base e)");
            System.out.println("4. Power Function");
            System.out.println("5. Quit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the value: ");
                    double one = sc.nextDouble();
                    System.out.println("Answer is "+cal.sqrt(one));
                    break;

                case 2:
                    System.out.println("Enter the value: ");
                    int two = sc.nextInt();
                    System.out.println("Answer is "+cal.factorial(two));
                    break;

                case 3:
                    System.out.println("Enter the value: ");
                    double three = sc.nextDouble();
                    System.out.println("Answer is "+cal.natural_log(three));
                    break;

                case 4:
                    System.out.println("Enter the base: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter the power: ");
                    int power = sc.nextInt();
                    System.out.println("Answer is "+cal.power(base, power));
                    break;

                case 5:
                    flag=false;
                    break;

                default:
                    System.out.println("Enter valid choice!!");
            }
        }
    }
}
