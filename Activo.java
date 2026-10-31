/**
 * Contrato común de todos los activos de la finca.
 * Al ser una interfaz sellada, solo estos tres tipos pueden implementarla.
 */
public sealed interface Activo permits Producto, Cultivo, Animal {

    String codigo();
}
