
package empresa;

/**
 *
 * @author Micael
 */
public class Gerencia implements Departamento{

    @Override
    public float calculo(float salario) {
        return salario * 0.06F;
    }
    
}
