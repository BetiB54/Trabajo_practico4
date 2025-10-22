package trabajodocumentacion;


/**
 * Representa una ciudad con información sobre su nombre, cantidad de habitantes,
 * impuestos recaudados y gastos.
 * <p>
 * La clase permite calcular el resultado económico de la ciudad (superávit o déficit)
 * en base a sus ingresos por impuestos y sus gastos.
 * </p>
 * 
 * @author Betina Barragàn
 * @version 1.0.0
 */
public class Ciudad {
    
     /** Nombre de la ciudad */
    private String nombre;
    /** Cantidad de habitantes de la ciudad */
    private int cantidadHabitantes;
    /** Arreglo que almacena los valores de impuestos registrados */
    private double[] impuestos;
    /** Total de gastos de la ciudad */
    private double gastos;
    /** Contador de impuestos cargados en el arreglo */
    private int contImpuestos;


    /**
     * Constructor de la clase Ciudad.
     * 
     * @param nombre nombre de la ciudad
     * @param cantidadHabitantes cantidad de habitantes
     * @param cantImpuestos cantidad de impuestos que se podrán registrar
     */
    public Ciudad(String nombre, int cantidadHabitantes, int cantImpuestos) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.gastos = 0;
        this.impuestos = new double[cantImpuestos];
        this.contImpuestos = 0;
        
    }


     /**
     * Devuelve el nombre de la ciudad.
     * 
     * @return nombre de la ciudad
     */
    public String getNombre() {
        return nombre;
    }


    
    /**
     * Permite asignar  un nuevo nombre a la ciudad.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Devuelve la cantidad de habitantes de la ciudad.
     * 
     * @return cantidad de habitantes
     */
    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }


    
    /**
     * Asigna la cantidad de habitantes de la ciudad.
     * 
     * @param cantidadHabitantes nueva cantidad de habitantes
     */
    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }


    
   /**
     * Devuelve el contador de impuestos actualmente cargados.
     * 
     * @return cantidad de impuestos registrados
     */
    public int getContImpuestos() {
    return contImpuestos;
    }

    
    /**
     * Devuelve el total de gastos de la ciudad.
     * 
     * @return total de gastos
     */
    public double getGastos() {
        return gastos;
    }

    
    /**
     * Asigna el valor total de gastos de la ciudad.
     * 
     * @param gastos nuevo valor de gastos
     */
    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
  
     /**
     * Agrega un nuevo impuesto al arreglo de impuestos de la ciudad.
     * 
     * @param impuesto valor del impuesto a agregar
     * @throws IllegalArgumentException si el valor del impuesto es negativo
     */
   public void addImpuestos(double impuesto){
        if(impuesto < 0){
            throw new IllegalArgumentException("El impuesto no puede ser negativo");
        }
        if(contImpuestos < this.impuestos.length){
            this.impuestos[contImpuestos] = impuesto;
            contImpuestos++;
        }
    }
     

    /**
     * Suma un nuevo valor a los gastos totales de la ciudad.
     * 
     * @param valor valor del gasto a agregar
     */
    public void addGastos(double valor){
        this.gastos =+ valor;
    }
    
    /**
     * Calcula el total de impuestos registrados en la ciudad.
     * 
     * @return suma total de impuestos
     */
    public double getTotalImpuesto(){
        double total = 0;
       for(int i = 0; i <this.impuestos.length; i++) {
           
          total += this.impuestos[i];
       }
       return total;
    }
    
    /**
     * Calcula el resultado económico de la ciudad.
     * <p>
     * El resultado se obtiene restando los gastos del total de impuestos.
     * Si el resultado es negativo, la ciudad está en déficit.
     * </p>
     * 
     * @return resultado económico (positivo o negativo)
     */
    public double getResultado(){
      return this.getTotalImpuesto() - this.getGastos();
      
        
    }

    
/**
     * Determina si la ciudad se encuentra en déficit económico.
     * 
     * @return {@code true} si el resultado es negativo, {@code false} en caso contrario
     */
    public boolean enDeficit(){
      return this.getResultado() < 0;
       
    }
}
