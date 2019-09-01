package Command_User;

public class SetCommandUser {

    private static CommandUser slot;

    public static void setCommandUser(int Command)
    {
        if(Command==1)
            slot = new Edit();
        else if(Command==2)
            slot = new Add_friend();
        else if(Command==3)
            slot = new Send_a_message();
        else if(Command==4)
            slot = new Create_community();
        else if(Command==5)
            slot = new Join_community();
        else if(Command==6)
            slot = new View_profile();
        else if(Command==6)
            slot = new Remove_account();
        else if(Command==8)
            slot = new View_friends();
        else if(Command==0)
            return ;

        slot.execute();
    }
}
