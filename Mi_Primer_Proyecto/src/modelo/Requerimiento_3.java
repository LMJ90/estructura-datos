/*
* Requerimiento 3 - Obtener Cargo y el máximo de los salarios de los lideres agrupados por Cargo y por medio
* de un HAVING especificar la siguiente condición: MAX(Salario)>700000
*/
package modelo;

/**
 *
 * @author Laura
 */
public class Requerimiento_3 {
    private String cargo;
    private int maxSalario;

    public Requerimiento_3() {
    }

    public Requerimiento_3(String cargo, int maxSalario) {
        this.cargo = cargo;
        this.maxSalario = maxSalario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMaxSalario() {
        return maxSalario;
    }

    public void setMaxSalario(int maxSalario) {
        this.maxSalario = maxSalario;
    }

}
