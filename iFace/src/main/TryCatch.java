package main;

import java.util.*;

public class TryCatch {

    public static int intTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 1 || intTry > 3)
                    throw new Exception("Fora do intervalo");

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }

        return intTry;
    }
    public static int zerointTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 0 || intTry > 3)
                    throw new Exception("Fora do intervalo");

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }

        return intTry;
    }

    public static int firstintTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 0 || intTry > 2)
                    throw new Exception("Fora do intervalo");

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }

        return intTry;
    }

    public static String stringTry()
    {
        String stringTry = "";
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                stringTry="";
                flag = true;
                stringTry = input.nextLine();
                if (stringTry == "")
                    throw new Exception("String vazia");

            } catch (Exception e) {
                System.out.println("Por favor, digite algo no campo correspondente");
                input.nextLine();
                flag = false;
            }
        }

        return stringTry;
    }

    public static int anyIntTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }
        return intTry;
    }

    public static int usingTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 0 || intTry > 8)
                    throw new Exception("Fora do intervalo");

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }
        return intTry;
    }


    public static double doubleTry()
    {
        double doubleTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                doubleTry=0;
                flag = true;
                doubleTry = input.nextDouble();


            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor válido");
                input.nextLine();
                flag = false;
            }
        }
        return doubleTry;
    }
    public static int booleanintTry()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry != 0 && intTry != 1)
                    throw new Exception("Fora do intervalo");

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido");
                input.nextLine();
                flag = false;
            }
        }

        return intTry;
    }


}