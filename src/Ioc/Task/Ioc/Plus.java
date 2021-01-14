package Ioc.Task.Ioc;

public class Plus {
    private int a;
    private int b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int summ() {
        return a + b;
    }
}
