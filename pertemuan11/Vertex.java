package pertemuan11; //latihan 1

public class Vertex {

    private char label; //label (e.g. 'A')
    private boolean wasVisited;

    public Vertex (char lab) { //constructor
        label = lab;
        wasVisited = false;
    }

    // setter & getter
    public void setLab (char lab) { 
        this.label = lab; 
    }
    public char getLabel() { 
        return label; 
    }

    public void setWasVisited (boolean wasVisited ) {
        this.wasVisited = wasVisited;
    }

    public boolean getWasVisited () {
        return wasVisited;
    }
}
