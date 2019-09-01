package Commands;

public class SetCommand{
    private static Command slot;

    public static void setCommand(int Command)
    {
        if(Command==1)
            slot = new Add_Account();
        else if(Command==2)
            slot = new Login();
        else if(Command==0)
            return ;

        slot.execute();
    }
}
