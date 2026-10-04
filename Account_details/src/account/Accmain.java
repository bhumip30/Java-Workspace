package account;

import java.util.Scanner;

public class Accmain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[5];

        for (int i = 0; i < 5; i++) {

            System.out.println();
            System.out.println("Enter Account Type");
            System.out.println("1. Savings Account");
            System.out.println("2. Recurring Account");

            int type = sc.nextInt();

            System.out.print("Enter Account No : ");
            int accno = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Balance : ");
            double balance = sc.nextDouble();

            if (type == 1) {

                accounts[i] = new SavingsAccount(
                        accno, name, balance
                );

            } else if (type == 2) {

                System.out.print("Enter Installment Amount : ");
                double installmentAmt = sc.nextDouble();

                System.out.print("Enter No. of Installments : ");
                int noOfInstallments = sc.nextInt();

                accounts[i] = new RecurringAccount(
                        accno,
                        name,
                        balance,
                        installmentAmt,
                        noOfInstallments
                );
            }

            System.out.print("Enter amount to withdraw : ");
            double amt = sc.nextDouble();

            // Polymorphic call
            accounts[i].withdraw(amt);
        }

        System.out.println();
        System.out.println("========== ALL ACCOUNTS ==========");

        for (int i = 0; i < 5; i++) {

            accounts[i].display();
            System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {

            accounts[i].calBalance();
            System.out.println();
        }

        sc.close();
    }
}
