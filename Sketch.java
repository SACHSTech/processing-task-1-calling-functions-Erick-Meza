import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(620, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

	// defines the thickness of the lines/shapes
    strokeWeight(12);

	// draws red equilateral triangle on the left
    stroke(255,0,0);
    fill(0,0,0,0);
    triangle(90, 310, 90, 70, 270, 200);

  // draws a blue diamond on the right side
    stroke(0,0,255);
    quad(320, 200, 440, 70, 555, 200, 440, 304);
  
  // draws a white ellipse in the center
    stroke(255,255,255);
    fill(0,0,0,0);
    ellipse(300, 190, 300, 260);

  // draws a blue line in front of the ellipse for the diamond
    stroke(0,0,255);
    line(320, 198, 440, 70);
  
  // draws a red line in front of the ellipse for the triangle
    stroke(255,0,0);
    line(90, 70, 270, 200);
    
  }
  
  // define other methods down here.
}