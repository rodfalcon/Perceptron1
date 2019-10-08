package main;

public class Perceptron {
   double InputWeights[][] = {{-0.5441}, {0.5562}, {-0.4074}};
   double weight0[] = {-1,2,2};
   double weight1[] = {-1,4,4};
   double FunctionActivation;
   double limiar = 0.0;
   double calculateU0;
   int fLinear; int output1 = 1; int output2 = 0;
   double LearningRate = 0.1;
   
   public void Iteration()
   {
       int n = 0;
       while(n < 5)
       {
           InputWeights = input0(InputWeights);
           for (int i = 0; i < InputWeights.length; i++) 
           System.out.println("Weights w = \t" + InputWeights[i][0]);
           
           System.out.println("Value of f = \t" + fLinear);
           
           
           InputWeights = input1(InputWeights);
           for (int i = 0; i < InputWeights.length; i++) 
           System.out.println("pesos w = \t" + InputWeights[i][0]);
               
           System.out.println("Value of f = \t" + fLinear);
           
           n = n+1;
           System.out.println("Number of Practices = " + n + "\n" );
       }
   }

    private double[][] input0(double[][] prInputWeights) 
    {
        System.out.println("Entrada 0");
        this.InputWeights = prInputWeights;
        calculateU0 = 0;
        for (int i = 0; i <weight0.length; i++) 
        calculateU0 += weight0[i]*InputWeights[i][0];
            //System.out.println("PESO 0[" + i + "] = " + weight0[i] );
            //System.out.println("PESOS DE ENTRADA[" + i + "][0] = " + InputWeights[i][0] );
            System.out.println("u0 = " + calculateU0);
            
            if(calculateU0 > limiar) fLinear = 1;
            else fLinear = 0;
            
            for (int j = 0; j < weight0.length; j++) {
                InputWeights[j][0] = InputWeights[j][0] + LearningRate*(output1 - fLinear)*weight0[j];
                //System.out.println("PESOS W = \t" + InputWeights[j][0]);
            }
        
        return InputWeights;
    }

    private double[][] input1(double[][] prInputWeights) 
    {
        System.out.println("Entrada 1");
        this.InputWeights = prInputWeights;
        calculateU0 = 0;
        for (int i = 0; i <weight1.length; i++) 
        {
            calculateU0 += weight1[i] * InputWeights[i][0];
            System.out.println("PESO 1[" + i + "] = " + weight1[i] );
                //System.out.println("PESOS DE ENTRADA[" + i + "][0] = " + InputWeights[i][0] );
        }
        System.out.println("u0 = " + calculateU0);
            
            if(calculateU0 > limiar) fLinear = 1;
            else fLinear = 0;
            
            for (int j = 0; j < InputWeights.length; j++) {
                InputWeights[j][0] = InputWeights[j][0] + LearningRate*(output2 - fLinear)*weight1[j];
                //System.out.println("PESOS W = \t" + InputWeights[j][0]);
            }
        
        return InputWeights;   
    }
   
   public void NeuralNetworkTesting(double[][] prInputWeights, double[]input0, double[]input1)
   {
       System.out.println("TESTE DA REDE NEURAL\n");
       this.InputWeights = prInputWeights;
       weight0 = this.weight0;
       weight1 = this.weight1;
       
       for (int i = 0; i < InputWeights.length; i++) 
       {
           System.out.println("PESOS RESULTANTE DO TREINAMENTO ");
           System.out.println("w[" + i + "][0] = " + InputWeights[i][0]);
       }
       
       calculateU0 = 0;
       for (int i = 0; i < weight0.length; i++) 
       {
           calculateU0 += weight0[i]*InputWeights[i][0];
           
           if(calculateU0 > limiar) fLinear = 1;
           else fLinear = 0;
       }    
           System.out.println("\nU0 = " + calculateU0); 
           System.out.println("TESTE DA ENTRADA X0 SAÍDA Y = " + fLinear);
        
       
        for (int i = 0; i < weight1.length; i++) 
        {
           calculateU0 += weight1[i]*InputWeights[i][0];
           
           if(calculateU0 > limiar) fLinear = 1;
           else fLinear = 0;
        }  
           System.out.println("\nU0 = " + calculateU0); 
           System.out.println("TESTE DA ENTRADA X1 SAÍDA Y = " + fLinear);
         
   }
}
