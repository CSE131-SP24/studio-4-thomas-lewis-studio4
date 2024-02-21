package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		if (shapeType.equals("triangle"))
		{
			double[] xs = new double[3];
			double[] ys = new double[3];
			for (int i = 0; i<3; i++)
			{
			xs[i] = in.nextDouble();
			ys[i] = in.nextDouble();
			}
			if (isFilled == true)
			{
				StdDraw.filledPolygon(xs, ys);
				}
			else
			{
				StdDraw.polygon(xs, ys);	
			}
		}
		
		
		else
		{
		
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		if (shapeType.equals("ellipse"))
			if (isFilled == true)
			{
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else
			{
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}
		else if (shapeType.equals("rectangle"))
		{
		if (isFilled == true)
		{
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else
		{
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);	
		}
		}
		}
	}
}
