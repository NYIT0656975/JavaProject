/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ipgenerator;

import java.io.*;
import java.net.*;
import java.util.Random;


/**
 *
 * @author Master
 */
public class IPGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException{
        
            InetAddress Address = InetAddress.getLocalHost(); 
            System.out.println(Address); 
            System.out.println(Address.getHostAddress());
            
            
            
            Random rno=new Random();
            
            for(int i=1; i<=10; i++){
                int block1=rno.nextInt(255);
                int block2=rno.nextInt(255);
                int block3=rno.nextInt(255);
                int block4=rno.nextInt(255);
                System.out.print("IP"+ i + ": " + block1 + ":"+ block2 + ":"+ block3 +":"+ block4+ "\n");
            
            
            }
            
        }
        
   }
        
           
   
