package Command_User;

import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;
import main.*;


public class Join_community implements CommandUser{

    public void execute()
    {

        for(int i=0; i<Create_community.qt_comunidades;i++)
        {
            System.out.printf("%d - %s\n",i,Create_community.comu[i].getName());
        }

        System.out.println("DIGITE O ID DA COMUNIDADE QUE VOCÊ QUER ENTRAR");
        int aux;
        aux = main.TryCatch.anyIntTry();

        if(Create_community.comu[aux]==null)
        {
            System.out.println("A comunidade não existe !!!");
            return ;
        }
        else
        {
            usuarios[User.indice].comunidades[usuarios[User.indice].joined_comu] = aux;
            usuarios[User.indice].joined_comu++;

            System.out.println("O usuário entrou na comunidade:");
            System.out.println(Create_community.comu[aux].getName());
        }

    }
}
