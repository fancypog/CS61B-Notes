public class IntList {
    public int first;
    public IntList rest;

    public static void main(String[] args) {
        IntList L = new IntList();
        L.first = 5;
        L.rest = null;

        L.rest = new IntList();
        L.rest.first = 10;
        L.rest.rest = null;

        L.rest.rest = new IntList();
        L.rest.rest.rest = 15;
        L.rest.rest.rest = null;
    }
}