package pertemuan7;

public class Latihan2 {
    public static void main(String[] args) {
      
        StukturList list = new StukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.printList();                
        System.out.println(list.find(6)); 

    
    }
}