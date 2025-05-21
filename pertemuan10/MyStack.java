package pertemuan10;

public class MyStack extends AbstrackStack {
    
    
    public MyStack (int capacity) {
        super(capacity);
    }

    public void displaystack (String s) {
        System.out.print(s);
        System.out.print("Stack (bottm-->):");
        for (int i = 0; i < size (); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }

    public int peekN (int n){
        return arr[n];
    }
}
