package Command_User;

import java.util.Scanner;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;

public class View_profile implements CommandUser{

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

        System.out.println("NOME :");
        System.out.println(usuarios[i].getName());
        System.out.println("IDADE : ");
        System.out.println(usuarios[i].getIdade());
        System.out.println("LOGIN :");
        System.out.println(usuarios[i].getLogin());

        System.out.println("RELACIONAMENTO: ");

        if(usuarios[i].getRelacionamento()==1)
            System.out.println("SOLTEIRO\n");
        if(usuarios[i].getRelacionamento()==2)
            System.out.println("CASADO\n");
        if(usuarios[i].getRelacionamento()==3)
            System.out.println("OUTRO\n");

        System.out.println("GÊNERO: ");

        if(usuarios[i].getRelacionamento()==1)
            System.out.println("MASCULINO\n");
        if(usuarios[i].getRelacionamento()==2)
            System.out.println("FEMININO\n");
        if(usuarios[i].getRelacionamento()==3)
            System.out.println("OUTRO\n");

        System.out.println("CIDADE: ");
        System.out.println(usuarios[i].getCidade());
    }
}
