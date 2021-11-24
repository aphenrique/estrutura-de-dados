package circularlist;

public class MainCicularList {
    public static void main(String[] args) {
        
        CircularList<Integer> circularlist = new CircularList<>();

        circularlist.add(1);
        circularlist.add(2);
        circularlist.add(3);
        circularlist.add(4);
        circularlist.add(5);
        circularlist.add(6);
        circularlist.add(7);
        circularlist.add(8);

        System.out.println(circularlist.toString());
        
        circularlist.remove(3);
        
        System.out.println(circularlist.toString());
    }
}
