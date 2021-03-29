package com.github.agatagolonka.ox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OXMoveTest {
    char[] test =new char[]{'x','o'};
    @Test
    public void testGetSign() {

        OXMove tested= new OXMove(test);
        //tested.setSign('x');
        Assert.assertEquals('x', tested.getSign());
    }

    @Test
    public void testChangePlayer() {
        OXMove tested= new OXMove(test);


        //tested.setSign('x');
        tested.changePlayer();
        Assert.assertEquals("o", tested.getSign());
    }
}