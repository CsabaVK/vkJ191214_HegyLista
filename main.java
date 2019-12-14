/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hegyek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;

/**
 */

class hegykek
{
    private String nev;
    private int magassag;

    //Getter//
    public String getNev() {
        return nev;
    }

    public int getMagassag() {
        return magassag;
    }
    
    //Konstruktor//
    public hegykek(String nev, int magassag) {
        this.nev = nev;
        this.magassag = magassag;
    }
    
    public hegykek(String sor)
    {
        String [] d = sor.split(";");
        this.nev = d[0];
        this.magassag = Integer.parseInt(d[1]);
    } 
}
public class Hegyek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <hegykek> hegyek = new ArrayList<>();
        try 
        {
            FileReader fajl = new FileReader("hegy.txt");
            BufferedReader br = new BufferedReader(fajl);
            String sor = null;
            while ((sor = br.readLine())!=null) 
            {                
                hegykek a = new hegykek(sor);
                hegyek.add(a);
            }
        }
        catch (Exception hiba) 
        {
            System.out.println("Nem találhatóó meg a fájl");
        }
        
        for (int i = 0; i < hegyek.size(); i++) 
        {
            System.out.println(hegyek.get(i).getNev()+" " + hegyek.get(i).getMagassag());
        }
        
        int max = 0;
        String maxn = "";
        for (int i = 0; i < hegyek.size(); i++) 
        {
            if (hegyek.get(i).getMagassag() > max) 
            {
                max = hegyek.get(i).getMagassag();
                maxn = hegyek.get(i).getNev();
            }
        }
        System.out.println("\nLegmagasabb hegy: " + maxn + " " + max);
        
        int osszeg=0;
        int atlag=0;
        for (int i = 0; i < hegyek.size(); i++) 
        {
            
        }
    }
}
