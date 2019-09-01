package Command_User;
import java.util.*;
import main.*;
import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;

public class Create_community implements CommandUser{

    public static Comunidades[] comu = new Comunidades[1000];
    public static int qt_comunidades = 0;

    public void execute()
    {
        String aux;
        comu[qt_comunidades] = new Comunidades();

        System.out.println("DIGITE O NOME DA SUA COMUNIDADE : ");
        aux = main.TryCatch.stringTry();
        comu[qt_comunidades].setName(aux);

        System.out.println("DIGITE A DESCRIÇÃO DA COMUNIDADE (APERTE ENTER AO FINALIZAR) :");
        aux = main.TryCatch.stringTry();
        comu[qt_comunidades].setDescription(aux);

        System.out.println("COMUNIDADE CRIADA COM SUCESSO !!!!");
    }

}
