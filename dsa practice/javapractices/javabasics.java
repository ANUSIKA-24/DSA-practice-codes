import java.util.Scanner;
public class javabasics
{
    public static void main(String args[])
    {
        char r;
        do{
            System.out.println("**************library management system**************");
            System.out.println("press 1 to add book");
            System.out.println("press 2 to issue a book");
            System.out.println("press 3 to return a book");
            System.out.println("press 4 to print complete issue details");
            System.out.println("press 5 to exit");
            Scanner obj1=new Scanner(System.in);
            System.out.println("enter any number");
            int a=obj1.nextInt();
            switch(a)
            {
                case 1: library aa=new library();
                aa.add();
                break;
                case 2:library bb=new library();
                bb.iss();break;
                case 3:library cc=new library();
                cc.retur();break;
                case 4:library dd=new library();
                dd.detail();
                break;
                case 5:library ee=new library();
                ee.exit();break;
                default :
                System.out.println("invalid number");
            }
            System.out.println("you want to select neat option Y/N");
            r=obj1.next().charAt(0);
            if(r=='n'||r=='N')
            {
                library z=new library();
                z.exit();
            }
        }while(r=='Y'||r=='y');}
    }
    class library
    {
        static String str,c,b,date;
        static int a;
        {
            public void add()
            {
                System.out.println("enter book name,price and book_no.");
                Scanner obj2=new Scanner(System.in);
                String str=obj2.nextLine();
                float price=obj2.nextInt();
                int bookno=obj2.nextInt();
                System.out.println("your details are"+str+price+bookno);
            }
            void iss()
            {
                Scanner obj3=new Scanner(System.in);
                System.out.println("book name");
                str=obj3.nextLine();
                System.out.println("book_id");
                a=obj3.nextInt();
                obj3.nextLine();
                System.out.println("issue date");
                b=obj3.nextLine();
                System.out.println("total number of books issued");
                c=obj3.nextLine();
                System.out.println("return book date");
                date=obj3.nextLine();
            }
            void retur()
            {
                System.out.println("enter student name & book_id");
                Scanner c=new Scanner(System.in);
                String name=c.nextLine();
                int bookid=c.nextInt();
                if(a==bookid)
                {
                    System.out.println("total details");
                    System.out.println("book name ::"+library.str);
                    System.out.println("book id::"+library.a);
                    System.out.println("issue date"+library.b);
                    System.out.println("total number of book issued ::"+library.c);
                    System.out.println("book return date ::"+library.date);
                }
                else{
                    System.out.println("wrong id ,please enter correct id");
                }
            }
            void detail()
            {
                System.out.println("book name ::"+library.str);
                System.out.println("book id::"+library.a);
                System.out.println("issue date"+library.b);
                System.out.println("total number of book issued ::"+library.c);
                System.out.println("book return date ::"+library.date);   
            }
             void exit()
            {
                System.exit(0);
            }
        }
    }
}


