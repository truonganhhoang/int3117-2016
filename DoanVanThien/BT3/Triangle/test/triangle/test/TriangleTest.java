/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle.test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triangle.Triangle;

/**
 *
 * @author doanvanthien
 */
public class TriangleTest {
    
    private ArrayList<Triangle> triangles;
    private Triangle triangle;

    public TriangleTest() {
        triangles = new ArrayList<>();
        triangle = new Triangle();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void test_mang_rong() {
        triangles = new ArrayList<>();
        assertEquals(0, triangles.size());
    }
    
    @Test
    public void test_mang_null() {
        triangles = null;
        assertEquals(0, triangle.total_isosceles_triangle(triangles));
    }
    
    @Test
    public void test_mang_ket_qua_dung() {
        triangles.add(new Triangle(3, 3, 4));
        triangles.add(new Triangle(3, 4, 5));
        triangles.add(new Triangle(3, 3, 3));
        triangles.add(new Triangle(2, 3, 4));
        assertEquals(2, triangle.total_isosceles_triangle(triangles));
    }
    
    @Test
    public void test_mang_ket_qua_sai_chua_so_am() {
        triangles.add(new Triangle());
        triangles.add(new Triangle(3, 3, 4));
        triangles.add(new Triangle(3, -4, 5));
        triangles.add(new Triangle(3, 3, 9));
        triangles.add(new Triangle(0, 3, 4));
        assertEquals(1, triangle.total_isosceles_triangle(triangles));
    }
}
