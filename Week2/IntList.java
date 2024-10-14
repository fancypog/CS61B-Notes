public class IntList {
    public int first;
    public IntList rest; /* A reference/address to another IntList*/

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /* size method, recursion */
    /* base case: rest == 1, size == 1 */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /* iterative size method */
    public int iterativeSize() {
        int total = 0;
        IntList p = this; /* a new pointer to point at the current item */
        while (p != null) {
            p = p.rest;
            total ++;
        }
        return total;
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.iterativeSize());
    }
}