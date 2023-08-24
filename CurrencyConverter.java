import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen, ringgit;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: Ruppe");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
      System.out.println("Enter 5: Ringgit");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // Ruppe Conversion
            dollar = amount / 81.91;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 104.98;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 90.31;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.58;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            ringgit = amount / 17.95;
            System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
            break;
 
         case 2:  // Dollar Conversion
            rupee = amount * 81.90;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.91;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *141.50;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.56;
            System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
            break;
 
         case 3:  // Pound Conversion
            rupee = amount * 104.98;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.28;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.16;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *181.48;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.85;
            System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
            break;
 
         case 4:  // Euro Conversion
            rupee = amount * 90.29;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.10;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.86;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *156.05;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.03;
            System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
            break;
 
         case 5:  // Yen Conversion
            rupee = amount *0.58;
            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.0071;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.0055;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.0064;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
 
            ringgit = amount *0.032;
            System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
            break;
 
         case 6:  // Ringgit Conversion
            rupee = amount *17.96;
            System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.22;
            System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");
 
            pound = amount *0.17;
            System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");
 
            euro = amount *0.20;
            System.out.println(amount + " ringgit = " + f.format(euro) + " euro");
 
            yen = amount *30.99;
            System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
            break;
 
          //Default case
         default:
            System.out.println("Invalid Input");
      }
   }
}