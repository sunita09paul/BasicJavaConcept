package Lecture3;
// 2. Interface : We can achieve the multiple interface in only Interface

public class Session2 {

	public static void main(String[] args) {
	
    circle c = new circle();
    c.draw();
    c.sketch();
    
    shape2 s = new circle();
    s.draw();
    
    
    draw d = new circle();
    d.draw();
    
	}

}
interface shape2 {
	public abstract void draw();
	
}

interface draw {
	public abstract void draw();

}
class circle implements shape2,draw{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("printing cricle");
		
	}
	public void sketch() {
		System.out.println("sketch cricle");

	}
}