/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Font;
import jdialogs.JFontDialog;

/**
 *
 * @author Pankaj
 */
public class Main {
    
    public static void main(String[] args) {
        JFontDialog fontDialog = new JFontDialog();
        fontDialog.setVisible(true);
        Font selectedFont = fontDialog.getFont();
        System.out.println(selectedFont.toString());
    }
}
