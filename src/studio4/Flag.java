package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//StdDraw.filledRectangle(.5, 0.5, 0.4, 0.24)
				double[] xs = {.1,.1,.3};
				double[] ys = {.5,.26,.26};
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.filledPolygon(xs, ys);
				
				StdDraw.setPenColor(200,120,240);
				double[] xs2 = {.6,.9,.9};
				double[] ys2 = {.5,.68,.36};
				StdDraw.filledPolygon(xs2, ys2);
				
				double[] xs3 = {.15,.5,.85};
				double[] ys3 = {.74,.55,.74};
				StdDraw.filledPolygon(xs3, ys3);
				
		StdDraw.setPenColor(StdDraw.BLUE);
				double[] xs4 = {.1,.1,.2,.9,.9,.8};
				double[] ys4 = {.64,.74,.74,.36,.26,.26};
		StdDraw.filledPolygon(xs4, ys4);
				
		StdDraw.setPenColor(143,170,121);
				StdDraw.filledCircle(.2, 0.4, 0.02);
				StdDraw.filledCircle(.26, 0.32, 0.02);
				
		StdDraw.setPenColor(255,215,0);
				StdDraw.filledCircle(.5, 0.65, 0.05);
				StdDraw.filledCircle(.8, 0.5, 0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(.5, 0.5, 0.4, 0.24);
	}
}