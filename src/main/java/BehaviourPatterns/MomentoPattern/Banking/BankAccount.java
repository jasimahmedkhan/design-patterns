package BehaviourPatterns.MomentoPattern.Banking;

public class BankAccount {

    public int Balance;

    public BankAccount(int Balance){
        this.Balance = Balance;
    }

    public void Deposit(int Amount){
        Balance += Amount;
    }

    public void Withdraw(int Amount){
        Balance -= Amount;
    }

    public TransactionMemento saveTransaction(){
        return new TransactionMemento(Balance);
    }

    public void restoreTransaction(TransactionMemento transactionMemento){
        Balance = transactionMemento.Amount;
    }

}
