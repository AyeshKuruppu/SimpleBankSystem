import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner BankAccScner = new Scanner (System.in);

        System.out.println("Enter the Number Of Acccounts");
        int NoOfAccounts = BankAccScner.nextInt();

        int []  AccountNumbers = new int[NoOfAccounts];
        double [] AccBalance = new double[NoOfAccounts];

        for(int i=0; i<NoOfAccounts; i++){
            System.out.println("Enter the Account Number");
            AccountNumbers[i] = BankAccScner.nextInt();

            System.out.println("Enter the Account Balance ");
            AccBalance[i] = BankAccScner.nextDouble();
        }

        boolean processing = true;

        while(processing){
            System.out.println("------Bank Options------");
            System.out.println("--Choose An Option--");

            System.out.println("Choise 1 :  Deposite Money");
            System.out.println("Choise 2 :  WithDraw Money");
            System.out.println("Choose 3 :  Check Balance ");
            System.out.println("Choose 4 :  Exit");

            int choise = BankAccScner.nextInt();

            switch(choise){
                case 1 :
                    System.out.println("Enter Your Account Number");
                    int AccNo = BankAccScner.nextInt();

                    System.out.println("Enter the Deposite Money");
                    double depositeAmount = BankAccScner.nextDouble();

                    for(int i=0;i<NoOfAccounts;i++){
                        if(AccountNumbers[i] == AccNo){
                            AccBalance[i] = AccBalance[i] + depositeAmount;
                            System.out.println("Your Updated Balance is  "  +  ": "  + AccBalance[i]);
                        }else{
                            System.out.println("-------------------------------------------");
                            System.out.println("Invalid AccontNumber Check Again");
                            System.out.println("-------------------------------------------");
                        }
                    }
                    break;


                case 2:
                    System.out.println("Enter the Account Number");
                    AccNo = BankAccScner.nextInt();

                    System.out.println("Enter the WithDraw Amount");
                    double Withdrawamount = BankAccScner.nextDouble();

                    for(int i=0;i<NoOfAccounts;i++){
                        if(AccountNumbers[i] == AccNo){
                            if(AccBalance[i] > Withdrawamount){
                                AccBalance[i] = AccBalance[i] - Withdrawamount;
                                System.out.println("-------------------------------------------");
                                System.out.println("WithDraw Successful  "  + "; " + Withdrawamount);
                                System.out.println("-------------------------------------------");
                                System.out.println("Your Updated Balance is  "  + AccBalance[i]);
                                System.out.println("-------------------------------------------");
                            }else{
                                System.out.println("-------------------------------------------");
                                System.out.println("You cannot WithDraw insufficient Balance");
                                System.out.println("-------------------------------------------");
                            }
                        }else{
                            System.out.println("-------------------------------------------");
                            System.out.println("Invalid AccontNumber Check Again");
                            System.out.println("-------------------------------------------");
                        }
                    }
                    break;


                case 3:
                    System.out.println("Enter the Account Number");
                    AccNo = BankAccScner.nextInt();

                    for(int i=0;i<NoOfAccounts; i++){
                        if(AccountNumbers[i] == AccNo){
                            System.out.println("-------------------------------------------");
                            System.out.println("Your Acc Balance is   " + AccBalance[i]);
                            System.out.println("-------------------------------------------");
                        }else{
                            System.out.println("-------------------------------------------");
                            System.out.println("Invalid AccontNumber Check Again");
                            System.out.println("-------------------------------------------");
                        }
                    }
                    break;

                case 4:
                    processing=false;
                    break;

                default :

                    System.out.println("Invalid Choise");



            }
        }
        System.out.println("------------");
        System.out.println("THANK YOU");
        System.out.println("------------");
        BankAccScner.close();
    }
}