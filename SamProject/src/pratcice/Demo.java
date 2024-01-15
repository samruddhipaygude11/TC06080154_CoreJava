package pratcice;

import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        // int id =100;
        // float marks = 80;
        // String name = "Pooja";
        // System.out.println(id+" "+name+" "+marks);
        
        int id ;
        String name ;
        float Hindi;
        float English;
        float Marathi;
        float Maths;
        float total;
        float per;
        // char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        id=sc.nextInt();
        System.out.println("Enter name : ");
        name=sc.next();
        System.out.println("Enter Hindi : ");
        Hindi=sc.nextFloat();
        System.out.println("Enter English : ");
        English=sc.nextFloat();
        System.out.println("Enter Marathi : ");
        Marathi=sc.nextFloat();
        System.out.println("Enter Maths : ");
        Maths=sc.nextFloat();
        total=Hindi+English+Marathi+Maths;
        per=(total*100)/400;
        // System.out.println("Enter any character:-");
        // ch=sc.next().charAt(2);
        // System.out.println("Entered character is :- "+ch);
        System.out.println("Enter id : "+id);
        System.out.println("Enter name : "+name);
        System.out.println("Enter Hindi : "+Hindi);
        System.out.println("Enter English : "+English);
        System.out.println("Enter Marathi : "+Marathi);
        System.out.println("Enter Maths : "+Maths);
        System.out.println("Enter total : "+total);
        System.out.println("Enter Percentage : "+per);
        
        // if(per<=35)
        // {
        //     System.out.println("Fail");
        // }
        // else
        // {
        //     System.out.println("Pass");
        // }
        
        // if(per>=75 && per<=100)
        // {
        //     System.out.println("First Class");
        // }
        // else if(per>=50 && per<75)
        // {
        //     System.out.println("Second class");
        // }
        // else if(per>=35 && per<50)
        // {
        //     System.out.println("Third Class");
        // }
        // else
        
        // {
        //     System.out.println("Fail");
        // }
        
        if(per>=75)
        {
            if(per<100)
            {
                System.out.println("First Class");
            }
        }
        if(per>=50)
        {
            if(per<75)
            {
                System.out.println("Second Class");
            }
        }
        if(per<=35)
        {
            System.out.println("Fail");
        }
    }
}
