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

/**
 *
 * @author Laura
 */
public class Requerimiento_2 {
    private String proveedor;
    private String constructora;
    private String pagado;

    public Requerimiento_2() {
    }

    public Requerimiento_2(String proveedor, String constructora, String pagado) {
        this.proveedor = proveedor;
        this.constructora = constructora;
        this.pagado = pagado;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

}
