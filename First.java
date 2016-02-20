import java.awt.*;
import java.awt.event.*;
public class First extends Frame implements ActionListener {
		
	 int xPoly[] = {0,0,0,0};
	 int yPoly[] = {0,0,0,0};
	// int xxPoly[] = {150,250,325,375,450,275,100};
    // int yyPoly[] = {150,100,125,225,250,375,300};
	 String draw;
     int count=0;
     Object ob[] = new Object[10];
	
	Label l1= new Label("X1");
	Label l2= new Label("X2");
	Label l3= new Label("X3");
	Label l4= new Label("X4");

	Label l5= new Label("Y1");
	Label l6= new Label("Y2");
	Label l7= new Label("Y3");
	Label l8= new Label("Y4");
	String color;
	TextField t1, t2, t3, t4, t5, t6, t7, t8 ; 
	
	Label leb[] = {l1, l2, l3, l4, l5, l6, l7, l8};
	
	
	Panel pan = new Panel();
	
	public First () {  // конструктор на класа   
		Frame frame=new Frame("F");
		frame.setResizable(false);
		frame.setTitle ("Components");               
		frame.setSize (300,300);  
		frame.addWindowListener(new WindowAdapter () {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		frame.setVisible(true);
		
		//vtori feim
		Frame frame2=new Frame("F");
		frame2.setResizable(false);
		frame2.setTitle ("Drawing bord"); 
		frame2.setSize (500,500);
		frame2.addWindowListener(new WindowAdapter () {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		frame2.setVisible(true);
		
		
		//menu

	MenuBar mbar=new MenuBar();
	Menu Choose = new Menu("Choose");
	Menu Color = new Menu("Color");
	mbar.add(Choose);
	mbar.add(Color);
	MenuItem m1=new MenuItem("Oval");
	MenuItem m2=new MenuItem("Fill oval");
	MenuItem m3=new MenuItem("Fill quadrangle");
	MenuItem m4=new MenuItem("Show array");
	MenuItem m5=new MenuItem("Draw");
	
	MenuItem col1 = new MenuItem("Black");
	MenuItem col2 = new MenuItem("Red");
	MenuItem col3 = new MenuItem("Blue");
	MenuItem col4 = new MenuItem("Green");
	
	Choose.add(m1);
	Choose.add(m2);
	Choose.add(m3);
	Choose.add(m4);
	Choose.add(m5);
	
	Color.add(col1);
	Color.add(col2);
	Color.add(col3);
	Color.add(col4);
	
	frame.setMenuBar(mbar);
	frame.setLayout(null);
	
	l1.setBounds(80, 80, 15, 50);
	l1.setVisible(true);
	frame.add(l1);
	
	l2.setBounds(80, 130, 15, 50);
	l2.setVisible(true);
	frame.add(l2);
	
	
	l3.setBounds(80, 180, 15, 50);
	l3.setVisible(true);
	frame.add(l3);
	
	l4.setBounds(80, 230, 15, 50);
	l4.setVisible(true);
	frame.add(l4);
	
	l5.setBounds(155, 80, 15, 50);
	l5.setVisible(true);
	frame.add(l5);
	
	l6.setBounds(155, 130, 15, 50);
	l6.setVisible(true);
	frame.add(l6);
	
	
	l7.setBounds(155, 180, 15, 50);
	l7.setVisible(true);
	frame.add(l7);
	
	l8.setBounds(155, 230, 15, 50);
	l8.setVisible(true);
	frame.add(l8);
	
	//textfield
	
	t1= new TextField ("0",22);
	t1.setBounds(100, 95, 50, 22);
	frame.add(t1);
	
	t2= new TextField ("0",22);
	t2.setBounds(100, 145, 50, 22);
	frame.add(t2);
	
	t3= new TextField ("0",22);
	t3.setBounds(100, 195, 50, 22);
	frame.add(t3);
	
	t4= new TextField ("0",22);
	t4.setBounds(100, 245, 50, 22);
	frame.add(t4);
	
	t5= new TextField ("0",22);
	t5.setBounds(180, 95, 50, 22);
	frame.add(t5);
	
	t6= new TextField ("0",22);
	t6.setBounds(180, 145, 50, 22);
	frame.add(t6);
	
	t7= new TextField ("0",22);
	t7.setBounds(180, 195, 50, 22);
	frame.add(t7);
	
	t8= new TextField ("0",22);
	t8.setBounds(180, 245, 50, 22);
	frame.add(t8);
	
	
	//panel
	frame2.setLayout(null);
	pan.setBounds(8,8, 500, 500);
	frame2.add(pan);
	
	Choose.addActionListener(this);
	Color.addActionListener(this);
	
	
	
		
		
	
	}//end constructor
	
	
	public static void main(String[] args) {
		
		//dobavqne na komponenti
		First fr = new First();
		
		
		
	}// end main
	
	
	public void actionPerformed(ActionEvent e){
		String ch;
    	ch=e.getActionCommand(); 
    	
    	if("Black".equals(ch)) color = "black";
    	if("Red".equals(ch)) color = "red";
    	if("Blue".equals(ch)) color = "blue";
    	if("Green".equals(ch)) color = "green";
    	
    	
    	
    	if("Oval".equals(ch)) {
    		for(int i=4;i<leb.length;i++)leb[i].setVisible(false);
    		t5.setVisible(false);            
    		t6.setVisible(false);
    		t7.setVisible(false);
    		t8.setVisible(false);
    		l1.setText("X");
    		l2.setText("Y");
    		l3.setText("W");
    		l4.setText("H");
    		draw="Oval";
    		
    	}
  
    	if("Fill oval".equals(ch)) {
    		for(int i=4;i<leb.length;i++)leb[i].setVisible(false);
    		t5.setVisible(false);            
    		t6.setVisible(false);
    		t7.setVisible(false);
    		t8.setVisible(false);
    		l1.setText("X");
    		l2.setText("Y");
    		l3.setText("W");
    		l4.setText("H");
    		draw="Fill oval";
    		
    		
    	}
      
    	if("Fill quadrangle".equals(ch)) {
    		for(int i=4;i<leb.length;i++)leb[i].setVisible(true);
    		t5.setVisible(true);            
    		t6.setVisible(true);
    		t7.setVisible(true);
    		t8.setVisible(true);
    		l1.setText("X1");
    		l2.setText("X2");
    		l3.setText("X3");
    		l4.setText("X4");
    		l5.setText("Y1");
    		l6.setText("Y2");
    		l7.setText("Y3");
    		l8.setText("Y4");
    		draw="Fill quadrangle";
    	}
    	
    	if("Show array".equals(ch)) {
    		System.out.println(count);
    		System.out.println("Object Array");
    		for(int i=0;i<count;i++) System.out.print(ob[i]+" ");
    	}
    	
    	if("Draw".equals(ch)){
    		
    		if("Oval".equals(draw)){
    			
    			try{	
    				int okrx = Integer.parseInt(t1.getText());
    				int okry = Integer.parseInt(t2.getText());
    				int okrW = Integer.parseInt(t3.getText());
    				int okrH = Integer.parseInt(t4.getText());
    				Oval ov = new Oval(okrx, okry, okrW, okrH, color ,pan.getGraphics());
    				ob[count]=ov;
    				count++;
    			}
        		catch(NumberFormatException p){
        			System.out.println("Not integer value");
        		}	
        	
        		
        	
        	}
    		
    		if("Fill oval".equals(draw)){
    			
    			try{
    				
    				int okrx = Integer.parseInt(t1.getText());
    				int okry = Integer.parseInt(t2.getText());
    				int okrW = Integer.parseInt(t3.getText());
    				int okrH = Integer.parseInt(t4.getText());
    				Fill_oval fov = new Fill_oval(okrx, okry, okrW, okrH, color ,pan.getGraphics());
    				ob[count]=fov;
    				count++;
    				
    			}
    			catch(NumberFormatException p){
        			System.out.println("Not integer value");
        		}	
    			
    			
    		}
    		
    		if("Fill quadrangle".equals(draw)){
    			
    			try{
    			
    			xPoly[0] = Integer.parseInt(t1.getText());
        		xPoly[1] = Integer.parseInt(t2.getText());
        		xPoly[2] = Integer.parseInt(t3.getText());
        		xPoly[3] = Integer.parseInt(t4.getText());
        		yPoly[0] = Integer.parseInt(t5.getText());
        		yPoly[1] = Integer.parseInt(t6.getText());
        		yPoly[2] = Integer.parseInt(t7.getText());
        		yPoly[3] = Integer.parseInt(t8.getText());
        		
        		Fill_quadrangle Fquad = new Fill_quadrangle(xPoly, yPoly,color, pan.getGraphics());
        		ob[count]=Fquad;
        		count++;
    			}
    			catch(NumberFormatException p){
        			System.out.println("Not integer value");
        		}	
    			
    		}
    		
    		
    		
    	}
    		
    		
    	
		
    	
	}	
	
	

}
