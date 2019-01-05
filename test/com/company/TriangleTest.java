package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void test() {
        Assert.assertEquals(2, Triangle.buildTriangle(2.0, 2.0, 2.0));
        Assert.assertEquals(0, Triangle.buildTriangle(500.0, 2.0, 2.0));
        Assert.assertEquals(1,  Triangle.buildTriangle(4.0, 3.0, 2.0));
        Assert.assertEquals(1,  Triangle.buildTriangle(2.0, 4.0, 3.0));
        Assert.assertEquals(1,  Triangle.buildTriangle(2.0, 3.0, 4.0));
        Assert.assertEquals(0, Triangle.buildTriangle(2.0, 3.0, 5.000000001));
        Assert.assertEquals(0, Triangle.buildTriangle(0.0, 0.0, 0.0));
        Assert.assertEquals(0, Triangle.buildTriangle(-10.0, -10.0, -10.0));
        Assert.assertEquals(0, Triangle.buildTriangle(-10.0, -10.0, -10.0));
    }
}