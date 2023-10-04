package main.java.interview.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfCanceledTransactions {

    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(x -> x.getBalance() > 0)
                .flatMap(x -> x.getTransactions().stream())
                .filter(x -> x.getState().equals(State.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();

    }

    public static void main(String[] args) {
        final Transaction t1 = new Transaction(State.CANCELED, 1000L);
        final Account a1 = new Account(0L, Collections.singletonList(t1));

        final Transaction t2 = new Transaction(State.FINISHED, 8000L);
        final Transaction t3 = new Transaction(State.CANCELED, 10_000L);
        final Account a2 = new Account(8000L, Arrays.asList(t2, t3));

        final Transaction t4 = new Transaction(State.FINISHED, 9000L);
        final Transaction t5 = new Transaction(State.CANCELED, 3000L);
        final Account a3 = new Account(8000L, Arrays.asList(t4, t5));

        // 13000 expected
        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(Arrays.asList(a1, a2, a3)));
    }
}

class Transaction {
    State state;
    Long sum;

    public Transaction(State state, Long sum) {
        this.state = state;
        this.sum = sum;
    }

    public State getState() {
        return state;
    }

    public Long getSum() {
        return sum;
    }
}

class Account {
    Long balance;
    List<Transaction> transactions;

    public Account(Long balance, List<Transaction> transactions) {
        this.balance = balance;
        this.transactions = transactions;
    }

    public Long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

enum State {
    CANCELED,
    FINISHED
}
