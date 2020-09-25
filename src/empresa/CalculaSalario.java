
package empresa;

/**
 *
 * @author Micael
 */
public class CalculaSalario {
    
    public float calcula(Float salario, Departamento departamento){
        
        return salario + departamento.calculo(salario);
            
    }
}
