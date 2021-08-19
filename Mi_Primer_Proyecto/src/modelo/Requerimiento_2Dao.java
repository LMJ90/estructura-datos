/*
* Requerimiento 2 -Obtener el listado de compras con información:
* Proveedor, Constructora y Pagado. Para lo anterior se debe realizar un INNER JOIN
* entre a las tablas Compra y Proyecto. Finalmente, la información debe filtrarse de la
* siguiente manera,
* • Proveedor debe estar en ('Homecenter', 'JUMBO'),
* • Pagado debe ser igual a 'Si'
* • Constructora debe coincidir con la cadena '%S.A.'
* • Toda esta información ordenada por Proveedor.
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
public class Requerimiento_2Dao {
  public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
      
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            // Recorrer los registros en los VO específicos
            String consulta = "SELECT c.Proveedor, p.Constructora, c.Pagado FROM Proyecto p \n" +
                              "JOIN Compra c ON (p.ID_Proyecto = c.ID_Proyecto)\n" +
                              "WHERE c.Proveedor IN ('Homecenter','JUMBO') AND c.Pagado LIKE 'Si' AND p.Constructora LIKE '%S.A.' ORDER BY c.Proveedor";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {
                Requerimiento_2 requerimiento2 = new Requerimiento_2();
                requerimiento2.setProveedor(resultSet.getString("Proveedor"));
                requerimiento2.setConstructora(resultSet.getString("Constructora"));
                requerimiento2.setPagado(resultSet.getString("Pagado"));
                respuesta.add(requerimiento2);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        // Retornar la colección de vo's
        return respuesta;

    }
}
