package co.kaioru.fizzbuzz.condition;

public class FizzCondition implements ICondition<Integer> {

    @Override
    public String getName() {
        return "Fizz";
    }

    @Override
    public boolean test(Integer data) {
        return data % 3 == 0;
    }

}
