package main;
import java.util.*;
import Commands.*;
import Command_User.*;
import static Command_User.SetCommandUser.setCommandUser;
import static Commands.Add_Account.usuarios;

public class User {

    public static int indice = -1;
    public static void using_iface(int indice1)
    {
        indice = indice1;
        int command = 1;
        Scanner input = new Scanner(System.in);
        while(command!=0) {
            Texts.using_iface_text();
            command = TryCatch.usingTry();

            setCommandUser(command);

            if(command==0)
                indice = -1;

            if(usuarios[indice]==null)
            {
                System.out.println("Essa conta nao existe mais!");
                command = 0 ;
            }

        }
    }
}
