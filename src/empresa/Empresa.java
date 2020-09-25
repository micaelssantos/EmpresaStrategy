
package empresa;

/**
 *
 * @author Micael
 */
public class Empresa {


    public static void main(String[] args) {
       
        Departamento dp = new Gerencia();
        CalculaSalario cs = new CalculaSalario();
        float salario = 1000;
        System.out.println(cs.calcula(salario, dp));
        
    }
    
}
