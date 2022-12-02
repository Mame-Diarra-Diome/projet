import java.util.*;
public class Exercice2
{ public static void main(String[] args){
 int doubl ,n;
doubl = 0;
n=0;
Scanner sc = new Scanner(System.in);
 System.out.println ("Donner un entier") ;
 n= sc.nextInt();
doubl = n * 2;
 System.out.println ("le double de :"+n+"=est "+ doubl) ;
sc.close();
 }
}