package pertemuan9; //latihan 4

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        System.out.println("\n### Enqueue 3x ###");
        queue.enqueue(3);
        queue.enqueue(10);
        queue.enqueue(5);

        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());
    }
}
