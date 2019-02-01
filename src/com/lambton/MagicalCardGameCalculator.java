package com.lambton;

public class MagicalCardGameCalculator {

    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        int rowNumber = 0;
        int columnNumber = 0;
        String[][] cards1 = magicalCardGameModel.getCardList();
        if (magicalCardGameModel.firstShuffleColPos.contains("A")) {
            rowNumber = 0;
            String tempArray[][]={};
            tempArray[0][0]=cards1[0][1];
            tempArray[0][1]=cards1[1][1];
            tempArray[0][2]=cards1[2][1];

            tempArray[1][0]=cards1[0][0];
            tempArray[1][1]=cards1[1][0];
            tempArray[1][2]=cards1[2][0];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];

        } else if (magicalCardGameModel.firstShuffleColPos.contains("B")) {
            rowNumber = 1;
            String tempArray[][]={};
            tempArray[0][0]=cards1[0][0];
            tempArray[0][1]=cards1[1][0];
            tempArray[0][2]=cards1[2][0];

            tempArray[1][0]=cards1[0][1];
            tempArray[1][1]=cards1[1][1];
            tempArray[1][2]=cards1[2][1];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];
        } else if (magicalCardGameModel.firstShuffleColPos.contains("C")) {
            rowNumber = 2;
        }
        return cards1;
    }
  /* public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {

   }

   public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {

   }*/

}
