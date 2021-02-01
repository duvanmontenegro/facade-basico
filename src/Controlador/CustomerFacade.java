/**
 *
 * @author Antonella C
 */
package Controlador;

import java.util.Scanner;

/**
 *
 * Fachada
 *
 */
public class CustomerFacade {

    Scanner ent = new Scanner(System.in);

    private ControladorAccount cuenta = new ControladorAccount();
    private ControladorAddress direccion = new ControladorAddress();
    private ControladorCreditCard tarjeta = new ControladorCreditCard();

    public CustomerFacade() {
    }

    public void Registrar() {
        //account.add(cuenta.InsertarAcc(direccion.InsertarAdd(),tarjeta.InsertarCC()));
        //add(direccion.InsertarAdd());
        //account.add(cuenta.InsertarAcc());
        //credit.add(tarjeta.InsertarCC());

        cuenta.InsertarAcc();
    }

    public void Actualizar() {
        cuenta.ActualizarAcc();
        // direccion.ActualizarAdd();
        //tarjeta.ActualizarCC(credit);             
    }

    public void Eliminar() {
        cuenta.EliminarAcc();
        /*account.remove(cuenta.EliminarAcc(direccion.EliminarAdd(),tarjeta.EliminarCC())); //pasar al controlador account
        account.remove(cuenta.EliminarAcc());
        add.remove(direccion.EliminarAdd());
       credit.remove(tarjeta.EliminarCC());*/
    }

    public void Mostrar() {
        cuenta.MostrarAcc();

        /*-- cuenta.MostrarAcc(account); MIRAR LOGICA EN EL CONTROLADOR ACCOUNT 
            cuenta.MostrarAcc(account);
            direccion.MostrarAdd(add);
            tarjeta.MostrarCC(credit);
       cuenta.MostrarAcc(direccion.MostrarAdd(),tarjeta.MostrarCC()); */
    }

    public boolean saveCustomerData() {
        ControladorAccount objAccount = new ControladorAccount();

        if (objAccount.saveCustomerData() == true) {
            return true;
        }

        return false;

    }

    /* public boolean Guardar() 
    {
        ControladorAddress objAddress;
        ControladorAccount objAccount;
        ControladorCreditCard objCreditCard;
        
        boolean validData = true;
        String errorMessage = "";
        objAccount = new ControladorAccount();
        //objAccount.setFName(name);
        
        if (objAccount.ValidarAcc()== false) 
        {
            validData = false;
            errorMessage = "Invalid FirstName/LastName";
        }

        objAddress = new ControladorAddress();
        if (objAddress.isValid()== false) 
        {
            validData = false;
            errorMessage = "Invalid Address/City/State";
        }

        objCreditCard = new ControladorCreditCard();
        if (objCreditCard.isValid() == false) 
        {
            validData = false;
            errorMessage = "Invalid CreditCard Info";
        }
        if (!validData) 
        {
            System.out.println(errorMessage);
            return false;
        }
        if (objAccount.saveCustomerData()) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    } */
}
