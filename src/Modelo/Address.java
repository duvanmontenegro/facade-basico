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
public class Address
{

    String address;
    String city;
    String state;
    int idadd;
    List <Address> add;
    final String ADDRESS_DATA_FILE = "Address.txt";
    
    public Address() 
    {
        idadd = 0;
        address = "";
        city = "";
        state="";
        List <Address> add = new ArrayList();
    }
    
    public Address(String add, String cty, String st, int id) 
    {
        this.address = add;
        this.city = cty;
        this.state = st;
        this.idadd=id;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public void setIdadd(int idadd)
    {
        this.idadd = idadd;
    }

    public void setAdd(List<Address> add) 
    {
        this.add = add;
    }
    
   /* public boolean isValid()
    {
        
		/* * The address validation algorithm could be complex in real-world
		 * applications. Let's go with simpler validation here to keep the
		 * example simpler.
        
        if (getState().trim().length() < 2) 
        {
            return false;
        }
        return true;
    } */

    /*public boolean save() 
    {
        // FileUtil futil = new FileUtil();
        String dataLine = getAddress() + "," + getCity() + "," + getState();
        // return futil.writeToFile(ADDRESS_DATA_FILE, dataLine,true, true);
        System.out.println("Grabado el archivo " + ADDRESS_DATA_FILE + " Texto:"
                + dataLine);
        return true;
    }*/

    public String getAddress() 
    {
        return address;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;
    }

    public int getIdadd() 
    {
        return idadd;
    }
    
    
}
