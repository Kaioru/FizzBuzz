package co.kaioru.fizzbuzz.condition;

public class BuzzCondition implements ICondition<Integer> {

    @Override
    public String getName() {
        return "Buzz";
    }

    @Override
    public boolean test(Integer data) {
        return data % 5 == 0;
    }

}
