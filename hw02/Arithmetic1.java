// Richard Jesse Adu-Poku
// September 8th, 2014
// HW-02
// Arithmetic Java Program

public class Arithmetic1 {
    
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
        double totalSockCostWithSalesTax$;
        double totalGlassCostWithSalesTax$;
        double totalEnvelopeCostWithSalesTax$;
        double totalPurchaseCostBeforeTax$; // Total cost of purchases before tax
        double totalSalesTax$; // total sales tax
        double totalPurchaseCostWithSalesTax$; // Total cost of purchase including sales tax
        
        System.out.println("Item is Socks");
        System.out.println("Number of Socks being bought is 3");
        System.out.println("Cost per Socks being bought is $2.58");
        totalSockCost$=sockCost$*nSocks;
        System.out.println("Sock cost was "+totalSockCost$+" dollars in price");
        totalSockCostWithSalesTax$=sockCost$*nSocks*taxPercent;
        
        System.out.println("Item is Glasses");
        System.out.println("Number of Glasses being bought is 6");
        System.out.println("Cost per Glasses being bought is $2.29");
        totalGlassCost$=glassCost$*nGlasses;
        System.out.println("Glass cost was "+totalGlassCost$+" dollars in price");
        totalGlassCostWithSalesTax$=glassCost$*nGlasses*taxPercent;
        
        System.out.println("Item is Envelopes");
        System.out.println("Number of Envelopes being bought is 1");
        System.out.println("Cost per Envelopes being bought is $3.25");
        totalEnvelopeCost$=envelopeCost$*nEnvelopes;
        System.out.println("Envelope cost was "+totalEnvelopeCost$+" dollars in price");
        totalEnvelopeCostWithSalesTax$=envelopeCost$*nEnvelopes*taxPercent;
        
        totalPurchaseCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalSalesTax$=totalSockCostWithSalesTax$+totalGlassCostWithSalesTax$+totalEnvelopeCostWithSalesTax$;
        totalPurchaseCostWithSalesTax$=totalPurchaseCostBeforeTax$+totalSalesTax$;
        
        System.out.println("Total Purchase before tax is "+totalPurchaseCostBeforeTax$+" dollars in price");
        System.out.println("Total Sales tax is "+totalSalesTax$+" dollars in price");
        System.out.println("Total Purchase with sales tax is "+totalPurchaseCostWithSalesTax$+" dollars in price");
    }
}
        
        
        
        
        