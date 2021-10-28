package com.bz.banking;
import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
    /*
    * Added properties for bank application
    * Used Constructor Banking to set values
    * Used addCustomer to add customer to arrayList
    * used display function to display the details of customers added
    */
        final String bankName = "State Bank of India" ;
        long accountNumber ;
        String customerName ;
        int customerAge ;
        static ArrayList<Banking> accounts = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
        public Banking(long accountNumber, String customerName, int customerAge) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
            this.customerAge = customerAge;
        }
        public static void display(){
            System.out.println("Details of all the accounts are");
            for(Banking acc : accounts) {
                System.out.println(acc.toString());
            }
        }
        public static void addCustomer(){
            System.out.println("Enter the number of contacts to add");
            int numberOfAccounts = sc.nextInt();
            for(int i=1;i<=numberOfAccounts;i++) {
                System.out.println("Enter the details of customer "+ i);
                System.out.println("Enter the customer name");
                String customerName = sc.next();
                System.out.println("Enter the account number");
                long accountNumber = sc.nextLong();
                System.out.println("Enter the age");
                int age = sc.nextInt();
                Banking account = new Banking(accountNumber, customerName, age);
                accounts.add(account);
            }
        }

        @Override
        public String toString() {
            return
                    "bankName='" + bankName + '\'' +
                            ", accountNumber=" + accountNumber +
                            ", customerName='" + customerName + '\'' +
                            ", customerAge=" + customerAge;
        }
        public static void main(String[] args) {
            addCustomer();
            display();
        }
    }

