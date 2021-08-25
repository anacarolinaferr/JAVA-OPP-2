package com.javaopp2.actions;

public class Temperatura {

    public void temperatura(){
        String [] vCidades = {"Londres","Madrid","Nova York","Buenos Aires","Assunción","São Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int[][] mTemperatuta = {{-2,33}, {-3,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39}, {-7,26}, {-1,31}, {-10,35}};

        int[] min = {0, 99};
        int[] max = {0, 99};

        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 2;j++){
                if(min[1]==99 || min[1] > mTemperatuta[i][j]){
                    min[0] = i;
                    min[1] = mTemperatuta[i][j];
                }

                if(max[1]==99 || max[1] < mTemperatuta[i][j]){
                    max[0] = i;
                    max[1] = mTemperatuta[i][j];
                }
            }
        }

        System.out.println("Cidade com menor temperatura: "+vCidades[min[0]]+" - Temperatura = "+min[1]);
        System.out.println("Cidade com maior temperatura: "+vCidades[max[0]]+" - Temperatura = "+max[1]);
    }

}
