package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) { //// >>4 -- вывести левый разряд, &15 - правый

//        int[][] msg = {{0x19, 0xa0, 0x9a, 0xe9},
//                       {0x3d, 0xf4, 0xc6, 0xf8},
//                       {0xe3, 0xe2, 0x8d, 0x48},
//                       {0xbe, 0x2b, 0x2f, 0x08}};

        int[][] msg = {{1, 2, 3, 4},
                       {1, 2, 3, 4},
                       {1, 2, 3, 4},
                       {1, 2, 3, 4}};
        AES aes = new AES();
        aes.shiftRows(msg);
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(Integer.toHexString(msg[i][j]) + " ");
            }
            System.out.println();
        }
    }

}
