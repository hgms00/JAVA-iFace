package Commands;
import java.util.*;
import main.*;

public class Login implements Command{
    private static String login_try;
    private static String senha_try;
    private static int aux;

    private static int searching = 0;

    public void execute()
    {

        System.out.println("Digite seu login:");
        login_try = main.TryCatch.stringTry();
        int indice = -1;

        int i=0;
        for(i=0;i<Add_Account.qt_usuarios && searching==0;i++)
        {

            if(login_try.equals(Add_Account.usuarios[i].getLogin()))
            {
                searching = 1;
                indice = i;
                break;
            }
        }

        if(searching==0 || indice==-1)
        {
            System.out.println("O usuário não existe !!");
            return ;
        }

        searching = 0;
        System.out.println("Digite sua senha:");
        senha_try = main.TryCatch.stringTry();




        if(senha_try.equals(Add_Account.usuarios[indice].getSenha()))
        {
            searching = 1;
        }



        if(searching==0)
        {
            System.out.println("Senha inválida !!");
            return ;
        }

        System.out.println("LOGIN EFETUADO COM SUCESSO!!");


         main.User.using_iface(i);

    }
}
