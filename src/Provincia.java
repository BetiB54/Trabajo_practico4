package trabajodocumentacion;

import java.util.ArrayList;

import proyectojunit.Ciudad;

/**
 * Representa una provincia que agrupa un conjunto de ciudades.
 * <p>
 * Esta clase permite administrar las ciudades pertenecientes a la provincia,
 * verificar cuántas se encuentran en déficit y obtener información
 * sobre ellas en función de la cantidad mínima de habitantes configurada.
 * </p>
 *
 * @author Betina Barragàn
 * @version 1.0.0
 */

public class Provincia {

    /** Nombre de la provincia */
    private String nombre;
    /** Lista de ciudades pertenecientes a la provincia */
    private ArrayList<Ciudad> ciudades;
    /** Cantidad mínima de habitantes requerida para considerar una ciudad */
    private int minHabitantes;

    /**
     * Constructor de la clase Provincia.
     * 
     * @param nombre        nombre de la provincia
     * @param minHabitantes cantidad mínima de habitantes válida para las ciudades
     * @throws IllegalArgumentException si {@code minHabitantes} es negativo
     */

    public Provincia(String nombre, int minHabitantes) {
        if (minHabitantes < 0) {
            throw new IllegalArgumentException("minHabitantes no puede ser negativo");
        }
        this.nombre = nombre;
        this.minHabitantes = minHabitantes;
        this.ciudades = new ArrayList<>();
    }

    /**
     * Devuelve el nombre de la provincia.
     * 
     * @return nombre de la provincia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar un nuevo nombre a la provincia.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad mínima de habitantes requerida para las ciudades.
     * 
     * @return cantidad mínima de habitantes
     */
    public int getMinHabitantes() {
        return minHabitantes;
    }

    /**
     * Asigna la cantidad mínima de habitantes válida para las ciudades de la
     * provincia.
     * 
     * @param minHabitantes nueva cantidad mínima de habitantes
     * @throws IllegalArgumentException si {@code minHabitantes} es negativo
     */
    public void setMinHabitantes(int minHabitantes) {
        if (minHabitantes < 0) {
            throw new IllegalArgumentException("minHabitantes no puede ser negativo");
        }
        this.minHabitantes = minHabitantes;
    }

    /**
     * Agrega una nueva ciudad a la provincia.
     * 
     * @param c objeto {@link Ciudad} a agregar
     * @throws IllegalArgumentException si la ciudad es {@code null}
     */
    public void addCiudad(Ciudad c) {
        if (c == null) {
            throw new IllegalArgumentException("No se puede agregar una ciudad nula");
        }
        this.ciudades.add(c);
    }

    /**
     * Cuenta la cantidad de ciudades que se encuentran en déficit.
     * <p>
     * Solo se consideran aquellas ciudades que no sean nulas, estén en déficit
     * y tengan una cantidad de habitantes igual o superior al mínimo configurado.
     * </p>
     * 
     * @return cantidad de ciudades en déficit
     */
    public int cantCiudadesEnDeficit() {
        int cont = 0;
        for (Ciudad c : this.ciudades) {
            if (c != null && c.enDeficit() && c.getCantidadHabitantes() >= this.minHabitantes) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Determina si más de la mitad de las ciudades de la provincia están en
     * déficit.
     * 
     * @return {@code true} si más de la mitad están en déficit, {@code false} en
     *         caso contrario
     */
    public boolean masMitadCiudadesEnDeficit() {
        double mitad = this.ciudades.size() / 2.0;
        return this.cantCiudadesEnDeficit() > mitad;
    }

    /**
     * Devuelve una lista con los nombres de las ciudades que se encuentran en
     * déficit.
     * <p>
     * Solo se incluyen las ciudades que no son nulas, están en déficit
     * y cumplen con el mínimo de habitantes requerido.
     * </p>
     * 
     * @return lista de nombres de ciudades en déficit
     */
    public ArrayList<String> nombreCiudadesEnDeficit() {
        ArrayList<String> salida = new ArrayList<>();
        for (Ciudad c : this.ciudades) {
            if (c != null && c.enDeficit() && c.getCantidadHabitantes() >= this.minHabitantes) {
                salida.add(c.getNombre());
            }
        }
        return salida;
    }
}
