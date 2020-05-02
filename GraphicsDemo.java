
package toado2d;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GraphicsDemo extends JPanel implements MouseListener {

	public int x = 200, x1;
	public int y = 200, y1;
        public int m = 200, m1;
	public int n = 200, n1;
        

	JLabel label = new JLabel();

	public GraphicsDemo() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		this.setBounds(200, 0, 500, 500);

		label.setBounds(160, 410, 150, 40);
		label.setText("Coordinate Axes");
		this.add(label);

		Graphics2D g2d = (Graphics2D) g;

		Axis(g2d);
		this.addMouseListener(this);
		if (x % 5 == 1)
			x = x - 1;
		if (x % 5 == 2)
			x = x - 2;
		if (x % 5 == 3)
			x = x + 2;
		if (x % 5 == 4)
			x = x + 1;

		if (y % 5 == 1)
			y = y - 1;
		if (y % 5 == 2)
			y = y - 2;
		if (y % 5 == 3)
			y = y + 2;
		if (y % 5 == 4)
			y = y + 1;
                
                if (m % 5 == 1)
			m = m - 1;
		if (m % 5 == 2)
			m = m - 2;
		if (m % 5 == 3)
			m = m + 2;
		if (m % 5 == 4)
			m = m + 1;
                
                if (n % 5 == 1)
			n = n - 1;
		if (n % 5 == 2)
			n = n - 2;
		if (n % 5 == 3)
			n = n + 2;
		if (n % 5 == 4)
			n = n + 1;
                
                if (x % 5 == 0 && y % 5 == 0 && m % 5 == 0 && n % 5 == 0) {
			drawAPoint(g2d);
                        //DDA(g2d);
                        //midpoint(g2d);
                        HCN(g2d);
		}

	}

	
	public void drawAPoint(Graphics2D g2d) {
		g2d.setColor(Color.RED);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(x, y, x, y);
//		g2d.setColor(Color.BLUE);
//		g2d.setFont(new Font("", Font.BOLD, 20));
//		x1 = x / 5;
//		y1 = y / 5;
//		if (x1 <= 40)
//			x1 = x1 - 40;
//		else
//			x1 = x1 - 40;
//		if (y1 >= 40)
//			y1 = 40 - y1;
//		else
//			y1 = 40 - y1;
//		g2d.drawString("A(" + x1 + "," + y1 + ")", x, y + 30);
                
                g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(m, n, m, n);
//		g2d.setColor(Color.BLUE);
//		g2d.setFont(new Font("", Font.BOLD, 20));
//		m1 = m / 5;
//		n1 = n / 5;
//		if (m1 <= 40)
//			m1 = m1 - 40;
//		else
//			m1 = m1 - 40;
//		if (n1 >= 40)
//			n1 = 40 - n1;
//		else
//			n1 = 40 - n1;
//		g2d.drawString("B(" + m1 + "," + n1 + ")", m, n + 30);
               
        }

        public void Axis(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i = 0; i <= 80; i++) {
			g2d.drawLine(5 * i, 0, 5 * i, 400);
			g2d.drawLine(0, 5 * i, 400, 5 * i);
		}
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(Color.BLACK);
		g2d.drawLine(0, 200, 400, 200);
		g2d.drawLine(200, 0, 200, 400);

	}
//        public void DDA(Graphics2D g2d){
//            int dx,dy;
//            int xet=1;
//            float Xinc,Yinc,x2,y2,steps;
//            int tamx,tamy;
//            
//            if(x>m||y>n){
//            tamx=x;
//            x=m;
//            m=tamx;       
//            tamy=y;
//            y=n;
//            n=tamy;          
//            }            
//            dx = m - x;
//            dy = n - y;
//            g2d.setColor(Color.yellow);
//            g2d.setStroke(new BasicStroke(5));
//            g2d.drawLine(x, y, x, y);
//            
//            if(dx>dy){
//                steps = Math.abs(dx);
//            }else{
//                steps = Math.abs(dy);
//            }
//            x2 = x;
//            y2 = y;
//            Xinc = dx/steps;
//            Yinc = dy/steps;
//            while(xet<=steps){
//                xet++;
//                x2+=Xinc;
//                y2+=Yinc;
//                
//                g2d.setColor(Color.red);
//                g2d.setStroke(new BasicStroke(5));
//                g2d.fillOval(Math.round(x2), Math.round(y2), 5, 5);
//                
//            }
//        }
        public void DDA(Graphics2D g2d,int x, int y, int m, int n){
//            int dx,dy,c1,c2,p;
//            int tamx,tamy,x2,y2;
//            if(x>m){
//                tamx=x;
//                x=m;
//                m=tamx;       
//                tamy=y;
//                y=n;
//                n=tamy;          
//              }
//            dx = m-x;
//            dy = n-y;
//            p=2*dy-dx;
//            c1=2*dy;
//            c2=2*(dy-dx);
//            x2 = x;
//            y2 = y;
//            g2d.setColor(Color.green);
//            g2d.setStroke(new BasicStroke(5));
//            g2d.fillOval(x2,y2, 4, 4);
//            
//            while(x2<m){
//                if(p>0){
//                    p+=c1;
//                }else{
//                    y2++;
//                    p+=c2;
//                }
//            x2++;
//            g2d.setColor(Color.yellow);
//            g2d.setStroke(new BasicStroke(5));
//            g2d.fillOval(x2,y2, 4, 4);
//            }
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x2,y2,steps;
            int tamx,tamy;
            
            if(x>m || y>n){
            tamx=x;
            x=m;
            m=tamx;       
            tamy=y;
            y=n;
            n=tamy;          
            }            
           
            dy=n-y;
            dx=m-x;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x2=x;
            y2=y;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    for(int i=0;i<5;i++){
                    steps--;
                    x2=x2+Xinc;
                    y2=y2+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x2), Math.round(y2), 3, 3);
                    }   
                }
                xet++;
            }
    }
	public void HCN(Graphics2D g2d){
           if(x!=m && y!=n){ 
            DDA(g2d,x,y,m,n);
            DDA(g2d,x,n,m,n);
            DDA(g2d,m,n,m,y);
            DDA(g2d,x,y,m,y);
            DDA(g2d,x,y,x,n);
           }else{
            DDA(g2d,x,y,m,n);
           }
        }

	public void mousePressed(MouseEvent e) {
		if (e.getClickCount() == 2) {
			Point p = e.getPoint();
			x = (int) Math.round(e.getX());
			y = (int) Math.round(p.getY());
			if (x <= 400 && y <= 400) {
//				System.out.println(x);
//				System.out.println(y);
				x1 = x / 5;
				y1 = y / 5;
				if (x1 <= 40)
                                        x1 = x1 - 40;
				else
					x1 = x1 - 40;
				if (y1 >= 40)
					y1 = 40 - y1;
				else
					y1 = 40 - y1;
				this.repaint();
			}
		}
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

