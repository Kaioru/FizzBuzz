package co.kaioru.fizzbuzz;

import co.kaioru.fizzbuzz.condition.BuzzCondition;
import co.kaioru.fizzbuzz.condition.FizzCondition;
import co.kaioru.fizzbuzz.condition.ICondition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<ICondition<Integer>> conditions = new ArrayList<>();
        FizzCondition fizz = new FizzCondition();
        BuzzCondition buzz = new BuzzCondition();

        conditions.add(fizz);
        conditions.add(buzz);

        IntStream.rangeClosed(0, 100).forEach(i -> {
            String result = "";
            for (ICondition<Integer> condition : conditions) {
                if (condition.test(i))
                    result += condition.getName();
            }

            System.out.println(i + " : " + result);
        });
    }

}
