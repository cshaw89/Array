/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject;
import java.util.ArrayList;
import java.io.PrintWriter;
/**
 *
 * @author DoD_Admin
 */
public class ReportMods {
    
    
    public static ArrayList<Report> createArrayList()  {
  
            ArrayList<Report> ReportList = new ArrayList<>();
    

        Report Report2 = new Report("Report B", 2, 0.1, 2.0);
        Report Report3 = new Report("Report C", 3, 0.4, 5.0);
        Report Report4 = new Report("Report D", 4, 0.3, 2.5);
        Report Report5 = new Report("Report D", 5, 1.1, 2.3);
         
                ReportList.add(Report2);
                ReportList.add(Report3);
                ReportList.add(Report4);
                ReportList.add(Report5);
                
        
        Report MyFirstReport = ReportList.get(0);
        System.out.println("Name: " + MyFirstReport.getName());
        System.out.println("ID: " + MyFirstReport.getID());
        System.out.println("X cord: " + MyFirstReport.getXcord());
        System.out.println("Y cord: " + MyFirstReport.getYcord());   
        
        
        

        return ReportList;
    }
            
    public void DeleteReport(ArrayList<Report> ReportList, int ID ) {
        for (Report Reports : ReportList) {           
          if (Reports.getID() == ID)
              // == is NOT the same as the equals() method. This took me an embarrassing amount of time to figure out :^)
              ReportList.remove(Reports);
        }
        }
    
    public void AddReport(ArrayList<Report> ReportList, Report newReport) {
        ReportList.add(newReport);
    }
    
    public void PrintToFile() {
        
    }
    //found a few good examples online that I will be testing before implementing.
    }

   

