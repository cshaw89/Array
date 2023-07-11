/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject;

/**
 *
 * @author DoD_Admin
 */
public class Report {
    //instance variables 
    
    private String name;
    private int ID; 
    private Double Xcord;
    private Double Ycord;
    
Report(String name, int ID, Double Xcord, Double Ycord) {
this.name = name;
this.ID = ID;
this.Xcord = Xcord;
this.Ycord = Ycord;
}
    
// public void setName(String name) {
//     this.name = name;
// }    
 public String getName() {
     return name; 
 }
 
// public void setID(int ID) {
//     this.ID = ID;
// }
 public int getID() {
     return ID;
 }
 
// public void setXcord(Double Xcord) {
//     this.Xcord = Xcord; 
// }
 
 public Double getXcord() {
     return Xcord; 
 }
 
// public void setYcord(Double Ycord) {
//     this.Ycord = Ycord;
// }
// 
 public Double getYcord() {
     return Ycord; 
 }
 
}
