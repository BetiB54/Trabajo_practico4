package trabajodocumentacion;

import java.util.ArrayList;

/**
 * Clase principal del proyecto que permite administrar los
 * objetos de tipo {@link Ciudad} y {@link Provincia}.
 * <p>
 * En el método main se crean instancias de ciudades y provincias,
 * se agregan impuestos y gastos, y se muestran por consola
 * algunos resultados sobre las ciudades que estan en déficit.
 * </p>
 * 
 * @author Betina Barragàn
 * @version 1.0.0
 */

public class Administrador {

    /**
     * Este es el método principal que ejecuta el programa.
     * <p>
     * Crea varias ciudades y provincias, carga sus datos de impuestos y gastos,
     * y muestra en pantalla la cantidad de ciudades en déficit
     * y sus respectivos nombres.
     * </p>
     * 
     * @param args argumentos que se pasan por línea de comandos
     */

    public static void main(String[] args) {

        Ciudad c = new Ciudad("Rauch", 1500, 3);
        c.addImpuestos(1000);
        c.addImpuestos(2000);
        c.addImpuestos(3000);
        c.addGastos(8000);

        Ciudad c1 = new Ciudad("tandil", 1100, 3);
        c1.addImpuestos(100);
        c1.addImpuestos(2000);
        c1.addImpuestos(300);
        c1.addGastos(1000);

        Ciudad c2 = new Ciudad("azul", 1220, 1);
        c2.addImpuestos(100);
        c2.addGastos(200);

        Provincia p = new Provincia("buenos aires", 1000);
        Provincia p1 = new Provincia("cordoba", 1200);
        p.addCiudad(c);
        p.addCiudad(c1);

        System.out.println(p.cantCiudadesEnDeficit());
        System.out.println(p.masMitadCiudadesEnDeficit());
        ArrayList<String> salida = p.nombreCiudadesEnDeficit();
        for (int i = 0; i < salida.size(); i++) {
            System.out.println(salida.get(i));
        }

    }

    /**
     * Valida que una ciudad tenga impuestos cargados correctamente.
     * <p>
     * Si la ciudad es <code>null</code> o su total de impuestos es menor o igual a
     * cero,
     * se lanza una excepción.
     * </p>
     * 
     * @param ciudad objeto {@link Ciudad} a validar
     * @throws IllegalArgumentException si la ciudad es null o no tiene impuestos
     *                                  válidos
     */
    public static void validarImpuestosCiudad(Ciudad ciudad) throws IllegalArgumentException {
        if (ciudad == null) {
            throw new IllegalArgumentException("La ciudad no puede ser null");
        }
        if (ciudad.getTotalImpuesto() <= 0) {
            throw new IllegalArgumentException("La ciudad debe tener impuestos mayores a cero");
        }
    }

}