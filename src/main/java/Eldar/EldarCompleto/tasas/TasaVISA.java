package Eldar.EldarCompleto.tasas;

import java.time.LocalDate;

public class TasaVISA implements Tasas {

    @Override
    public float calcularTasa() {
        return ((float) (LocalDate.now().getYear() % 100) / (float) LocalDate.now().getMonthValue());
    }
}
