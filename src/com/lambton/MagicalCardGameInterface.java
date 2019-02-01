package com.lambton;

public class MagicalCardGameInterface {


    public interface MagicalCardGameModelInterface {
        public String[][] getFirstShuffleResult(MagicalCardGameModel
                                                        magicalCardGameModel);
        public String[][] getSecShuffleResult(MagicalCardGameModel
                                                      magicalCardGameModel);
        public String getFinalResult(MagicalCardGameModel
                                             magicalCardGameModel);
    }
}
