package atribuicaoreferencia;

public class MyObject {
    Integer i;

    MyObject(int value) {
        this.i = value;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return this.i.toString();
    }
}
