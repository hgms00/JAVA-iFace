package Command_User;
import java.util.*;
import main.*;
import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.usuarios;

public class Edit implements CommandUser{



    public void execute()
    {
        String name;
        int aux;
        Scanner input = new Scanner(System.in);

        // ALTERAÇAO DE NOME
        System.out.printf("NOME ATUAL : %s\n",usuarios[User.indice].getName());
        System.out.println("Digite seu novo nome(PRESSIONE ENTER PARA MANTÊ-LO):");

        name = input.nextLine();

        if(name!="")
        {
            usuarios[User.indice].setName(name);
            System.out.println("Nome alterado com sucesso !!");
        }

        // ALTERAÇAO DE LOGIN
        System.out.printf("LOGIN ATUAL : %s\n",usuarios[User.indice].getLogin());
        System.out.println("Digite seu novo login(PRESSIONE ENTER PARA MANTÊ-LO):");

        name = input.nextLine();

        if(name!="")
        {
            usuarios[User.indice].setLogin(name);
            System.out.println("Login alterado com sucesso !!");
        }

        // ALTERAÇAO DE SENHA
        System.out.printf("SENHA ATUAL : %s\n",usuarios[User.indice].getSenha());
        System.out.println("Digite sua nova senha(PRESSIONE ENTER PARA MANTÊ-LA):");

        name = input.nextLine();

        if(name!="")
        {
            usuarios[User.indice].setLogin(name);
            System.out.println("Senha alterada com sucesso !!");
        }

        // ALTERAÇAO DE IDADE
        System.out.printf("IDADE ATUAL : %s\n",usuarios[User.indice].getIdade());
        System.out.println("Digite sua nova idade(DIGITE 0 PARA MANTÊ-LA):");

        aux = main.TryCatch.anyIntTry();

        if(aux!=0)
        {
            usuarios[User.indice].setIdade(aux);
            System.out.println("Idade alterada com sucesso !!");
        }

        // ALTERAÇAO DE GENERO
        if(usuarios[User.indice].getGenero()==1)
        {
            System.out.println("Gênero atual : MASCULINO");
        }
        else if(usuarios[User.indice].getGenero()==2)
        {
            System.out.println("Gênero atual : FEMININO");
        }
        else if(usuarios[User.indice].getGenero()==3)
        {
            System.out.println("Gênero atual : OUTRO");
        }

        System.out.println("Digite seu novo gênero(DIGITE 0 PARA MANTÊ-LO):");

        aux = main.TryCatch.zerointTry();

        if(aux!=0)
        {
            usuarios[User.indice].setGenero(aux);
            System.out.println("Gênero alterado com sucesso !!");
        }

        // ALTERAÇAO DE CIDADE
        System.out.printf("CIDADE ATUAL : %s\n",usuarios[User.indice].getCidade());
        System.out.println("Digite sua nova cidade(PRESSIONE ENTER PARA MANTÊ-LA):");

        name = input.nextLine();

        if(name!="")
        {
            usuarios[User.indice].setCidade(name);
            System.out.println("Cidade alterada com sucesso !!");
        }

        // ALTERAÇAO DE RELACIONAMENTO
        if(usuarios[User.indice].getRelacionamento()==1)
        {
            System.out.println("Relacionamento atual : SOLTEIRO");
        }
        else if(usuarios[User.indice].getRelacionamento()==2)
        {
            System.out.println("Relacionamento atual : CASADO");
        }
        else if(usuarios[User.indice].getRelacionamento()==3)
        {
            System.out.println("Relacionamento atual : OUTRO");
        }

        System.out.println("Digite seu novo relacionamento(DIGITE 0 PARA MANTÊ-LO):");

        aux = main.TryCatch.zerointTry();

        if(aux!=0)
        {
            usuarios[User.indice].setRelacionamento(aux);
            System.out.println("Relacionamento alterado com sucesso !!");
        }

        System.out.println("PERFIL ATUALIZADO COM SUCESSO!!!");
    }
}
