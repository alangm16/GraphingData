/*
 * Alan Yahir Japhet Gómez Mireles 20130820
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
//Clase catalogo
public class Catalogo {
    //Atributos
    private Connection conexion;
    
    //Conectar a la base de datos
    public Connection conectar()
    {
        //Modificar servidor, usuario y password
        String conexionURL = "jdbc:sqlserver://localhost:1433; database = ProyectoTopicosG; "
                 + "user =sa; password =12345678; loginTimeout = 30;";
        
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
    
    // Método para Mostrar Datos del Catalogo   
    public void mostrarDatosCatalogo(JTable tabla)
    {    
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
                
        conectar();

        modelo=(DefaultTableModel)tabla.getModel();
        modelo.addColumn("Id_cts");
        modelo.addColumn("TipoSangre");
        modelo.addColumn("PorcentajeRareza");
        
        tabla.setModel(modelo);
        
        String datos[]=new String[3];
        
        try{
            Statement st;
            st=(Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet=st.executeQuery("SELECT * FROM Catalogo");
            
            while(resSet.next())
            {
                datos[0]=resSet.getString(1);
                datos[1]=resSet.getString(2);
                datos[2]=resSet.getString(3);
                   
                modelo.addRow(datos);          
            }            
            tabla.setModel(modelo);    
            }
        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        //Desconecta
        disconnect();
    }
}
