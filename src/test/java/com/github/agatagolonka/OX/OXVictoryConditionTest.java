package com.github.agatagolonka.OX;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OXVictoryConditionTest {

    @Test
    public void TestVictoryRow(){
        OXVictoryCondition board = new OXVictoryCondition();
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(1, 'x');
        board.setBoardToVictoryCondition(2, 'x');
        Assert.assertTrue(board.checkWinner());
    }
    @Test
    public void TestVictoryCol(){
        OXVictoryCondition board = new OXVictoryCondition();
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(3, 'x');
        board.setBoardToVictoryCondition(6, 'x');
        Assert.assertTrue(board.checkWinner());
    }
    @Test
    public void TestVictoryDia(){
        OXVictoryCondition board = new OXVictoryCondition();
        board.setBoardToVictoryCondition(0, 'x');
        board.setBoardToVictoryCondition(4, 'x');
        board.setBoardToVictoryCondition(8, 'x');
        Assert.assertTrue(board.checkWinner());
    }
    @Test
    public void CheckFalseField(){
        OXVictoryCondition board = new OXVictoryCondition();
        Assert.assertFalse(board.checkField(0));
    }
    @Test
    public void CheckField(){
        OXVictoryCondition board = new OXVictoryCondition();
        board.setBoardToVictoryCondition(0, 'x');
        Assert.assertTrue(board.checkField(0));
    }

}