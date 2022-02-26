/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonasequences;

/**
 *
 * @author Chezhian
 */
public class Fibonasequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=20;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
    }
    
}
