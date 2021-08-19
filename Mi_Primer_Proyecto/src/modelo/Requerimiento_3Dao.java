/*
* Requerimiento 3 - Obtener Cargo y el máximo de los salarios de los lideres agrupados por Cargo y por medio
* de un HAVING especificar la siguiente condición: MAX(Salario)>700000
*/
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author Laura
 */
public class Requerimiento_3Dao {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            // Recorrer los registros en los VO específicos
            String consulta = "SELECT Cargo, MAX(l.Salario)AS MaxSalario FROM Lider l \n" +
                              "GROUP BY Cargo HAVING (Salario)>=(SELECT Salario FROM Lider WHERE Salario > 700000)";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {

                Requerimiento_3 requerimiento3 = new Requerimiento_3();
                requerimiento3.setCargo(resultSet.getString("Cargo"));
                requerimiento3.setMaxSalario(resultSet.getInt("MaxSalario"));
                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento3);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error"+e);

        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        // Retornar la colección de vo's
        return respuesta;

    }
    
}
