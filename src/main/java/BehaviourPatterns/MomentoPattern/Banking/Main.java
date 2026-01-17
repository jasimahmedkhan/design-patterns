package BehaviourPatterns.MomentoPattern.Banking;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        TransactionHistory history = new TransactionHistory();
        System.out.println("The balance at this stage = " + account.Balance);


        account.Deposit(200);
        history.Save(account);
        System.out.println("The balance at this stage = " + account.Balance);

        account.Withdraw(100);
        history.Save(account);
        System.out.println("The balance at this stage = " + account.Balance);


        account.Deposit(200);
        history.Save(account);
        System.out.println("The balance at this stage = " + account.Balance);


        account.Withdraw(100);

        // Need to revert the transaction, some unexplained thing happened!
        history.Undo(account);
        System.out.println("The balance at this stage = " + account.Balance);
    }

}
