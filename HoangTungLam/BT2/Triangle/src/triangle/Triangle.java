package triangle;

import java.util.ArrayList;

public class Triangle {
    int edge1;
    int edge2;
    int edge3;

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }

    public Triangle(int edge1, int edge2, int edge3) {
        this.setEdge1(edge1);
        this.setEdge2(edge2);
        this.setEdge3(edge3);
    }

    public Triangle() {
           
    }
    
    public int total_isosceles_triangle(ArrayList<Triangle> arrayListTriangle) {
        if (arrayListTriangle == null) {
            return 0;
        }
        if (arrayListTriangle.size() == 0) {
            return 0;
        }
        int index = 0;
        int length = arrayListTriangle.size();
        int total_isosceles_triangle = 0;
        while (index < length) {
            Triangle triangle = arrayListTriangle.get(index);
            int edge1 = triangle.getEdge1();
            int edge2 = triangle.getEdge2();
            int edge3 = triangle.getEdge3();
            if ((edge1 > 0 && edge2 > 0 && edge3 > 0) && ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge3 + edge2 > edge1)) 
                    && ((edge1 == edge3) || (edge1 == edge2) || (edge3 == edge2))){
                total_isosceles_triangle += 1;
            }            
            index++;
        }
        return total_isosceles_triangle;
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle_para = new Triangle(1,2,3);
        ArrayList<Triangle> arrayList = new ArrayList<>();
        arrayList.add(triangle);
        arrayList.add(triangle_para);
        System.out.println(triangle.total_isosceles_triangle(arrayList));
    }
}
