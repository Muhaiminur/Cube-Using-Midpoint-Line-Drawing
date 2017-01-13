

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Cube_Rotation_Using_Midpoint_Line_Drawing implements GLEventListener{
	double x0=0;
	double y0=0;
	double x1=0.3;
	double y1=0.3;
	double d=45;//degree
	
	static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    // The canvas 
    static GLCanvas glcanvas = new GLCanvas(capabilities);
    
   public static void main(String[] args) {
	      //getting the capabilities object of GL2 profile
	   	  
	      
	      Cube_Rotation_Using_Midpoint_Line_Drawing l = new Cube_Rotation_Using_Midpoint_Line_Drawing();
	      //creating frame
	      glcanvas.addGLEventListener(l);
	      glcanvas.setSize(600, 600);
	      
	      final JFrame frame = new JFrame ("straight Line");
	      //adding canvas to frame
	      frame.getContentPane().add(glcanvas);
	      frame.setSize(frame.getContentPane().getPreferredSize());
	      frame.setVisible(true);
	      
	   }
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      gl.glColor3f(1f, 1f, 1f);
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0,0);
      gl.glVertex2d(.3, 0);
      gl.glEnd();//L1
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0,0);
      gl.glVertex2d(0, 0.3);
      gl.glEnd();//L2
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.3,0);
      gl.glVertex2d(.3, 0.3);
      gl.glEnd();//L3
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0,0.3);
      gl.glVertex2d(.3, 0.3);
      gl.glEnd();//L4
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0,0);
      gl.glVertex2d(.1, .1);
      gl.glEnd();//L5
      
      /*gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.1,0.1);
      gl.glVertex2d(.1, .1);
      gl.glEnd();*/
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.3,0);
      gl.glVertex2d(.4, .1);
      gl.glEnd();//L6
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.1,0.1);
      gl.glVertex2d(.1, .4);
      gl.glEnd();//L7
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.4,0.1);
      gl.glVertex2d(.4, .4);
      gl.glEnd();//L8
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0,0.3);
      gl.glVertex2d(.1, .4);
      gl.glEnd();//L9
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.3,0.3);
      gl.glVertex2d(.4, .4);
      gl.glEnd();//L10
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.1,0.1);
      gl.glVertex2d(.4, .1);
      gl.glEnd();//L11
      
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(0.1,0.4);
      gl.glVertex2d(.4, .4);
      gl.glEnd();//L12
      double rad=Math.toRadians(d);
      //rotate
      gl.glBegin(GL2.GL_LINES);
	  gl.glColor3f(0,1,0);
      gl.glVertex2d((0*Math.cos(rad)-0*Math.sin(rad)),(0*Math.cos(rad)+0*Math.sin(rad)));
      gl.glVertex2d((0.3*Math.cos(rad)-0*Math.sin(rad)), (0.3*Math.cos(rad)+0*Math.sin(rad)));
      gl.glEnd();//L1
      
      gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0*Math.cos(rad)-0*Math.sin(rad)),(0*Math.cos(rad)+0*Math.sin(rad)));
          gl.glVertex2d((0*Math.cos(rad)-0.3*Math.sin(rad)), (0*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glEnd();//L2
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.3*Math.cos(rad)-0*Math.sin(rad)),(0.3*Math.cos(rad)+0*Math.sin(rad)));
          gl.glVertex2d((0.3*Math.cos(rad)-0.3*Math.sin(rad)), (0.3*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glEnd();//L3
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0*Math.cos(rad)-0.3*Math.sin(rad)),(0*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glVertex2d((0.3*Math.cos(rad)-0.3*Math.sin(rad)), (0.3*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glEnd();//L4
    	  
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0*Math.cos(rad)-0*Math.sin(rad)),(0*Math.cos(rad)+0*Math.sin(rad)));
          gl.glVertex2d((0.1*Math.cos(rad)-0.1*Math.sin(rad)), (0.1*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glEnd();//L5
    	  
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.3*Math.cos(rad)-0*Math.sin(rad)),(0.3*Math.cos(rad)+0*Math.sin(rad)));
          gl.glVertex2d((0.4*Math.cos(rad)-0.1*Math.sin(rad)), (0.4*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glEnd();//L6
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.1*Math.cos(rad)-0.1*Math.sin(rad)),(0.1*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glVertex2d((0.1*Math.cos(rad)-0.4*Math.sin(rad)), (0.1*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glEnd();//L7
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.4*Math.cos(rad)-0.1*Math.sin(rad)),(0.4*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glVertex2d((0.4*Math.cos(rad)-0.4*Math.sin(rad)), (0.4*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glEnd();//L8
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0*Math.cos(rad)-0.3*Math.sin(rad)),(0*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glVertex2d((0.1*Math.cos(rad)-0.4*Math.sin(rad)), (0.1*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glEnd();//L9
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.3*Math.cos(rad)-0.3*Math.sin(rad)),(0.3*Math.cos(rad)+0.3*Math.sin(rad)));
          gl.glVertex2d((0.4*Math.cos(rad)-0.4*Math.sin(rad)), (0.4*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glEnd();//L10
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.1*Math.cos(rad)-0.1*Math.sin(rad)),(0.1*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glVertex2d((0.4*Math.cos(rad)-0.1*Math.sin(rad)), (0.4*Math.cos(rad)+0.1*Math.sin(rad)));
          gl.glEnd();//L11
          
          gl.glBegin(GL2.GL_LINES);
    	  gl.glColor3f(0,1,0);
          gl.glVertex2d((0.1*Math.cos(rad)-0.4*Math.sin(rad)),(0.1*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glVertex2d((0.4*Math.cos(rad)-0.4*Math.sin(rad)), (0.4*Math.cos(rad)+0.4*Math.sin(rad)));
          gl.glEnd();//L12
      
      
      
   }
   
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }

   
   public void init(GLAutoDrawable drawable) {
      // method body
	   //4. drive the display() in a loop
	    }
   
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   //end of main
}//end of classimport javax.media.opengl.GL2;
