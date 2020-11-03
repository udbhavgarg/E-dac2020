package Assignment_04;
import java.util.*;

class Book implements Comparable<Book>
{
    int bookid;
    String bookname;
    int bookcost;

    Book(int bookid,String bookname,int bookcost)
    {
        this.bookid=bookid;
        this.bookname=bookname;
        this.bookcost=bookcost;
    }

    public int compareTo(Book b)
    {
        if(b.bookcost!=bookcost)
        {
        if(b.bookcost>bookcost)
        {
            return 1;
        }
        else
        return -1;
        }
        else
        return bookname.compareTo(b.bookname);
    }
 
}

class four02
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> al=new ArrayList<Book>();
        for(int n=0;n<5;n++)
        {
        	System.out.println("Enter the Book ID for Book No.: "+(n+1));
            int i=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Book Name for Book No.:"+(n+1));
            String s=sc.next();
            System.out.println("Enter the Book Price for Book No.:"+(n+1));
            int p=sc.nextInt();

             al.add(new Book(i,s,p));
        }
        System.out.println("Following books having heighest price");
        Collections.sort(al);
        for(Book b:al)
        {
        	System.out.println(b.bookid+" "+b.bookname+" "+b.bookcost);
        }
        sc.close();
        
    }

}

