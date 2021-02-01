/**
 *
 * @author Antonella C
 */
package Controlador;

import Modelo.Account;
import Modelo.Address;
import Modelo.CreditCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorAccount {

    Scanner ent = new Scanner(System.in);

    Address adress = new Address();
    CreditCard cc = new CreditCard();

    List<Account> account = new ArrayList();
    List<Address> add = new ArrayList();
    List<CreditCard> credit = new ArrayList();

    private Account modelo;

    public boolean ValidarAcc() {
        for (int i = 0; i < account.size(); i++) {
            Account get = account.get(i);
            if (get.getFirstName().trim().equals("")) {
                return false;
            }
            if (get.getLastName().trim().equals("")) {
                return false;
            }
        }
        return true;
    }

    public boolean Guardar(int idacc) {
        int id = idacc;

        for (int i = 0; i < account.size(); i++) {
            Account get = account.get(i);
            if (idacc <= get.getIdacc()) {
                String dataLine = get.getLastName() + "," + get.getFirstName() + "," + get.getAdress().getAddress() + ","
                        + get.getAdress().getCity() + "," + get.getAdress().getState() + "," + get.getCc().getCardNumber() + ","
                        + get.getCc().getCardType() + "," + get.getCc().getCardExpDate();

                System.out.println("Grabado el archivo " + " Texto:"
                        + dataLine);
            }
        }
        return true;
    }

    public void setFName(String inFName) {
        this.modelo.setFName(inFName);
    }

    public void setLName(String inLName) {
        this.modelo.setLName(inLName);
    }

    public void setID(int idacco) {
        this.modelo.setID(idacco);
    }

    public String getFirstName() {
        return modelo.getFirstName();
    }

    public String getLastName() {
        return modelo.getLastName();
    }

    public int getIdacc() {
        return modelo.getIdacc();
    }

    public void setCc(int idc, String cardType, String cardNumber, String cardExpDate) {
        cc.setCardType(cardType);
        cc.setCardExpDate(cardExpDate);
        cc.setCardNumber(cardNumber);
        this.modelo.setCc(cc);
    }

    public void setAdress(int id, String ciudad, String estado, String direccion) {
        adress.setIdadd(id);
        adress.setCity(ciudad);
        adress.setState(estado);
        adress.setAddress(direccion);

        this.modelo.setAdress(adress);
    }

    public void InsertarAcc() {
        Account acc = new Account();
        Address objadd = new Address();
        CreditCard objCcard = new CreditCard();

        ControladorAccount cuenta = new ControladorAccount();
        ControladorAddress direccion = new ControladorAddress();
        ControladorCreditCard tarjeta = new ControladorCreditCard();

        System.out.println("Ingrese los datos del cliente de cuenta: ");

        System.out.println("Nombre ");
        acc.setFName(ent.nextLine());

        System.out.println("Apellido ");
        acc.setLName(ent.nextLine());

        System.out.println("Identificacion ");
        acc.setID(ent.nextInt());

        acc.setAdress(direccion.InsertarAdd());

        acc.setCc(tarjeta.InsertarCC());

        account.add(acc);

        //account.add(acc);
    }

    public void ActualizarAcc() {
        System.out.print("Buscar cuenta a actualizar:");

        //System.out.println("tamaño : "+account.size());
        System.out.println("Solicitar cambio : ");
        int id = ent.nextInt();
        for (int i = 0; i < account.size(); i++) {
            Account get = account.get(i);
            //System.out.println("entró");

            if (id == get.getIdacc()) {
                int opc = 0;

                System.out.println("-----Que datos desea actualizar: -----");

                System.out.println("1. Usuario Cuenta");
                System.out.println("2. Dirección");
                System.out.println("3. Tarjeta de Crédito");
                System.out.println("4. Salir");
                opc = ent.nextInt();

                switch (opc) {
                    case 1:

                        System.out.println("Ingrese el nuevo nombre");
                        get.setFName(ent.next());
                        System.out.println("Ingrese el nuevo apellido");
                        get.setLName(ent.next());

                        break;

                    case 2:

                        Address d = new Address();

                        System.out.println("Ingrese la nueva direccion");
                        d.setAddress(ent.nextLine());

                        System.out.println("Ingrese el nuevo estado");
                        d.setState(ent.nextLine());

                        System.out.println("Ingrese la nueva ciudad");
                        d.setCity(ent.nextLine());

                        get.setAdress(d);

                        break;

                    case 3:

                        CreditCard c = new CreditCard();

                        System.out.println("Ingrese el nuevo número de tarjeta");
                        c.setCardNumber(ent.nextLine());

                        System.out.println("Ingrese la nueva fecha de expiracion");
                        c.setCardExpDate(ent.nextLine());

                        System.out.println("Ingrese el nuevo tipo de tarjeta");
                        c.setCardType(ent.nextLine());

                        get.setCc(c);
                        break;
                }
            }
        }
    }

    public void EliminarAcc() {
        Account acc = new Account();
        Address objadd = new Address();
        CreditCard objCcard = new CreditCard();

        ControladorAccount cuenta = new ControladorAccount();
        ControladorAddress direccion = new ControladorAddress();
        ControladorCreditCard tarjeta = new ControladorCreditCard();

        System.out.print("Buscar la cuenta a eliminar:");
        int id = ent.nextInt();

        System.out.println("La cuenta que desea eliminar es: " + id);

        for (int i = 0; i < account.size(); i++) {
            Account get = account.get(i);

            if (id == get.getIdacc()) {
                int opc = 0;
                System.out.println("-----Que datos desea eliminar: -----");

                System.out.println("1. Dirección");
                System.out.println("2. Tarjeta de Crédito");
                System.out.println("3. Cuenta");
                System.out.println("4. Salir");
                opc = ent.nextInt();

                switch (opc) {
                    case 1:
                        get.setAdress(direccion.EliminarAdd());
                        account.remove(get);
                        System.out.println("La direccion ha sido eliminada");
                        /*acc.setAdress(direccion.EliminarAdd());
                        account.remove(acc);
                        System.out.println("La direccion ha sido eliminada");*/
                        break;

                    case 2:
                        acc.setCc(tarjeta.EliminarCC());
                        account.remove(acc);
                        System.out.println("La tarjeta ha sido eliminada");
                        break;

                    case 3:
                        account.remove(acc);
                        System.out.println("Eliminar cuenta");
                        break;
                }
            }
        }

    }

    public void MostrarAcc() {
        for (Account acc : account) {
            System.out.println(" -------------- CUENTA -------------: ");
            System.out.println("Id dirección: " + acc.getAdress().getIdadd());
            System.out.println("Direcciòn: " + acc.getAdress().getAddress());
            System.out.println("Estado: " + acc.getAdress().getState());
            System.out.println("Ciudad: " + acc.getAdress().getCity());

            System.out.println("Id tarjeta: " + acc.getCc().getId());
            System.out.println("Numero de tarjeta" + acc.getCc().getCardNumber());
            System.out.println("Fecha de expiración: " + acc.getCc().getCardExpDate());
            System.out.println("Tipo de tarjeta: " + acc.getCc().getCardType());

            System.out.println("Id: " + acc.getIdacc());
            System.out.println("Nombre: " + acc.getFirstName());
            System.out.println("Apellido: " + acc.getLastName());

            System.out.println(" ---------------------------: ");

        }

    }

    public boolean saveCustomerData() {
        boolean validData = true;
        String errorMessage = "";

        if (ValidarAcc() == false) {
            validData = false;
            errorMessage = "Invalid FirstName/LastName";
        }

        ControladorAddress obj = new ControladorAddress();
        if (obj.isValid() == false) {
            validData = false;
            errorMessage = "Invalid Address/City/State";
        }

        ControladorCreditCard objCreditCard = new ControladorCreditCard();
        if (objCreditCard.isValid() == false) {
            validData = false;
            errorMessage = "Invalid CreditCard Info";
        }

        if (!validData) {
            System.out.println(errorMessage);
            return false;
        }

        for (int id = 0; id < account.size(); id++) {
            if (Guardar(id) && obj.GuardarAdd() && objCreditCard.GuardarCC()) {
                return validData = true;

            } else {
                return validData = false;
            }
        }
        return validData;
    }

    /*public boolean saveCustomerData() 
    {
        boolean validData = true;
        String errorMessage = "";

        if (ValidarAcc() == false) 
        {
            validData = false;
            errorMessage = "Invalid FirstName/LastName";
        }
        
        if (!validData) 
        {
            System.out.println(errorMessage);
            return false;
        }
        
        for (int id = 0; id < account.size(); id++) 
        {
            if (Guardar(id))
            {
                return validData = true;

            } else {
                return validData = false;
            }
        }
        return validData;
    }*/
}
