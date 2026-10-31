import java.util.List;

/**
 * Programa de demostración: valora los activos de una finca y muestra el total.
 */
public class Demo {

    public static void main(String[] args) {

        List<Activo> activos = List.of(
                new Producto("PRD-001", "Saco de urea 50 kg", 32.50, 40),
                new Cultivo("CUL-001", "Cultivo de cacao CCN-51", 3.5, 1800.00),
                new Animal("ANI-001", "Bovino", 420, 1.85),
                new Cultivo("CUL-002", "Cultivo de arroz de Daule", 2.0, 1500.00)
        );

        System.out.println("=== VALORACIÓN DE LA FINCA ===");

        double total = 0;
        for (Activo activo : activos) {
            double valor = Valorador.valorDe(activo);
            total += valor;
            System.out.printf("%-8s %-28s USD %,10.2f%n", activo.codigo(), descripcion(activo), valor);
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("VALOR TOTAL DE LA FINCA: USD %,.2f%n", total);

        System.out.println();
        System.out.println("=== CONVERSIÓN DE UNIDADES ===");
        System.out.printf("10 quintales = %.1f kg%n", UnidadMedida.QUINTAL.aKilos(10));
        System.out.printf("2 toneladas  = %.1f kg%n", UnidadMedida.TONELADA.aKilos(2));
    }

    private static String descripcion(Activo activo) {
        return switch (activo) {
            case Producto p -> p.nombre();
            case Cultivo c -> c.nombre();
            case Animal a -> a.especie();
        };
    }
}
