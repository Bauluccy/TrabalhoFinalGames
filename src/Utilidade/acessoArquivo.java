/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidade;


import Class.Configuracao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class acessoArquivo {

        public static void grava(Configuracao CF) {
        try {
            FileOutputStream arquivo = new FileOutputStream("lib\\gamesDataBase.cfg");
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(CF);
            fluxo.flush();
            System.out.println("Dados gravados com sucesso no arquivo gamesDataBase.cfg");
        } catch (Exception e) {
            System.out.println("Falha na gravação do arquivo" + (e));

        }

    }

    public static Configuracao le() {
        Configuracao CF = new Configuracao ();
        try {
            FileInputStream arquivo = new FileInputStream("lib\\gamesDataBase.cfg");
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            CF = (Configuracao) fluxo.readObject();
            System.out.println("Dados lidos com sucesso no arquivo gamesDataBase.txt");
        } catch (Exception e) {
            System.out.println("Falha na leitura do arquivo" + (e));
        }
        return CF;
    }
    
    
    
}