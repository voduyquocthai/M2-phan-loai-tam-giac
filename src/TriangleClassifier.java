public class TriangleClassifier {
    public static String classifyTriangle(Triangle t ){

        if (t.first_side <= 0 || t.second_side <= 0 || t.third_side <= 0)
            return "Not a triangle";
        else if (t.first_side==t.second_side && t.second_side==t.third_side)
            return "Equilateral";
        else if (t.first_side==t.second_side || t.second_side==t.third_side || t.third_side==t.first_side)
            return "Isosceles";
        else if (t.first_side >= t.second_side+t.third_side || t.second_side >= t.first_side+t.third_side || t.third_side >= t.second_side+t.first_side)
            return "Not a triangle";
        else
            return  "Ordinary";
    }
}
