/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonella C
 */
public class CreditCard 
{
    String cardType;
    String cardNumber;
    String cardExpDate;
    int id;
    List <CreditCard> card;
    final String CC_DATA_FILE = "CC.txt";
    
    public CreditCard() 
    {
        id = 0;
        cardType = "";
        cardNumber = "";
        cardExpDate="";
         List <CreditCard> card= new ArrayList();
    }
    
     public CreditCard(String cardType, String cardNumber, String cardExpDate, int id) 
    {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
        this.id=id;
    }

    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber) 
    {
        this.cardNumber = cardNumber;
    }

    public void setCardExpDate(String cardExpDate) 
    {
        this.cardExpDate = cardExpDate;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setCard(List<CreditCard> card)
    {
        this.card = card;
    }

   /* public boolean isValid() 
    {
        /*
		 * Let's go with simpler validation here to keep the example simpler.
         

        if (getCardType().equals("VISA")) 
        {
            return (getCardNumber().trim().length() == 16);
        }
        if (getCardType().equals("DISCOVER")) 
        {
            return (getCardNumber().trim().length() == 15);
        }
        if (getCardType().equals("MASTER")) 
        {
            return (getCardNumber().trim().length() == 16);
        }
        return false;
    }

    public boolean save() 
    {
        //FileUtil futil = new FileUtil();
        String dataLine
                = getCardType() + "," + getCardNumber() + ","
                + getCardExpDate();
        //return futil.writeToFile(CC_DATA_FILE, dataLine, true,true);
        System.out.println("Grabado el archivo " + CC_DATA_FILE + " Texto:"
                + dataLine);
        return true;
    } */

    public String getCardType() 
    {
        return cardType;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getCardExpDate() 
    {
        return cardExpDate;
    }

    public int getId() 
    {
        return id;
    }

    public List<CreditCard> getCard() 
    {
        return card;
    }
    
    
}
