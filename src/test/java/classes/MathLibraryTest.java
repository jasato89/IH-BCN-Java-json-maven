package classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest {

    List<Integer> list1 = Arrays.asList(1, 2, 4 ,6 ,7 ,8, 6);
    List<Integer> list2 = Arrays.asList(-1, -2, -4 ,-6 ,-7 ,-8, -6);
    List<Integer> list3 = Arrays.asList(-1, 2, -4 ,6 ,7 ,-8, 6);
    List<Integer> list4 = null;
    List<Integer> list5 = Arrays.asList(1, 2, null, 6,7 ,8, 6);


    @Test
    @DisplayName("Debería sumar números positivos")
    public void mathLibrary_receivesPositiveNumbers_sumOk() {
        assertEquals(34, MathLibrary.add(list1));
    }

    @Test
    @DisplayName("Debería sumar números negativos")
    public void mathLibrary_receivesNegativeNumbers_sumOK() {
        assertEquals(-34, MathLibrary.add(list2));
    }

    @Test
    @DisplayName("Debería sumar mezcla de positivos y negativos")
    public void mathLibrary_recievesMix_sumOK() {
        assertEquals(8, MathLibrary.add(list3));
    }

    @Test
    @DisplayName("Lista de números está vacía, debería devolver un cero")
    public void mathLibrary_receivesNull_resultO() {
        assertEquals(0, MathLibrary.add(list4));
    }

    @Test
    @DisplayName("Lista recibe un null, debería saltarlo")
    public void mathLibrary_receivesOneNull_resultOk() {
        assertEquals(30, MathLibrary.add(list5));
    }


}
