/*
Exercise 3 — Currency Converter (SAR to USD)
Description: Convert an amount from Saudi Riyals (SAR) to US Dollars (USD). The user
provides an amount in SAR and an exchange rate (in SAR per 1 USD). The program outputs
the equivalent amount in USD. Input:- amountSAR : double- rate : double (exchange rate
in SAR for 1 USD) Output: The converted amount in USD. Sample run:
Enter amount in SAR: 75
Enter exchange rate (SAR per USD): 3.75
Equivalent amount in USD = 20.0


===================================================
Exercise 3 — Currency Converter (SAR to USD)
Date : 3/11/2026
Author : BinSaleh 
Description: A program to convert Saudi Riyals to US Dollars.
===================================================
*/

import java.util.Scanner; 
public class CurrencyConverter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in) ; 

    System.out.println("Enter amount in SAR : ");
    double amountSar = input.nextDouble() ; 
    System.out.println("Enter exchange rate (SAR per USD) : ");
    double rate = input.nextDouble() ;
    
    double exchangeResult = (amountSar / rate) ;

    System.out.println("Equivalent amount in USD :" + exchangeResult );

    input.close() ;

    }
}
