import java.util.*;
public class Exercice1{ 
public static void main(String[] args)
throws Exception{
System.out.println ("Donner votre nom svp!") ;
Scanner sc = new Scanner(System.in);
String St= sc.nextLine();
System.out.println ("Bienvenue " +St);
sc.close();
 }
}