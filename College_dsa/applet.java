
import java.awt.*;
import java.awt .event.*;



import java.applet.*;

/*
  <applet code= "button" width="100" height="300">
  </applet> 
 */
 
public class applet extends actionlistener {
    string s=" ";
   button=yes,no;
     public void init(){
        yes=new button("yes");
        no=new button("no");

        add(yes);
        add(no);
        
        yes.add actionlistener(this);
        no.add actionlistener(this);
     }
     public void actionperformed(ActionEvent ae){
        string s1=ae.getActionCommand();
        if(s1.equal("yes"))
        s=" you passed yes";
        else
        s=" you passed no";
        repaint();

     }
     public void paint(Graphics g){
        g.draw string (s,10,80);
     }

    
}
