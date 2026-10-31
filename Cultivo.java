/**
 * Cultivo de la finca, valorado por hectárea.
 */
public record Cultivo(String codigo, String nombre, double hectareas, double costoPorHectarea)
        implements Activo {

    public Cultivo {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (hectareas <= 0) {
            throw new IllegalArgumentException("Las hectáreas deben ser positivas.");
        }
        if (costoPorHectarea < 0) {
            throw new IllegalArgumentException("El costo por hectárea no puede ser negativo.");
        }
    }
}
