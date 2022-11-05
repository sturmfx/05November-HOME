package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Test1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean go = true;
        while(go)
        {
            String name = s.nextLine();
            if(name.equals("exit"))
            {
                go = false;
            }
            else
            {
                list.add(name);
            }
        }

        for(String n: list)
        {
            System.out.print(n +" ");
        }
    }
}
