package Commands;
import java.util.*;
import main.*;

public class Add_Account implements Command{
    public static Account[] usuarios = new Account[1000];
    public static int qt_usuarios = 0;

    private static String name;
    private static String login;
    private static String senha;
    private static int aux;


    public void execute()
    {
        System.out.println("Vamos começar com seu nome !\n");
        System.out.println("Digite seu nome: ");
        usuarios[qt_usuarios] = new Account();

        name = main.TryCatch.stringTry();
        usuarios[qt_usuarios].setName(name);

        System.out.println("Digite um login para sua conta: ");
        login = main.TryCatch.stringTry();
        usuarios[qt_usuarios].setLogin(login);

        System.out.println("Digite uma senha para sua conta ");
        senha = main.TryCatch.stringTry();
        usuarios[qt_usuarios].setSenha(senha);


        System.out.println("Agora vamos preencher alguns dados básicos da sua conta");
        System.out.println("Informe seu gênero:");
        System.out.println("1 - MASCULINO");
        System.out.println("2 - FEMININO");
        System.out.println("3 - OUTRO");
        aux = main.TryCatch.intTry();
        usuarios[qt_usuarios].setGenero(aux);

        System.out.println("Informe sua idade:");
        aux = main.TryCatch.anyIntTry();
        usuarios[qt_usuarios].setIdade(aux);

        System.out.println("Informe sua cidade");
        senha = main.TryCatch.stringTry();
        usuarios[qt_usuarios].setCidade(senha);

        System.out.println("Relacionamento:");
        System.out.println("1 - SOLTEIRO");
        System.out.println("2 - CASADO");
        System.out.println("3 - OUTRO");
        aux = main.TryCatch.intTry();
        usuarios[qt_usuarios].setRelacionamento(aux);


        System.out.println("REGISTRO EFETUADO COM SUCESSO !!!");

        qt_usuarios++;
    }
}
