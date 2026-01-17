package BehaviourPatterns.MomentoPattern.Banking;

import java.util.Stack;

public class TransactionHistory {

    public Stack<TransactionMemento> _history = new Stack<>();

    public void Save(BankAccount account){
        _history.push(account.saveTransaction());
    }

    public void Undo(BankAccount account){
        account.restoreTransaction(_history.pop());
    }

}
