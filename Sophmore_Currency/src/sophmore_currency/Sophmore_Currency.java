package sophmore_currency;

import java.util.*;

public class Sophmore_Currency {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        boolean validCurrency = false;
        
        int currentCurrency = 0;
        
        double currentCost = 0;
        String currentName = " ";
        
        int convertedCurrency = 0;
        
        double convertedCost = 0;
        String convertedName = " ";
        
        double amount = 0;
        
        double convertedTotal = 0;
                
        System.out.println("--This is a currency converter!--");
                
        //Current Currency
        do{
            System.out.println("What currency are you begining with?\n"
                + "\t(1)USD [America]\n"
                + "\t(2)CAD [Canada]\n"
                + "\t(3)POUND[United Kingdom]\n"
                + "\t(4)RUBLE [Russia]\n"
                + "\t(5)YUAN [China]");
            
            currentCurrency = scan.nextInt();
            
            switch(currentCurrency){
                case 1:
                    validCurrency = true;
                    currentCost = 1;
                    currentName = "American Dollar [USD]";
                    break;
                case 2:
                    validCurrency = true;
                    currentCost = (1 / 1.27);
                    currentName = "Canadian Dollar [CAD]";
                    break;
                case 3:
                    validCurrency = true;
                    currentCost = (1 / 0.72);
                    currentName = "Pound Sterling [GBP]";
                    break;
                case 4:
                    validCurrency = true;
                    currentCost = (1 / 73.0);
                    currentName = "Russian Ruble [RUB]";
                    break;
                case 5:
                    validCurrency = true;
                    currentCost = (1 / 6.46);
                    currentName = "Chinese Yuan [CNY]";
                    break;
                default:
                    System.out.println("You did not select a proper currency!");
                    break;           
                }
            
        }while(validCurrency == false);
        
        //Current Currency Dispaly
        System.out.println("---  ---  ---  ---  ---");
        
        System.out.println("Current Currency: " + currentName);
        //System.out.println("Current Cost: " + currentCost);
        
        System.out.println("---  ---  ---  ---  ---");

        //Converted Currnecy
        validCurrency = false;
        do{
            System.out.println("What currency are you converting to?\n"
                + "\t(1)USD [America]\n"
                + "\t(2)CAD [Canada]\n"
                + "\t(3)POUND[United Kingdom]\n"
                + "\t(4)RUBLE [Russia]\n"
                + "\t(5)YUAN [China]");
            
            convertedCurrency = scan.nextInt();
            
            switch(convertedCurrency){
                case 1:
                    validCurrency = true;
                    convertedCost = 1;
                    convertedName = "American Dollar [USD]";
                    break;
                case 2:
                    validCurrency = true;
                    convertedCost = 1.27;
                    convertedName = "Canadian Dollar [CAD]";
                    break;
                case 3:
                    validCurrency = true;
                    convertedCost = 0.72;
                    convertedName = "Pound Sterling [GBP]";
                    break;
                case 4:
                    validCurrency = true;
                    convertedCost = 73;
                    convertedName = "Russian Ruble [RUB]";
                    break;
                case 5:
                    validCurrency = true;
                    convertedCost = 6.46;
                    convertedName = "Chinese Yuan [CNY]";
                    break;
                default:
                    System.out.println("You did not select a proper currency!");
                    break;           
                }
            
        }while(validCurrency == false);
        
        //Converted Currency display
        System.out.println("---  ---  ---  ---  ---");
        
        System.out.println("Converted Currency: " + convertedName);
        //System.out.println("Converted Cost: " + convertedCost );
        
        System.out.println("---  ---  ---  ---  ---");
                
        System.out.println("Current Currency: " + currentName + "| Cost: " + currentCost + "[USD]");
        System.out.println("Converted Currency: " + convertedName + "| Cost: " + convertedCost + "[USD]" );
        System.out.println("");
        
        System.out.println("How much " + currentName + " are you converting to " + convertedName + "?");
        amount = scan.nextDouble();
        
        //Convert total
        convertedTotal = ( (amount * currentCost) * convertedCost);
        System.out.println(amount + " " + currentName + " is equal to " + String.format("%.2f",convertedTotal) + " " + convertedName);
          
    }
    
}
