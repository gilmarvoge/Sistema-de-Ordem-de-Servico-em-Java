/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;

/**
 *
 * @author Gilmar Vogel
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexão com o banco mysql
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o driver 
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabeleceno a conexão com o banco
        //tratar excessões
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
           //msg para ver erro do motivo da não conexão com mysql
           // System.out.println(e);
            return null;
        }
       
    }
}
