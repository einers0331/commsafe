

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CiudadanoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CiudadanoTest
{
    private Ciudadano ciudadan1;

    

    /**
     * Default constructor for test class CiudadanoTest
     */
    public CiudadanoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        ciudadan1 = new Ciudadano("Juan David", "Porras Gómez", "12345", 12345678, 314392262, "Uis");
        ciudadan1.addPost("hecho de intolerancia");
        ciudadan1.setFoto("/img.png");
        ciudadan1.addPost("robo con arma de fuego");
        ciudadan1.addPost("robo con arma blanca");
        ciudadan1.showPerfil();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
