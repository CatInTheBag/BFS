package com.company;

public class Main {

    public static void main(String[] args)
    {
        BFS bfs = new BFS();
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex1.addNeighbourVertex(vertex2);
        vertex1.addNeighbourVertex(vertex3);

        vertex2.addNeighbourVertex(vertex1);

        vertex3.addNeighbourVertex(vertex1);
        vertex3.addNeighbourVertex(vertex4);

        vertex4.addNeighbourVertex(vertex3);
        vertex4.addNeighbourVertex(vertex5);

        vertex5.addNeighbourVertex(vertex4);

        bfs.bfs(vertex1);
    }
}
