/*
 * Alan Yahir Japhet Gómez Mireles
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alany
 */
//Clase Pacientes
public class Pacientes {
    //Atributos
    private Connection conexion;
    
    //Conectar a la base de datos
    public Connection conectar()
    {
        //Modificar servidor, usuario y contraseña
        String conexionURL = "jdbc:sqlserver://localhost:1433; database = ProyectoTopicosG; "
                 + "user = sa; password = 12345678; loginTimeout = 30;";
                
        try
        {
            conexion = (Connection) DriverManager.getConnection(conexionURL);
            return conexion;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            return null;
        } 
    }
    
    // Método de Desconexión  
    public void disconnect()
    {
        try
        {
            conexion.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
    
    // Método para Mostrar Datos de los Pacientes   
    public void mostrarDatosPacientes(JTable tabla)
    {    
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
                
        conectar();

        modelo=(DefaultTableModel)tabla.getModel();
        modelo.addColumn("Id_paciente");
        modelo.addColumn("Nombre");
        modelo.addColumn("ApPaterno");
        modelo.addColumn("ApMaterno");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Id_cts");
        tabla.setModel(modelo);
        
        String datos[]=new String[8];
        
        try{
            Statement st;
            st=(Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet=st.executeQuery("SELECT * FROM Pacientes");
            
            while(resSet.next())
            {
                datos[0]=resSet.getString(1);
                datos[1]=resSet.getString(2);
                datos[2]=resSet.getString(3);
                datos[3]=resSet.getString(4);
                datos[4]=resSet.getString(5);
                datos[5]=resSet.getString(6);
                datos[6]=resSet.getString(7);
                datos[7]=resSet.getString(8);
                   
                modelo.addRow(datos);          
            }            
            tabla.setModel(modelo);    
            }
        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        //Desconectar        
        disconnect();         
    }
}
