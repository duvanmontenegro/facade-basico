/**
 *
 * @author Antonella C
 */
package Controlador;
import Modelo.CreditCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorCreditCard 
{
    
     
   Scanner ent= new Scanner (System.in);
  
   CreditCard modelo= new CreditCard();
   
   public void setCardType(String cardType) 
    {
        this.modelo.setCardType(cardType);
    }

    public void setCardNumber(String cardNumber) 
    {
        this.modelo.setCardNumber(cardNumber);
    }

    public void setCardExpDate(String cardExpDate) 
    {
        this.modelo.setCardExpDate(cardExpDate);
    }

    public void setId(int id) 
    {
        this.modelo.setId(id);
    }
 
    public String getCardType() 
    {
        return modelo.getCardType();
    }

    public String getCardNumber()
    {
        return modelo.getCardNumber();
    }

    public String getCardExpDate() 
    {
        return modelo.getCardExpDate();
    }

    public int getId() 
    {
        return modelo.getId();
    }
    
    public boolean isValid() 
    {
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

   public CreditCard InsertarCC()
    {
        Scanner ent= new Scanner (System.in);
        //int id=ent.nextInt();
       CreditCard cc= new CreditCard();
        
       System.out.println("Ingrese los datos de la tarjeta: ");
       
       System.out.println("Identificador ");
       cc.setId(ent.nextInt());
        
       System.out.println("Tipo de tarjeta: ");
       cc.setCardType(ent.nextLine());
       
       System.out.println("Numero de tarjeta");
       cc.setCardNumber(ent.nextLine());
       
       System.out.println("Fecha de expiración");
       cc.setCardExpDate(ent.nextLine());

        return cc;
    }        
 
    public void ActualizarCC (List <CreditCard> credit)
    {
        
        System.out.print("Buscar la tarjeta a actualizar:"); 
        int id=ent.nextInt();
        
        System.out.println("La tarjeta que desea actualizar es es: "+id);
 
        for(int i = 0; i < credit.size(); i++)
	{
            System.out.println("Tarjeta: ");
            CreditCard get = credit.get(i);
                    
            if(id==get.getId())
            {
		System.out.println("Ingrese Tipo de tarjeta: "); get.setCardType(ent.next());
                System.out.println("Ingrese Numero de tarjeta: "); get.setCardNumber(ent.next());
                System.out.println("Ingrese Fecha de expiración: "); get.setCardExpDate(ent.next());
            }
        }
    }
    
    public CreditCard EliminarCC()
    {
        CreditCard cc= new CreditCard();
        List <CreditCard> credit = new ArrayList();
        
        System.out.print("Buscar la tarjeta a eliminar:"); 
        int id=ent.nextInt();
        
	for(int i = 0; i < credit.size(); i++)
	{
            System.out.println("Tarjeta : ");
            CreditCard get = credit.get(i);
                    
            if(id==getId())
            {
		cc=get;
            }
            
             else if(id!=getId())
            {
                System.out.println("La tarjeta de crédito que desea actualizar no existe ");
            }
        }
        
        return cc;
    }   
    
    public void MostrarCC (List <CreditCard> credit)
    {
       
	for (CreditCard c1 : credit) 
        {
            System.out.println("Id: "+c1.getId());
            System.out.println("Numero de tarjeta: "+c1.getCardNumber());
            System.out.println("Tipo de tarjeta: "+c1.getCardType());
            System.out.println("Fecha de expiracion: "+c1.getCardExpDate());
        }
    }
      
    public boolean GuardarCC()
    {   
         final String CC_DATA_FILE = "CC.txt";
         
        String dataLine
                = getCardType() + "," + getCardNumber() + ","
                + getCardExpDate();
        //return futil.writeToFile(CC_DATA_FILE, dataLine, true,true);
        System.out.println("Grabado el archivo " + CC_DATA_FILE + " Texto:"
                + dataLine);
        return true;
    }       
}
