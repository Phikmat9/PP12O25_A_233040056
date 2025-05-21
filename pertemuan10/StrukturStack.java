package pertemuan10;

public class StrukturStack {

    // latihan 2 atribut
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    //latihan 2 konstruktor
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    //latihan 1
    public void push(int data) {
        if (isFull()) {
            System.out.println("stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    // latihan 3 empty
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    //latihan 3 full
    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    // latihan 3 size
    public int size() {
        return TOP + 1;
    }

    // latihan3 top
    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            System.out.println("Stack kosong");
            return -1;
        }
    }

        public void printStack() {
        if (isEmpty()) {
            System.out.println();
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }
}
