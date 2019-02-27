/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import javafx.scene.Node;

/**
 *
 * @author Milson
 */
public class Grafo {

    private final Set<Vertice> vertices = new HashSet<>();

    public void addVertice(Vertice nodeA) {
        vertices.add(nodeA);
    }

    public Set<Vertice> getVertices() {
        return vertices;
    }
}
