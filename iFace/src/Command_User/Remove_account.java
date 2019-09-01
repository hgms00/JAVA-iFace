package Command_User;
import java.util.*;
import main.*;
import Commands.*;
import Commands.Add_Account.*;

import static Commands.Add_Account.qt_usuarios;
import static Commands.Add_Account.usuarios;
public class Remove_account implements CommandUser{

    public void execute()
    {
          usuarios[User.indice] = null;

          System.out.println("SUA CONTA FOI DELETADA COM SUCESSO !");
    }
}
