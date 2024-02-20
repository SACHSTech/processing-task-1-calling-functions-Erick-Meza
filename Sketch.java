import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(20, 201, 159);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// draws red equilateral triangle on the left
    stroke(255,0,0);
    fill(20, 201, 159);
    triangle(80, 300, 80, 80, 220, 200);
  
  // draws grey ellipse in the center
    stroke(100);
    tint(255,127);
    ellipse(270, 190, 250, 220);

    stroke(255,0,0);
    strokeWeight(16);
    line(153,142,250,300);


 
  }
  
  // define other methods down here.
}