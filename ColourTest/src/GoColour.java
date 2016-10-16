import java.awt.*;

/**
 * Created by James on 15/10/2016.
 */
public class GoColour {

    Color c;

    GoColour() {
    }

    public void comp(Color c) {
        System.out.println(c);
    }
    public void printColour(Color c) {
        System.out.println(c.getRed());
        System.out.println(c.getGreen());
        System.out.println(c.getBlue());
        Color c100 = new Color(80,30,99);
        Color c101 = new Color(49,99,29);
    }

    public void findComp(Color c) {
        double r = c.getRed();
        double g = c.getGreen();
        double b = c.getBlue();

        double r1 = Math.sqrt(255*255 - r*r);
        double g1 = Math.sqrt(255*255 - g*g);
        double b1 = Math.sqrt(255*255 - b*b);

        Color c1 = new Color((int)r1,(int)g1,(int)b1);
        System.out.println(c1);

    }

    public Color calcComp(Color c) {
        System.out.println("Starting Colour: " + c);
        float[] f;
        f = new float[] {0,0,0};
        HSLColor h = new HSLColor();
        h.fromRGB(c,f);                             // f converted to HSL
        System.out.println(f[0]);

        if (f[0] > .5) { f[0] -= .5; }
        else { f[0] += .5; }

        System.out.println(f[0]);

        int[] y = h.toRGB(f[0],f[1],f[2]);
        Color c1 = new Color(y[0],y[1],y[2]);       // converted
        System.out.println("End Colour: " + c1);

        Color c99 = new Color(80,30,99);
        Color c100 = new Color(29,99,80);
        Color c101 = new Color(99,80,29);

        return c1;
        //99 90 30
    }

    public Color[] calcTert(Color c) {
        System.out.println("Starting Colour: " + c);
        float[] f;
        float[] f2;
        f = new float[] {0,0,0};
        f2 = new float[] {0,0,0};
        HSLColor h = new HSLColor();
        h.fromRGB(c,f);                             // f converted to HSL
        h.fromRGB(c,f2);
        System.out.println(f[0]);

        if (f[0] < 1/3) {
            f[0] += 1/3;
            f2[0] = f[0]+1/3;
        }
        else if (f[0] < 2/3){
            f[0] -= 1/3;
            f2[0] = f[0]+2/3;

        } else {
            System.out.println("1: " + f[0] + " 2: " + f2[0]);
            f[0] -= (1/3f);
            System.out.println("1: " + f[0]);
            f2[0] = f[0] - (1/3f);
            System.out.println("2: " + f2[0]);
            System.out.println("Else block");
        }
        f2[1] = f[1];
        f2[2] = f[2];

        System.out.println(f[0]);
        System.out.println(f2[0]);

        int[] y = h.toRGB(f[0],f[1],f[2]);
        Color c1 = new Color(y[0],y[1],y[2]);       // converted
        System.out.println("End Colour 1: " + c1);

        int[] y2 = h.toRGB(f2[0],f2[1],f2[2]);
        Color c2 = new Color(y2[0],y2[1],y2[2]);       // converted
        System.out.println("End Colour 2: " + c2);

        Color[] cList = new Color[] {c1, c2};

        return cList;
        //99 90 30
    }

    public Color[] calcAnal(Color c) {
        System.out.println("Starting Colour: " + c);
        float[] f;
        float[] f2;
        f = new float[] {0,0,0};
        f2 = new float[] {0,0,0};
        HSLColor h = new HSLColor();
        h.fromRGB(c,f);                             // f converted to HSL
        h.fromRGB(c,f2);
        System.out.println(f[0]);

        f[0] -= 0.08333333333;
        f2[0] += 0.08333333333;

        if (f2[0] > 1) {
            f2[0] = f2[0]-1;
        } else if (f[0] < 0) {
            f[0] = 1 + f[0];
        }
        f2[1] = f[1];
        f2[2] = f[2];

        System.out.println(f[0]);
        System.out.println(f2[0]);

        int[] y = h.toRGB(f[0],f[1],f[2]);
        Color c1 = new Color(y[0],y[1],y[2]);       // converted
        System.out.println("End Colour 1: " + c1);

        int[] y2 = h.toRGB(f2[0],f2[1],f2[2]);
        Color c2 = new Color(y2[0],y2[1],y2[2]);       // converted
        System.out.println("End Colour 2: " + c2);

        Color[] cList = new Color[] {c1, c2};

        return cList;
        //99 90 30
    }

}
