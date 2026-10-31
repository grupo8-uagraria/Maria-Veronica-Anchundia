/**
 * Unidades de peso con su factor de conversión a kilogramos.
 */
public enum UnidadMedida {

    KILOGRAMO("kg", 1.0),
    QUINTAL("qq", 45.36),
    TONELADA("t", 1000.0);

    private final String simbolo;
    private final double factorAKilos;

    UnidadMedida(String simbolo, double factorAKilos) {
        this.simbolo = simbolo;
        this.factorAKilos = factorAKilos;
    }

    public String simbolo() {
        return simbolo;
    }

    public double factorAKilos() {
        return factorAKilos;
    }

    /** Convierte una cantidad expresada en esta unidad a kilogramos. */
    public double aKilos(double cantidad) {
        return cantidad * factorAKilos;
    }
}
