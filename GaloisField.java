package com.company;

public class GaloisField {

    public int mulPolynoms(int a, int b){
        int ans = 0;
        int ordOfCurBit = 0;
        while(b > 0){
            if ((b & 1) == 1){
                ans ^= mulOnX(a, ordOfCurBit);
            }
            ordOfCurBit++;
            b >>= 1;
        }
        return  ans;
    }

    private int mulOnX (int ans, int cnt){
        int highBit, remains;
        for (int i = 0; i < cnt; i++){
            highBit = ans & 0x80; ///проверяем "наличие" старшего бита а7
            remains = ((ans << 1) & 0xff);
            ans = (highBit == 0 ? remains : remains ^ 0x1b); //во втором случае вычитаем стпени M, меньшие 8
        }                                                   //сложением установленным в поле
        return ans;
    }
}
