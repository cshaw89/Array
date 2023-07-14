/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;

import java.util.ArrayList;
/**
 *
 * @author DoD_Admin
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
    ArrayList<Report> ReportList = ReportMods.createArrayList();
             

      
        for (Report Reports : ReportList) {
        System.out.println("Name: " + Reports.getName());
        System.out.println("ID: " + Reports.getID());
        System.out.println("X cord: " + Reports.getXcord());
        System.out.println("Y cord: " + Reports.getYcord());   
        }
      
     
     
    }

}


