/**
 *
 * @author Antonella C
 */
package Controlador;
import Modelo.Account;
import Modelo.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Comun.ConectarBD;

public class ControladorAddress 
{
   Scanner ent= new Scanner (System.in);
  
    Address modelo= new Address();
    
   public void setAddress(String address) 
    {
        this.modelo.setAddress(address);
    }

    public void setCity(String city) 
    {
        this.modelo.setCity(city);
    }

    public void setState(String state) 
    {
        this.modelo.setState(state);
    }

    public void setIdadd(int idadd)
    {
        this.modelo.setIdadd(idadd);
    }
    
     public String getAddress() 
    {
        return modelo.getAddress();
    }

    public String getCity() 
    {
        return modelo.getCity();
    }

    public String getState() 
    {
        return modelo.getState();
    }

    public int getIdadd() 
    {
        return modelo.getIdadd();
    }
    
     public boolean isValid()
    {
        if (getState().trim().length() < 2) 
        {
            return false;
        }
        return true;
    } 
     
   public Address InsertarAdd()
    {
       Address addr= new Address();
       
       System.out.println("Ingrese los datos de la direccion del cliente: ");
       
       System.out.println("Identificador ");
       addr.setIdadd(ent.nextInt());
        
       System.out.println("Dirección");
       addr.setAddress(ent.nextLine());
       
       System.out.println("Ciudad");
       addr.setCity(ent.nextLine());
       
       System.out.println("Estado");
       addr.setState(ent.nextLine());

        return addr;
    }        
 
    public void ActualizarAdd (List <Address> add)
    {
        int id=ent.nextInt();
        
        System.out.print("Buscar dirección a actualizar:"); 
        System.out.println("La dirección que desea actualiza es es: "+id);
 
        for(int i = 0; i < add.size(); i++)
	{
            System.out.println("Dirección : ");
            Address get = add.get(i);
                    
            if(id==get.getIdadd())
            {
		System.out.println("Ingrese la nueva dirección"); get.setAddress(ent.next());
                System.out.println("Ingrese la nueva ciudad"); get.setCity(ent.next());
                System.out.println("Ingrese el nuevo estado"); get.setState(ent.next());
            }
        }
    }
    
    public Address EliminarAdd()
    {   
        int id=ent.nextInt();
        Address addr= new Address();
        List <Address> add = new ArrayList();
 
	for(int i = 0; i < add.size(); i++)
	{
            System.out.println("Dirección : ");
            Address get = add.get(i);
                    
            if(id==getIdadd())
            {
		addr=get;
            }
            
             else if(id!=getIdadd())
            {
                System.out.println("La dirección que desea actualizar no existe ");
            }
        }
        
        return addr;
    }   
    
    public void MostrarAdd (List <Address> add)
    {
        for (Address ad : add) 
        {
            System.out.println("Id: "+ad.getIdadd());
            System.out.println("Direccion: "+ad.getAddress());
            System.out.println("Ciudad: "+ad.getCity());
            System.out.println("Estado: "+ad.getState());
        }
    }

    public boolean GuardarAdd()
    {
        final String ADDRESS_DATA_FILE = "Address.txt";
        
       String dataLine = getAddress() + "," + getCity() + "," + getState();
       System.out.println("Grabado el archivo " + ADDRESS_DATA_FILE + " Texto:"
                + dataLine);
        return true;
    }        
}
