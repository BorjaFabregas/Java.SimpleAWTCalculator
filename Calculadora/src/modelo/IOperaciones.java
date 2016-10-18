package modelo;
/**
 *
 * @author Fabregas
 */
public interface IOperaciones {

    public abstract float suma(float a, float b);

    public abstract float resta(float a, float b);

    public abstract float multiplicacion(float a, float b);

    public abstract float division(float a, float b) throws Exception;
}
