package Eldar.EldarCompleto.tasas;

import java.time.LocalDate;

public class TasaNARA implements Tasas{

    @Override
    public float calcularTasa() {
            return (float) (LocalDate.now().getDayOfMonth() * 0.5);
    }
}
