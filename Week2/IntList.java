public class IntList {
    public int first;
    public IntList rest; /* A reference/address to another IntList*/


    public static void main(String[] args) {
        IntList L = new IntList();
        L.first = 5;
        L.rest = null;

        L.rest = new IntList();
        L.rest.first = 10;
        L.rest.rest = null;

        L.rest.rest = new IntList();
        L.rest.rest.first = 15;
        L.rest.rest.rest = null;
    }
}