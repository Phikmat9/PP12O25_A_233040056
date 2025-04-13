package pertemuan5;

public class Main2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
 
         list.addFirst(1);
         list.addFirst(5);
         list.addFirst(3);
         list.addFirst(6);
         list.addFirst(2);
 
         System.out.print("Sebelum remove: ");
         list.printList(); 
 
         list.removeTail(); 
 
         System.out.print("Setelah removeTail: ");
         list.printList(); 

         list.removeHead();
         System.out.print("Setelah removeTail&head: ");
         list.printList(); 
        
     }
}
