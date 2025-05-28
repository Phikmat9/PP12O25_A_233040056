package pertemuan11; 

//latihan 2
public class Graph {

    private Vertex VertexList[]; //array of ver
    private int adjMat[][];// adjacency matrix
    private int nVerts;// current number of ver

    public Graph (int maxVerts) {
        VertexList = new Vertex[maxVerts];

        adjMat = new int [maxVerts][maxVerts];
        nVerts = 0;

        for (int i=0; i < maxVerts; i++) //set adjacency
        for (int j=0; j< maxVerts; j++)
        adjMat [i][j] = 0;
    }


    //latihan 3
    public void addVertex (char lab) {
        VertexList [nVerts++] = new Vertex(lab); 
    }
    
    public void addEdge (int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    //latihan 4
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++){
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

 