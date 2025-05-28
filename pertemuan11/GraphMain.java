package pertemuan11;

//latihan 5
public class GraphMain {

    // public static void main(String[] args) {
    //     Graph graph = new Graph(5);

    //     //menambah vertex
    //     graph.addVertex('A');
    //     graph.addVertex('B');
    //     graph.addVertex('C');
    //     graph.addVertex('D');
    //     graph.addVertex('E');

    //     //menambahkan edge
    //     graph.addEdge(0, 1); //AB
    //     graph.addEdge(1, 2); //BC
    //     graph.addEdge(0, 3); //AD
    //     graph.addEdge(3, 4); //DE
    //     graph.adjacencyMatrix();
    //     System.out.println();
    // }


    //latihan 6
     public static void main(String[] args) {
        Graph graph = new Graph(4);

        //menambah vertex
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
       

        //menambahkan edge
        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 3); //BD
        graph.addEdge(0, 3); //AD
        graph.addEdge(0, 2); //AC
        graph.adjacencyMatrix();
        System.out.println();
    }
    
}
