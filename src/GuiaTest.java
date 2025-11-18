import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuiaTest {
    static Guia guia1;

    @BeforeAll
    static void iniciar(){
        guia1 = new Guia("Pepito",1235643,4);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setNombre() {
        guia1.setNombre("Pepe");
        assertEquals(guia1.getNombre(),"Pepe");
    }
}