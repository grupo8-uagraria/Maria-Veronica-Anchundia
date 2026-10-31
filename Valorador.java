/**
 * Calcula el valor económico de cada activo.
 * Como Activo es una interfaz sellada, el switch cubre todos los casos
 * y no necesita una rama por defecto.
 */
public class Valorador {

    public static double valorDe(Activo activo) {
        return switch (activo) {
            case Producto p -> p.precioUnitario() * p.unidades();
            case Cultivo c -> c.hectareas() * c.costoPorHectarea();
            case Animal a -> a.pesoKg() * a.precioPorKg();
        };
    }
}
