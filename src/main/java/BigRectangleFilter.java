import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {

    public boolean accept(Object x) {
        if (x instanceof Rectangle)
        {
            Rectangle r = (Rectangle) x;
            int perimeter = 2 * (r.width + r.height);
            return perimeter > 10;
        }
        return false;
    }
}