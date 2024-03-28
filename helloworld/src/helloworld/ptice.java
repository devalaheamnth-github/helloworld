package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ptice
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      String s=sc.next();
      String as="";
      String br="";
      String go="";
		char a='A';
      char b='B';
      char c='C';
      int cas=0;
       int cbr=0;
       int cgo=0;
      for(int i=0;i<n;i++)
        {
          if(i%3==0)
          {
            as=as+a;
          }
          else if(i%3==1 )
          {
            as=as+b;
          }
          else if(i%3==2)
          {
            as=as+c;
          }
        }
      //
         for(int i=0;i<n;i++)
        {
          if(i%4==0)
          {
            br=br+b;
          }
          else if(i%4==1 )
          {
            br=br+a;
          }
          else if(i%4==2)
          {
            br=br+b;
          }
          else if(i%4==3)
          {
            br=br+c;
          }
        }
      //
        for(int i=0;i<n;i++)
        {
          if(i%6==0 || i%6==1)
          {
            go=go+c+c;
          }
          else if(i%6==2 || i%6==3 )
          {
                  go=go+a+a;
          }
          else if(i%6==4 || i%6==5)
          {
            go=go+b+b;
          }
        }
      for(int j=0;j<n;j++)
        {
         if(s.charAt(j)==as.charAt(j))
            {
           cas++;
            }
        }
      for(int j=0;j<n;j++)
        {
         if(s.charAt(j)==br.charAt(j)) 
            {
           cbr++;
            }
        }
       for(int j=0;j<n;j++)
        {
         if(s.charAt(j)==br.charAt(j)) 
            {
           cgo++;
            }
        }
       if( cas>= cbr && cas >= cgo){
            System.out.println(cas);
         System.out.println("Adrian");
       }
        else if (cbr >= cas && cbr >= cgo){
            System.out.println(cbr);
          System.out.println("Bruno");
        }
        else{
            System.out.println(cgo);
          System.out.println("Goran");
        }
        }
	
}
