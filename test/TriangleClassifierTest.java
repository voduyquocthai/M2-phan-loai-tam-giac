import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void classifyTriangle01() {
        Triangle t1 = new Triangle(2,2,2);
        String expected = "Equilateral";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }@Test
    public void classifyTriangle02() {
        Triangle t1 = new Triangle(2,2,3);
        String expected = "Isosceles";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }@Test
    public void classifyTriangle03() {
        Triangle t1 = new Triangle(3,4,5);
        String expected = "Ordinary";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }@Test
    public void classifyTriangle04() {
        Triangle t1 = new Triangle(8,2,3);
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }@Test
    public void classifyTriangle05() {
        Triangle t1 = new Triangle(-1,2,1);
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }@Test
    public void classifyTriangle06() {
        Triangle t1 = new Triangle(0,1,1);
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(t1);
        assertEquals(expected,result);
    }
}