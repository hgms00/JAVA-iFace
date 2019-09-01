package Command_User;
import java.util.*;
import main.*;
import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;

public class View_friends implements CommandUser{

    public void execute()
    {
        int aux;
        for (int i = 0 ; i < usuarios[User.indice].qt_pedidos;i++)
        {
            System.out.printf("O usuários %s quer lhe adicionar",usuarios[usuarios[User.indice].pedidos[i]].getName());
            System.out.printf("ACEITAR ?");

            System.out.printf("0 - NÃO");
            System.out.printf("1 - SIM");

            aux = main.TryCatch.booleanintTry();

            if(aux==1)
            {
                usuarios[User.indice].friends[usuarios[User.indice].qt_friends]= usuarios[User.indice].pedidos[i];
                usuarios[User.indice].qt_friends++;
                System.out.println("USUÁRIO ADICIONADO COM SUCESSO !!!");
            }
            else if(aux ==0)
            {
                System.out.println("PEDIDO DE AMIZADE RECUSADO!");
            }
        }

    }
}
