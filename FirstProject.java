/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DoD_Admin
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ReportMods reportMods = new ReportMods();
        
    ArrayList<Report> ReportList = reportMods.createArrayList();
             
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide Report name:  ");
    String ReportSearch = scanner.nextLine();
    Report ReporttoSearch = reportMods.SearchbyName(ReportList, ReportSearch);
        if (ReporttoSearch != null) {
            System.out.println("Here is your requested report:   " + ReporttoSearch);
        }
     //Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to enter a report?  ");
        
    Report ReportToAdd =  reportMods.AddReport(ReportList, ReportSearch, 0, 0, 0);
        System.out.println("Name?  ");
        String Name = scanner.nextLine();
        System.out.println("ID?  ");
        int ID = scanner.nextInt();
        System.out.println("X cord?  ");
        double Xcord = scanner.nextInt();
        System.out.println("Y cord?   ");
        double Ycord = scanner.nextInt();
        
        ReportList.add(ReportToAdd);
        
        
        for (Report Reports : ReportList) {
            System.out.println(Reports);
        }
        
        
        //System.out.println(ReportList );
       // String ReportAdd = scanner.nextLine();
       // String ReportAdd = reportMods.AddReport( String name, int ID, double Xcord, double Ycord);
       // System.out.println("What is the Report Name");
       // String name = scanner.nextLine();
       // int ID = scanner.nextLine();
      //  Double Xcord = scanner.nextLine();
       // Double Ycord = scanner.nextLine();       
                
       // reportMods.AddReport(ID, name, 0, 0);
        //for (Report Reports : ReportList) {
       // System.out.println("Name: " + Reports.getName());
       // System.out.println("ID: " + Reports.getID());
       // System.out.println("X cord: " + Reports.getXcord());
       // System.out.println("Y cord: " + Reports.getYcord());   
      //  }
      
     
     
    }

}


