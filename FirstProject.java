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
        // TODO code application logic here
//        Report report = new Report();
        ArrayList<Report> ReportList = new ArrayList<>();
       // Report(String name, int ID, Double Xcord, Double Ycord) 
        ReportList.add(new Report("Report B", 2, 0.1, 2.0));
        ReportList.add(new Report("Report C", 3, 0.4, 5.0));
        ReportList.add(new Report("Report D", 4, 0.3, 2.5));
        
        Report MyFirstReport = ReportList.get(0);
        System.out.println("Name: " + MyFirstReport.getName());
        System.out.println("ID: " + MyFirstReport.getID());
        System.out.println("X cord: " + MyFirstReport.getXcord());
        System.out.println("Y cord: " + MyFirstReport.getYcord());
        
      //System.out.println("Here are your current reports" + ReportList);

       // report.setID(0);
        //report.setName("Test");
        //report.setXcord(1.1);
        //report.setYcord(1.1);
        //System.out.println("Here are your first test results:    " + report.getName() + " " + report.getID() + " " + report.getXcord() + " " + report.getYcord());
        
        for (Report Reports : ReportList) {
                 System.out.println("Name: " + Reports.getName());
        System.out.println("ID: " + Reports.getID());
        System.out.println("X cord: " + Reports.getXcord());
        System.out.println("Y cord: " + Reports.getYcord());   
        }
    }
}

