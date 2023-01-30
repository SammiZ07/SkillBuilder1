import java.util.Scanner;
import java.lang.Math;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class  SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double expression1 = Math.sqrt(5)/Math.pow(spice,3);
        double expression2 = Math.pow(2,expression1);
        double expression3 =expression2 * 1.33333333;
        System.out.printf("Well %s, the spice value resulted in %f\n",name,expression3);
        System.out.printf("And the converted value is %2f\n", expression3);
    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + "square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: " + "%.2f gallons\n",gallonsPaintNeeded);
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        cansNeeded = (int)gallonsPaintNeeded;
        if (wallArea % squareFeetPerGallons > 0)
        {
            cansNeeded += 1;
        }
        System.out.println("Cans needed: " + cansNeeded + "can(s)");
    }
}
