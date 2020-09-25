package empresa;

/**
 *
 * @author Micael
 */
public class Demais implements Departamento {

    @Override
    public float calculo(float salario) {
        return salario * 0.03F;
    }

}
