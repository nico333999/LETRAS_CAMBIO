/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author nico-
 */
public class Conectar {
   Connection con=null;
   public  Connection conexion(){
   try{
   //cargar el driver
   Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost/registro_letras_cambio","root","katherine.");
   System.out.println("conexion establecida");
           
   }catch(ClassNotFoundException | SQLException e){
   System.out.println("error de conexion");
   
   
   }
       return con;
   }
   
}
