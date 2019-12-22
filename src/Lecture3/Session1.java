package Lecture3;
// 1. Interface

public class Session1 {

	public static void main(String[] args) {
		box b = new box();
		b.draw();
		b.sketch();
	}

}
interface shape{
	int i = 10;
	public abstract void draw();
}

class box implements shape {
	@Override
	public void draw() {
System.out.println("Shape: box");
}
public void sketch() {
	//System.out.println("Sketch: box");
System.out.println(shape.i);
}
	//public void draw() {
		//System.out.println("Shape: box");
	//}
}