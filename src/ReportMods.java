/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.io.PrintWriter;
/**
 *
 * @author DoD_Admin
 */
public class ReportMods {
    
    
    public  ArrayList<Report> createArrayList()  {
  
            ArrayList<Report> ReportList = new ArrayList<>();
    

        Report Report2 = new Report("Report B", 2, 0.1, 2.0);
        Report Report3 = new Report("Report C", 3, 0.4, 5.0);
        Report Report4 = new Report("Report D", 4, 0.3, 2.5);
        Report Report5 = new Report("Report E", 5, 1.1, 2.3);
         
                ReportList.add(Report2);
                ReportList.add(Report3);
                ReportList.add(Report4);
                ReportList.add(Report5);
                
        
      //  Report MyFirstReport = ReportList.get(0);
     //   System.out.println("Name: " + MyFirstReport.getName());
      //  System.out.println("ID: " + MyFirstReport.getID());
      //  System.out.println("X cord: " + MyFirstReport.getXcord());
      //  System.out.println("Y cord: " + MyFirstReport.getYcord());   
        
        
        

        return ReportList;
    }
            
    public void DeleteReport(ArrayList<Report> ReportList, int ID ) {
        for (Report Reports : ReportList) {           
          if (Reports.getID() == ID)
              // == is NOT the same as the equals() method. This took me an embarrassing amount of time to figure out :^)
              ReportList.remove(Reports);
        }
        }
    
    public Report AddReport(ArrayList<Report> ReportList, String name, int ID, double Xcord, double Ycord ) {
        Report report = new Report(name = "test", ID = 0, Xcord = 0, Ycord = 0);
        ReportList.add(report);
        return report; 
    }
    
    public void PrintToFile() {
        
    }
    //found a few good examples online that I will be testing before implementing.
    public Report SearchbyName(ArrayList<Report> ReportList, String name) {
        Report result = null;  
        for (Report report :  ReportList) {
         
            if (report.getName().equalsIgnoreCase(name)) {              
                result = report;
                System.out.println("found result: ");
                break; 
            }           
                            else {
                     System.out.println("No Report found");
                     break; 
                 }
        } 
          
        return result;  
    } 
}

   

   

