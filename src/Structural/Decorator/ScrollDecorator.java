package Structural.Decorator;

public class ScrollDecorator extends Decorator {
	// Additional State
	private Object scrollBarObjectRepresentation = null;
	public ScrollDecorator (VisualComponent VisualComponentRefernce) {
	super(VisualComponentRefernce);
	 }
	@Override
	public void draw() {
	 // draw scroll bar
	 drawScrollBarObject();
	 //draw decorated VisualComponent
	 super.draw ();
	}

	
	private void drawScrollBarObject() {
		 // prepare scroll bar
		 scrollBarObjectRepresentation = new Object();
		 // drawscrollbar
		}
	} 
