package pertemuan9; //latihan 5

public class QueueMain5 {
      public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();

        System.out.println("\n### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("front: " + queue.front());
    }
}
