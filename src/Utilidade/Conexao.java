package Utilidade;

import Class.Configuracao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    
    public static Connection getConnection(){
        Connection conexao = null;
        
        Configuracao CF = new Configuracao();
        CF = acessoArquivo.le();
        String server = CF.getServer();
        String porta = CF.getPorta();
        String banco = CF.getBanco();
        String usuario = CF.getUser();
        String senha = CF.getPassword();

        String dadosDoBanco="jdbc:mysql://"+server+":"+porta+"/"+banco;
        
    	try
    	{
	    	Class.forName("com.mysql.jdbc.Driver"); 
	    	System.out.println("Driver carregado");
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Erro ao carregar o driver");
    	}

       try{
           conexao = DriverManager.getConnection(dadosDoBanco, usuario, senha);
           System.out.println("Conexão ok");
       }catch(Exception e){
          System.out.println(e.getMessage());
          conexao = null;
       }
       
       return conexao;
       
    }
    
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
       try{
           if (rs != null) rs.close();
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
   }
   
   
   public static void close(Connection conn, Statement stmt) {
       try{
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
   }
    
}
