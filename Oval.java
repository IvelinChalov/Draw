import java.awt.Color;
import java.awt.Graphics;


public class Oval implements GraphicObject{

	int ovx,ovy,ovw,ovh;
	Graphics graph;
	String col;
	
	public Oval (int x, int y, int h, int w,String color, Graphics g) {
		ovx=x;
		ovy=y;
		ovh=h;
		ovw=w;
		graph=g;
		col=color;
		draw();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void draw() {
		
		if("black".equals(col))graph.setColor(Color.black);
		if("red".equals(col))graph.setColor(Color.red);
		if("blue".equals(col))graph.setColor(Color.blue);
		if("green".equals(col))graph.setColor(Color.green);
		graph.drawOval(ovx, ovy, ovw, ovh);
		
		
	}
}
