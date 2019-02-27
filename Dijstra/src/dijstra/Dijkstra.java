/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Milson
 */
public class Dijkstra {
    
    public static Grafo calcular(Grafo grafo, Vertice inicio) {
        inicio.setDistancia(0);
        Set<Vertice> verticesProcessados = new HashSet<>();
        Set<Vertice> verticesNaoProcessados = new HashSet<>();
        verticesNaoProcessados.add(inicio);
        while (verticesNaoProcessados.size() != 0) {
            Vertice verticeAtual = getMenorDistancia(verticesNaoProcessados);
            verticesNaoProcessados.remove(verticeAtual);
            for (Map.Entry< Vertice, Integer> paraAdjacente
                    : verticeAtual.getVerticeAdjacente().entrySet()) {
                Vertice verticeAdjacente = paraAdjacente.getKey();
                Integer pesoAresta = paraAdjacente.getValue();
                if (!verticesProcessados.contains(verticeAdjacente)) {
                    CalcularDistanciaMinia(verticeAdjacente, pesoAresta, verticeAtual);
                    verticesNaoProcessados.add(verticeAdjacente);
                }
            }
            verticesProcessados.add(verticeAtual);
        }
        return grafo;
    }
        
    private static Vertice getMenorDistancia(Set<Vertice> verticeNaoProcessado) {
        Vertice vertice_menor_distancia = null;
        int int_menor_distancia = Integer.MAX_VALUE;
        for (Vertice vertice : verticeNaoProcessado) {
            int menor_dist_vertice = vertice.getDistancia();
            if (menor_dist_vertice < int_menor_distancia) {
                int_menor_distancia = menor_dist_vertice;
                vertice_menor_distancia = vertice;
            }
        }
        return vertice_menor_distancia;
    }

    private static void CalcularDistanciaMinia(Vertice verticeSendoProcessado, Integer pesoAresta, Vertice verticeOrigem) {
        Integer distanciaOrigem = verticeOrigem.getDistancia();
        if (distanciaOrigem + pesoAresta < verticeSendoProcessado.getDistancia()) {
            verticeSendoProcessado.setDistancia(distanciaOrigem + pesoAresta);
            LinkedList<Vertice> caminhoCurto = new LinkedList<>(verticeOrigem.getCaminhoMaisCurto());
            caminhoCurto.add(verticeOrigem);
            verticeSendoProcessado.setCaminhoMaisCurto(caminhoCurto);
        }
    }
    
}
