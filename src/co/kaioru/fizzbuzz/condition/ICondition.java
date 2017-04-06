package co.kaioru.fizzbuzz.condition;

public interface ICondition<T> {

    String getName();

    boolean test(T data);

}
