package my.task.hw9;

public class Pair<T, S> {

    private T meaning1;

    private S meaning2;

    public Pair(T meaning1, S meaning2) {
        this.meaning1 = meaning1;
        this.meaning2 = meaning2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "meaning1=" + meaning1 +
                ", meaning2=" + meaning2 +
                '}';
    }

    public T getMeaning1() {
        return meaning1;
    }

    public S getMeaning2() {
        return meaning2;
    }

    public void setMeaning1(T meaning1) {
        this.meaning1 = meaning1;
    }

    public void setMeaning2(S meaning2) {
        this.meaning2 = meaning2;
    }

    public Pair<S,T> swap() {
        return new Pair<>(this.meaning2,this.meaning1);

    }
}
