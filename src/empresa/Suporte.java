package empresa;

/**
 *
 * @author Micael
 */
public class Suporte implements Departamento {

    @Override
    public float calculo(float salario) {
        return salario * 0.04F;
    }

}
