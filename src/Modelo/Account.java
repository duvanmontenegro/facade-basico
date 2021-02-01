/**
 *
 * @author Antonella C
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Account 
{

    String firstName;
    String lastName;
    int idacc;
    List<Account> acc;
    final String ACCOUNT_DATA_FILE = "AccountData.txt";
    Address adress;
    CreditCard cc;

    public Account() 
    {
        idacc = 0;
        firstName = "";
        lastName = "";
        List<Account> acc = new ArrayList();
    }

    public Account(int idacc, String firstName, String lastName) 
    {
        this.idacc = idacc;
        this.firstName = firstName;
        this.lastName = lastName;
        this.acc = acc;
    }

    public void setFName(String inFName) 
    {
        this.firstName = inFName;
    }

    public void setLName(String inLName) 
    {
        this.lastName = inLName;
    }

    public void setID(int idacco)
    {
        this.idacc = idacco;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public int getIdacc()
    {
        return idacc;
    }

    public void setAdress(Address adress) 
    {
        this.adress = adress;
    }
    
     public Address getAdress() 
    {
        return adress;
    }

    public CreditCard getCc() 
    {
        return cc;
    }

    public void setCc(CreditCard cc) 
    {
        this.cc = cc;
    }
    
    
  
}
