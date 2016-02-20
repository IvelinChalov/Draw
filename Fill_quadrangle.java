import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Fill_quadrangle implements GraphicObject  {
	
	Graphics graph;
	String col;
	
	int xcorPoly[] = {0,0,0,0};
	int ycorPoly[] = {0,0,0,0};
	
	public Fill_quadrangle(int masx[],int masy[],String color, Graphics g ){
		for(int i=0;i<4;i++)xcorPoly[i]=masx[i];
		for(int j=0;j<4;j++)ycorPoly[j]=masy[j];
		col=color;
		graph=g;
	
		
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
		
		Polygon poly = new Polygon(xcorPoly, ycorPoly, xcorPoly.length);
		graph.fillPolygon(poly);
		
	}

}
