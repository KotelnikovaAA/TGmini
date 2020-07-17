package com.company;

public class AES extends Constants{

    void subBytes(int[][] state){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                state[i][j] = sBox[(state[i][j] >> 4) * 16 + (state[i][j] & 15)];
            }
        }
    }

    void shiftRows(int[][] state){
        for (int i = 1; i <= 3; i++)
            uglyShift(state, i);
    }

    void mixColumns(int[][] state){

    }

}
