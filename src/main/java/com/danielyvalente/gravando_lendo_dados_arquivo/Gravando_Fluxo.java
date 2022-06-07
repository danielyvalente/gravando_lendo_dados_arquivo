package com.danielyvalente.gravando_lendo_dados_arquivo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Gravando_Fluxo {
    public static void main(String[] args) {
        File arquivo1 = new File("teste.txt");
        try( FileWriter fw = new FileWriter(arquivo1) ){
            fw.write('2');
            fw.write("25");
            fw.flush();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        File arquivo2 = new File("teste.xt");
        try( FileReader fr = new FileReader(arquivo2) ){
            int c = fr.read();
            while( c != -1){
                System.out.print( (char) c );
                c = fr.read();
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
}
