package empresa;

/**
 *
 * @author Micael
 */
public class Desenvolvimento implements Departamento{

    @Override
    public float calculo(float salario) {
        return salario * 0.05F;
    }
    
}
