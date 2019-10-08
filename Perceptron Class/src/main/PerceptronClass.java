/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author xofth
 */
public class PerceptronClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perceptron p = new Perceptron();
       p.Iteration();
       p.NeuralNetworkTesting(p.InputWeights, p.weight0, p.weight1);
    }
    
}
