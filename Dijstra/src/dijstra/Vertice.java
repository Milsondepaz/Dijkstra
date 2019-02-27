/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Milson
 */
public class Vertice {
    
    private String nome;     
    private List<Vertice> caminhoMaisCurto = new LinkedList<>();     
    private Integer distancia = Integer.MAX_VALUE;
     
    Map<Vertice, Integer> verticeAdjacente = new HashMap<>();
 
    public void addAdjacencia(Vertice verticeDestino, int distancia) {
        verticeAdjacente.put(verticeDestino, distancia);
    }
  
    public Vertice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vertice> getCaminhoMaisCurto() {
        return caminhoMaisCurto;
    }

    public void setCaminhoMaisCurto(List<Vertice> caminhoMaisCurto) {
        this.caminhoMaisCurto = caminhoMaisCurto;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Map<Vertice, Integer> getVerticeAdjacente() {
        return verticeAdjacente;
    }

    public void setVerticeAdjacente(Map<Vertice, Integer> verticeAdjacente) {
        this.verticeAdjacente = verticeAdjacente;
    }
    
    
    
}
