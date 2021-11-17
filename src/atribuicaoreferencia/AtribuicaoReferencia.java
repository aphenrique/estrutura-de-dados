package atribuicaoreferencia;

public class AtribuicaoReferencia {

    public static void main(String[] args) {
        MyObject obj1 = new MyObject(1);
        MyObject obj2 = obj1;

        System.out.println("Obj1: " + obj1.toString());
        System.out.println("Obj2: " + obj2.toString());
        System.out.println("------------");
        obj2.setI(2);
        System.out.println("Obj1: " + obj1.toString());
        System.out.println("Obj2: " + obj2.toString());
    }
}