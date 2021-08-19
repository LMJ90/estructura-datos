/*
* Requerimiento 1 - Obtener el listado de proyectos con información:
* Constructora, Ciudad, Banco_Vinculado, Porcentaje_Cuota_Inicial, Clasificacion y
* Fecha_Inicio. 
* Esta información debe ser filtrada, donde la Ciudad sea igual a 'Pereira'.
 */
package modelo;

/**
 *
 * @author Laura
 */
public class Requerimiento_1 {
    private String constructora;
    private String ciudad;
    private String banco;
    private Double porcentaje;
    private String clasificacion;
    private String fecha;

    public Requerimiento_1() {

    }

    public Requerimiento_1(String constructora, String ciudad, String banco, Double porcentaje, String clasificacion,
            String fecha) {
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.banco = banco;
        this.porcentaje = porcentaje;
        this.clasificacion = clasificacion;
        this.fecha = fecha;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
