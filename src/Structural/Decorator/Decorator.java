package Structural.Decorator;

public class Decorator implements VisualComponent {

private VisualComponent privateVisualComponentRefernce = null;
public Decorator ( VisualComponent VisualComponentRefernce) {
 this.privateVisualComponentRefernce = VisualComponentRefernce;
}
@Override
public void draw() {
privateVisualComponentRefernce.draw ();
}
public void resize() {
privateVisualComponentRefernce.resize ();
}
} 
