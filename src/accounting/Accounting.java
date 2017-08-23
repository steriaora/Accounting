/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import javax.swing.JFrame;

/**   
 *
 * @author dkdks
 */
public class Accounting {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        new frame();
    }
    
}
 class frame{
    JFrame global_frame=new JFrame();
    frame(){
        global_frame.setResizable(false);
        global_frame.setSize(1360, 730);
        global_frame.getContentPane().add(new entry());
        global_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        global_frame.setVisible(true);
    }
}