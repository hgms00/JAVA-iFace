package Command_User;
import java.util.*;
import main.*;
import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;


public class Add_friend implements CommandUser{

    public void execute()
    {
        String search;
        int searching = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o @ do usuário");

        search = input.nextLine();
        int i=0;
        for(i=0;i<qt_usuarios;i++)
        {
            if(search.equals(usuarios[i].getLogin()))
            {
              searching = 1;
              break;
            }
        }

        System.out.println(i);
        System.out.println(usuarios[i].qt_pedidos);
        System.out.println(User.indice);

        usuarios[i].setPedidos(User.indice);
        usuarios[i].qt_pedidos++;
        System.out.println("PEDIDO DE AMIZADE ENVIADO");
    }
}
