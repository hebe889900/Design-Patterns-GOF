package Structural.Decorator;

public class GUIDriver {
public static void main(String[] args) {
// create a new VisualComponent
VisualComponent vComponent = new TextView ();
 vComponent .draw();
// at some point later - maybe text size becomes larger than the VisualComponent
//thus the scrolling behavior must be added
 // decorate the exiting VisualComponent
vComponent = new ScrollDecorator(vComponent );
 // now VisualComponent object has additional behavior / state
vComponent .draw();
}
}