// Richard Jesse Adu-Poku
// September 8th, 2014
// CSE 2
// HW-02
// Arithmetic Java Program
// This program computes the cost of items bought at Walmart including
// Pennsylvania state sales tax 6%

public class Arithmetic {
    
    public static void main(String [ ] args) {
        // Number of pairs of socks
        int nSocks=3;
        // Cost per pair of socks
        // ('$' is part of the variable name)
        double sockCost$=2.58;
        
        // Number of drinking glasses 
        int nGlasses=6;
        // Cost per glass
        double glassCost$=2.29;
        
        // Number of boxes of envelopes
        int nEnvelopes=1;
        // Cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$; // Total cost of socks
        double totalGlassCost$; // Total cost of glass
        double totalEnvelopeCost$; // Total cost of envelope
        double totalSockCostWithSalesTax$; // Total sock cost(with sales tax)
        double totalGlassCostWithSalesTax$; // Total glass cost(with sales tax)
        double totalEnvelopeCostWithSalesTax$; // Total envelope cost(with sales tax)
        double totalPurchaseCostBeforeTax$; // Total cost of purchases before tax
        double totalSalesTax$; // total sales tax
        double totalPurchaseCostWithSalesTax$; // Total cost of purchase including sales tax
        
        System.out.println("Item is Socks");
        System.out.println("Number of Socks being bought is 3");
        System.out.println("Cost per Socks being bought is $2.58");
        totalSockCost$=sockCost$*nSocks;
        // The above gives the total cost of the number of socks bought
        // without the PA sales tax
        System.out.println("Sock cost was "+totalSockCost$+" dollars in price");
        totalSockCostWithSalesTax$=sockCost$*nSocks*taxPercent;
        // The above calculates the total cost of the number of socks bought
        // with the PA sales tax
        
        System.out.println("Item is Glasses");
        System.out.println("Number of Glasses being bought is 6");
        System.out.println("Cost per Glasses being bought is $2.29");
        totalGlassCost$=glassCost$*nGlasses;
        // The above gives the total cost of the number of glasses bought
        // without the PA sales tax
        System.out.println("Glass cost was "+totalGlassCost$+" dollars in price");
        totalGlassCostWithSalesTax$=glassCost$*nGlasses*taxPercent;
        // The above calculates the total cost of the number of glasses bought
        // with the PA sales tax
        
        System.out.println("Item is Envelopes");
        System.out.println("Number of Envelopes being bought is 1");
        System.out.println("Cost per Envelopes being bought is $3.25");
        totalEnvelopeCost$=envelopeCost$*nEnvelopes;
        // The above gives the total cost of the number of envelopes bought
        // without the PA sales tax
        System.out.println("Envelope cost was "+totalEnvelopeCost$+" dollars in price");
        totalEnvelopeCostWithSalesTax$=envelopeCost$*nEnvelopes*taxPercent;
        // The above calculates the total cost of the number of envelopes bought
        // with the PA sales tax
        
        totalPurchaseCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalSalesTax$=totalSockCostWithSalesTax$+totalGlassCostWithSalesTax$+totalEnvelopeCostWithSalesTax$;
        totalPurchaseCostWithSalesTax$=totalPurchaseCostBeforeTax$+totalSalesTax$;
        // The above calculates the Total Purchase Cost Without Tax, the Total Sales Tax,
        // and the Total Purchase Cost With Sales Tax for all the items bought.
        
        System.out.println("Total Purchase before tax is "+totalPurchaseCostBeforeTax$+" dollars in price");
        System.out.println("Total Sales tax is "+totalSalesTax$+" dollars in price");
        System.out.println("Total Purchase with sales tax is "+totalPurchaseCostWithSalesTax$+" dollars in price");
    }
}
        
        
        
        
        