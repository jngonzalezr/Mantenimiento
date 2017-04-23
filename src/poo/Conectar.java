//Esta es la clase para la conección a la base de datos
package poo;

import java.sql.*; 

public class Conectar {
    Connection conectar=null;
   
    public Connection conexion(){// Esta es la funcion que se usa para conectar a la base de datos
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/poo","root","19931017");
           
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error ┐"+e);
        }
    return conectar; 
    }
}
