package Ioc.Task.Ioc;

public class Equals {
    int a;
    int b;

    public Equals() {

    }

    public Equals(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public boolean variableEquals(int a, int b) {
        boolean result;
        this.a = a;
        this.b = b;
        if (a == b) {

            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
