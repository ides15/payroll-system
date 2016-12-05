/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class NavView extends JFrame {
    
    public NavModel model;
    public NavViewPanel navViewPanel;
    
    public NavView(NavModel model) {
        
        super("Payroll System");
        this.model = model;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        
        navViewPanel = new NavViewPanel();
        
        add(navViewPanel);
        
    }
    
    public void switchToHomePanel(HomePanel homePanel) {
        
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeSplash();
        navViewPanel.removeCreditsPanel();
        navViewPanel.removeOptionsView();
<<<<<<< HEAD
        navViewPanel.removeProfilePanel();
        navViewPanel.removePayrollPanel();
=======
       
        
        
        navViewPanel.removeProfilePanel();
        navViewPanel.removePayrollPanel();
        
>>>>>>> 9921ff4766464edda9e99cdef4eda68f3861a2fb
        navViewPanel.addHomePanel(homePanel);
                
    }
    
    public void switchToInstructionsPanel(InstructionsPanel instructionsPanel) {
        
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeCreditsPanel();
        navViewPanel.removeOptionsView();
        navViewPanel.removeProfilePanel();
        navViewPanel.removePayrollPanel();
        navViewPanel.addInstructionsPanel(instructionsPanel);
        
    }
    
    public void switchToCreditsPanel(CreditsPanel creditsPanel) {
        
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeOptionsView();
        navViewPanel.removeProfilePanel();
        navViewPanel.removePayrollPanel();
        navViewPanel.addCreditsPanel(creditsPanel);
                
    }
    
    public void switchToOptionsPanel(OptionsView optionsView) {
        
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeCreditsPanel();
        navViewPanel.removeProfilePanel();
        navViewPanel.removePayrollPanel();
        navViewPanel.addOptionsView(optionsView);
                
    }
    
   public void switchToProfilePanel(ProfilePanel profilePanel){
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeCreditsPanel();
        navViewPanel.removePayrollPanel();
        navViewPanel.removeOptionsView();
        navViewPanel.addProfilePanel(profilePanel);
        
   }
   
   public void switchToPayrollPanel(PayrollPanel payrollPanel){
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeCreditsPanel();
        navViewPanel.removeProfilePanel();
        navViewPanel.removeOptionsView();
        navViewPanel.addPayrollPanel(payrollPanel);
   }
    
    public void addInstructionsButtonListener(ActionListener al) {
        
        navViewPanel.nav.instructionsButton.addActionListener(al);
                
    }
    
    public void addHomeButtonListener(ActionListener al) {
        
        navViewPanel.nav.homeButton.addActionListener(al);
                
    }

    public void addCreditsButtonListener(ActionListener al) {
        
        navViewPanel.nav.creditsButton.addActionListener(al);
                
    }
    
    public void addOptionsButtonListener(ActionListener al) {
        
        navViewPanel.nav.optionsButton.addActionListener(al);
        
    }
    
     public void addProfileButtonListener(ActionListener al){
        
        navViewPanel.nav.profileButton.addActionListener(al);
    }
    
    public void addPayrollButtonListener(ActionListener al){
        
        navViewPanel.nav.payrollButton.addActionListener(al);
    }
    
}
