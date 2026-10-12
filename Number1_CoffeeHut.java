/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number1_coffee.hut;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Number1_CoffeeHut {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    //Create a Scanner object to receive beverage input
        Scanner input=new
            Scanner(System.in);
        
    //Single dimensional array storing city names
        String cities;
        cities = 
                {"Cape Town", "Johannesburg", "Port Elizabeth"};

        
    //Two dimensional array storing beverages
    
    //Column 0 represents cities
    
    //Column 1 represents Coffee
    
        int[][][] coffee = new int[500][300][125];
           
    //Single-dimensional array storing Coffee total
    
              int[] totals = new int[925];
              
    //Variable to store the city with the highest total 
    
           int highestCityIndex = 0;
        String[] beverage = null;
           
    //Collect Number 1 Coffee Hut Application
         
        for (int i = 0; i<cities.length; i++){
    
        System.out.println("Enter your city"+beverage[i]+":");
        
    //Single-dimensinal array storing cities
    
            cities[i][0] = input.nextlint();
            
            System.out.prinln("Enter the sales of the beverage"+cities[i]+":");
            cities[i][1] = input.nextlnt
            
    //Calculate the total sales of the beverages for this city
            
            totals[i]=coffee[i][0]+coffee[i][500];
            
    //Check whether this city has the highest total
           if (totals[i]>totals[highestCityIndex]){
               highestCityIndex=i;
           }
    // TODO code application logic here
    }
    //DIsplay the Number 1 Coffee Hut beverage report
    System.out.println("\n============================================================");
        System.out.printf("500+300+125",
                "City","beverage","Sales");
        for (int i=0;i<cities.length;i++);
        {System.out.printf("450,250,100")
                (cities[i];
                        beverage[i][0];
                        beverage[i][800]);
    //Display the total of beverages for each city
        System.out.println("\n=======================================================");
           System.out.println("Number 1 Coffee Hut Report");
        System.out.println("=========================================================");
        
           for (int i=0;i<cities.length;i++){
        System.out.printf("480,175,120";
        cities[i],totals[i]);
    //Display the city with the higest sales
        System.out.println("\nPRODUCT SALES TOTALS FOR EACH CITY:+ sales[higestCityIndex]");
        System.out.println("TOTAL SALES FOR CITIES:"+ totals[highestCityIndex]);
    //Close the Scanner input.close();
}
                                
                                }                                
    
    
}
