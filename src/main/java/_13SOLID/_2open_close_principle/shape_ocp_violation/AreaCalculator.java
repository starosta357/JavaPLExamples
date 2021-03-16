package _13SOLID._2open_close_principle.shape_ocp_violation;

public class AreaCalculator {
    public double areaCalc(Rectangle... rectangles){
        double area = 0;

        for (var rectangle: rectangles) {
            area += rectangle.getWidth() * rectangle.getHeight();
        }


        return area;
    }
}
