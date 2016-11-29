/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsController {
    
    public OptionsModel optionsModel;
    public OptionsView optionsView;
    
    public OptionsController(OptionsModel optionsModel, OptionsView optionsView) {
        
        this.optionsModel = optionsModel;
        this.optionsView = optionsView;
              
        optionsView.addSaveButtonListener(new SaveButtonListener());
        optionsView.addReturnButtonListener(new ReturnButtonListener());
        
    }
    
    //make the bottom two classes into one
    
    public class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsModel.saveOptionsInfo(optionsView.backgroundColor.getText(), 
                    optionsView.fontSize.getValue(), 
                    optionsView.pageSize.getValue());
                        
        }
        
    }
    
    public class ReturnButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsView.summaryLabel.setText(optionsModel.returnOptionsInfo());
                        
        }
        
    }
    
}
