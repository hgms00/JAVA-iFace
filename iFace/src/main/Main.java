package main;

import java.util.Scanner;
import java.lang.*;

import static Commands.SetCommand.setCommand;

public class Main{

    public static void main(String[] args)
    {
        int command = 1;
        Scanner input = new Scanner(System.in);

        while(command!=0)
        {
            Texts.inicial_text();
           command = main.TryCatch.firstintTry();
           setCommand(command);

        }
    }

}
