/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import javax.swing.JFrame;

/**   
 *
 * @author dkdks,harsh,abhishek
 */
public class Accounting extends frame {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      frame obj=new frame();
      obj.fn();
        
    }
    
}
 class frame extends javax.swing.JPanel{
     static JFrame global_frame=new JFrame();
   void fn(){
         global_frame.setResizable(false);
        global_frame.setSize(1360, 730);
        global_frame.getContentPane().add(new login());
        global_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        global_frame.setVisible(true);
   }
}