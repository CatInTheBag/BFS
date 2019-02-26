package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
   private int name;
   private boolean visited;
   private List<Vertex> neighbours;

   public Vertex(int name)
   {
      this.name = name;
      neighbours = new ArrayList<>();

   }

   public void setName(int name)
   {
      this.name = name;
   }

   public int getName()
   {
      return name;
   }

   public void setVisited(boolean visited)
   {
      this.visited = visited;
   }

   public void setNeighbours(List<Vertex> neighbours)
   {
      this.neighbours = neighbours;
   }

   public boolean isVisited()
   {
      return visited;
   }

   public List<Vertex> getNeighbours()
   {
      return neighbours;
   }

   @Override
   public String toString()
   {
      return "" + this.name;
   }

   public void addNeighbourVertex(Vertex vertex)
   {
      this.neighbours.add(vertex);
   }
}
