package curso._3_stream.operacoes_complexas;

import curso._3_stream.base.Trader;
import curso._3_stream.base.Transaction;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(brian, 2011, 9000),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        /*transactions._3_stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        /*String traderStr = transactions._3_stream()
                .map((t) -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (s1, s2) -> s1 + s2);

        System.out.println(traderStr);*/

        /*String traderStr = transactions._3_stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(","));

        System.out.println(traderStr);*/

        /*Long quantidade = transactions._3_stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.counting());

        System.out.println(quantidade);*/

        /*Map<String,Long> quantidades = transactions._3_stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(quantidades);*/

        /*Map<Boolean, List<Transaction>> particioning = transactions._3_stream()
                .collect(Collectors.partitioningBy((Transaction t) -> t.getYear() > 2012));

        System.out.println(particioning);*/


        /*Map<String, Double> grupo = transactions._3_stream()
                .collect(Collectors.groupingBy((Transaction t) -> t.getTrader().getName(),
                        Collectors.summingDouble(Transaction::getValue)));

        System.out.println(grupo);*/
    }

}
