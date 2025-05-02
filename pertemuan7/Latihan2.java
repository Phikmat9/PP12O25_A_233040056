package pertemuan7;

public class Latihan2 {
    public static void main(String[] args) {
      
        StukturList list = new StukturList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(6);
        list.printList();                
        System.out.println(list.find(6)); 

    
    }
}