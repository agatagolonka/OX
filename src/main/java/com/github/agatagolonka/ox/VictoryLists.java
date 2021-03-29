package com.github.agatagolonka.ox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class VictoryLists {
    List<List<Integer>> victory;

    public VictoryLists(Integer size) {
        if (size == 3) {
            this.victory = new ArrayList<>();

           this.victory.add(Arrays.asList(1, 2, 3));
           this.victory.add(Arrays.asList(4, 5, 6));
           this.victory.add(Arrays.asList(7, 8, 9));
           this.victory.add(Arrays.asList(1, 4, 7));
           this.victory.add(Arrays.asList(2, 5, 8));
           this.victory.add(Arrays.asList(3, 6, 9));
           this.victory.add(Arrays.asList(1, 5, 9));
           this.victory.add(Arrays.asList(3, 5, 7));

        } else {
            this.victory = new ArrayList<>();
            this.victory.add(Arrays.asList(1,2,3,4,5));
            this.victory.add(Arrays.asList(6,7,8,9,10));
            this.victory.add(Arrays.asList(11,12,13,14,15));
            this.victory.add(Arrays.asList(16,17,18,19,20));
            this.victory.add(Arrays.asList(21,22,23,24,25));
            this.victory.add(Arrays.asList(1,6,11,16,21));
            this.victory.add(Arrays.asList(2,7,12,17,22));
            this.victory.add(Arrays.asList(3,8,13,18,23));
            this.victory.add(Arrays.asList(4,9,14,19,24));
            this.victory.add(Arrays.asList(5,10,15,20,25));
            this.victory.add(Arrays.asList(1,7,13,19,25));
            this.victory.add(Arrays.asList(5,9,13,17,21));



        }

    }
    boolean containsAll(List<Integer> list){
        boolean isWin=false;
        for(var v:victory){
                isWin=list.containsAll(v);
                if (isWin==true)
                    break;
            }
       return isWin;
    }
}
