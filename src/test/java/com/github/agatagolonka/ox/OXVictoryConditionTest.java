package com.github.agatagolonka.ox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OXVictoryConditionTest {
    int size=3;
    VictoryLists victory=new VictoryLists(size);

    @Test
    public void TestVictoryRow(){
        OXVictoryCondition board = new OXVictoryCondition(size);
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(1, 'x');
        board.setBoardToVictoryCondition(2, 'x');
        Assert.assertTrue(board.checkWinner(victory));
    }
    @Test
    public void TestVictoryCol(){
        OXVictoryCondition board = new OXVictoryCondition(size);
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(3, 'x');
        board.setBoardToVictoryCondition(6, 'x');
        Assert.assertTrue(board.checkWinner(victory));
    }
    @Test
    public void TestVictoryDia(){
        OXVictoryCondition board = new OXVictoryCondition(size);
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(4, 'x');
        board.setBoardToVictoryCondition(8, 'x');
        Assert.assertTrue(board.checkWinner(victory));
    }
    @Test
    public void CheckFalseField(){
        OXVictoryCondition board = new OXVictoryCondition(size);
        Assert.assertFalse(board.checkField(0));
    }
    @Test
    public void CheckField(){
        OXVictoryCondition board = new OXVictoryCondition(size);
        board.setBoardToVictoryCondition(0, 'x');
        Assert.assertTrue(board.checkField(0));
    }

}