package Command_User;

import java.util.Scanner;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;
import main.*;

public class Send_a_message implements CommandUser{

    public void execute()
    {

        String search;
        int searching = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o @ do usuário que a mensagem será enviada");

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

        System.out.println("DIGITE A MENSAGEM ABAIXO (PRESSIONE ENTER QUANDO FINALIZAR): ");

        search = input.nextLine();
        
        
         if(usuarios[i]!=null){
         usuarios[i].message[usuarios[i].qt_message] = search;
        usuarios[i].qt_message++;
         }
        
        System.out.println("MENSAGEM ENVIADA COM SUCESSO");

    }
}
