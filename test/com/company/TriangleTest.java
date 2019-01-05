package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void test() {
        Assert.assertTrue(Triangle.buildTriangle(2.0, 2.0, 2.0));
        Assert.assertFalse(Triangle.buildTriangle(500.0, 2.0, 2.0));
        Assert.assertTrue(Triangle.buildTriangle(5.0, 3.0, 2.0));
        Assert.assertTrue(Triangle.buildTriangle(2.0, 5.0, 3.0));
        Assert.assertTrue(Triangle.buildTriangle(2.0, 3.0, 5.0));
        Assert.assertFalse(Triangle.buildTriangle(2.0, 3.0, 5.000000001));
        Assert.assertFalse(Triangle.buildTriangle(0.0, 0.0, 0.0));
        Assert.assertFalse(Triangle.buildTriangle(-10.0, -10.0, -10.0));
        Assert.assertFalse(Triangle.buildTriangle(-10.0, -10.0, -10.0));
    }
}