/**
 * Producto de la finca (insumos, fertilizantes, etc.).
 */
public record Producto(String codigo, String nombre, double precioUnitario, int unidades)
        implements Activo {

    public Producto {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo.");
        }
        if (unidades < 0) {
            throw new IllegalArgumentException("Las unidades no pueden ser negativas.");
        }
    }
}
