package javaloop;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        Nag n=new Nag();
        n.setMarks(45);
        n.setName("Mani");
        n.setRollno(1);

        Nag n1=new Nag();
        n1.setRollno(2);
        n1.setName("Basha");
        n1.setMarks(67);

        Nag n2=new Nag();
        n2.setRollno(3);
        n2.setMarks(87);
        n2.setName("venkat");

        Nag n3=new Nag();
        n3.setRollno(4);
        n3.setMarks(89);
        n3.setName("venkatesh");

        List<Nag> stds=new ArrayList<>();
        stds.add(n);
        stds.add(n1);
        stds.add(n2);
        stds.add(n3);

        for(int i=1;i<stds.size();i++)
        {
            System.out.println(stds.get(i).getMarks());
            System.out.println(stds.get(i).getName());
            System.out.println(stds.get(i).getRollno());
        }






    }
}
