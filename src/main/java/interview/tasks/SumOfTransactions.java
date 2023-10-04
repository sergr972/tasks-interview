package src.main.java.interview.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test_Collector {
    static Map<String, Long> totalSum (List<Transaction> transactions ){
        Map<String, Long> msl = transactions.stream()
                .collect(#####PASTE YOUR CODE HERE#####));
        return msl;
    }

    public static void main(String[] args) {
        List <Transaction> ara = new ArrayList<>();
        Account ac1 = new Account("101", 2000);
        Account ac2 = new Account("102", 2500);
        Account ac3 = new Account("103", 3000);
        ara.add(new Transaction("101_1", 5000, ac1));
        ara.add(new Transaction("101_2", 5000, ac1));
        ara.add(new Transaction("102_1", 10000, ac2));
        ara.add(new Transaction("102_2", 10000, ac2));
        ara.add(new Transaction("103_1", 15000, ac3));
        ara.add(new Transaction("103_2", 15000, ac3));
        for(Map.Entry<String, Long> msl : totalSum(ara).entrySet()){
            System.out.println(msl.toString());
        }
    }
}