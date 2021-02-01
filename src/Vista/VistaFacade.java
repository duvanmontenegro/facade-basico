/**
 *
 * @author Antonella C
 */
package Vista;

import Controlador.CustomerFacade;
import java.util.Scanner;

public class VistaFacade 
{

    public void Tarjeta() 
    {
        CustomerFacade cf = new CustomerFacade();
        int opc = 0;

        do 
        {

            System.out.println("----------------Tarjeta----------------");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Actualizar cuenta ");
            System.out.println("3. Eliminar cuenta");
            System.out.println("4. Listar cuenta(s)");
            System.out.println("5. Guardar");
            System.out.println("6. Salir");

            System.out.println("Ingrese la opcion: ");
            Scanner entrada = new Scanner(System.in);
            opc = entrada.nextInt();

            switch (opc) 
            {

                case 1:

                    cf.Registrar();
                    break;

                case 2:

                    cf.Actualizar();

                    break;

                case 3:

                    cf.Eliminar();
                   
                    break;

                case 4:

                    cf.Mostrar();
                    break;
                    
                case 5:
                    cf.saveCustomerData();
                    break;
            }

        } while (opc != 6);

    }
}

