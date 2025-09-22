import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1));   // 4
        rectangles.add(new Rectangle(2, 2));   // 8
        rectangles.add(new Rectangle(5, 1));   // 12
        rectangles.add(new Rectangle(3, 4));   // 14
        rectangles.add(new Rectangle(6, 2));   // 16
        rectangles.add(new Rectangle(1, 3));  //  8
        rectangles.add(new Rectangle(2, 5));   //  14
        rectangles.add(new Rectangle(4, 4));   //  16
        rectangles.add(new Rectangle(4, 1));   //  10
        rectangles.add(new Rectangle(10, 10)); //  40

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with a perimeter of > 10:");
        for (Rectangle r : rectangles)
        {
            if (filter.accept(r))
            {
                System.out.println(r + " Perimeter = " + 2 * (r.width + r.height));
            }
        }
    }
}