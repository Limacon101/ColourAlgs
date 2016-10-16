import java.awt.*;
import java.util.ArrayList;

/**
 * Created by James on 15/10/2016.
 */
public class ColorApp {
    public static void main(String[] args) {
        System.out.println("Working");

        HSLColor h = new HSLColor();
        GoColour g = new GoColour();
        Color c = new Color(80,30,99);

        g.calcAnal(c);
        //g.calcTert(c);
        //g.calcComp(c);

        Color c1 = new Color(45,29,99);
        Color c2 = new Color(99,29,83);
    }

}
