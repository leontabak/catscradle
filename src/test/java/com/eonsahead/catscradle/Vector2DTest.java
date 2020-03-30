package com.eonsahead.catscradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vector2DTest {

    private static final double EPSILON = 1E-8;

    public Vector2DTest() {
    }

    @Test
    public void testAdd() {
        Vector2D v = new Vector2D( 3, 4);
        Vector2D instance = new Vector2D( 3, 4);
        Vector2D expResult = new Vector2D( 6, 8 );
        Vector2D result = instance.add(v);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
    } // testAdd()

    @Test
    public void testScale() {
        double factor = 2.0;
        Vector2D instance = new Vector2D(3, 4);
        Vector2D expResult = new Vector2D(6, 8);
        Vector2D result = instance.scale(factor);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
    } // testScale()

    @Test
    public void testRotate() {
        double angle = Math.PI / 2;
        Vector2D instance = new Vector2D(1, 1);
        Vector2D expResult = new Vector2D(-1, 1);
        Vector2D result = instance.rotate(angle);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
    } // testRotate()

    @Test
    public void testDot() {
        Vector2D v = new Vector2D(3, 4);
        Vector2D instance = new Vector2D(3, 4);
        double expResult = 25;
        double result = instance.dot(v);
        assertEquals(expResult, result, EPSILON);
    } // testDot()

    @Test
    public void testMagnitude() {
        Vector2D instance = new Vector2D(3, 4);
        double expResult = 5.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, EPSILON);
    } // testMagnitude()

    @Test
    public void testGetX() {
        Vector2D instance = new Vector2D(3, 4);
        double expResult = 3.0;
        double result = instance.getX();
        assertEquals(expResult, result, EPSILON);
    } // testGetX()

    @Test
    public void testGetY() {
        Vector2D instance = new Vector2D(3, 4);
        double expResult = 4.0;
        double result = instance.getY();
        assertEquals(expResult, result, EPSILON);
    } // testGetY()

    @Test
    public void testToString() {
        Vector2D instance = new Vector2D(3, 4);
        String expResult = "(3.0, 4.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
    } // testToString()
} // Vector2DTest

