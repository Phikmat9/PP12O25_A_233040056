package pertemuan9;

public class Tugas {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 5x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();

        System.out.println("\n### Enqueue 5x ###");
        queue.enqueue(4);
        queue.enqueue(20);
        queue.enqueue(9);
        queue.enqueue(25);
        queue.enqueue(4);

        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("front: " + queue.front());

        System.out.println("\n### Dequeue 2x ###");
        int removed1 = queue.dequeue();
        System.out.println("Dequeued: " + removed1);
        int removed2 = queue.dequeue();
        System.out.println("Dequeued: " + removed2);

        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("front: " + queue.front());
    }
}
