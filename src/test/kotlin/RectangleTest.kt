import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import uca.shape.Rectangle
import uca.shape.Vecteur2D

class RectangleTest {

    var pt1 = Vecteur2D(10.0, 10.0)
    var pt2 = Vecteur2D(10.0, 15.0)
    var rec1 = Rectangle(pt1, 50.0, 20.0)

    @BeforeEach
    fun setUp() {
        pt1 = Vecteur2D(10.0, 10.0)
        rec1 = Rectangle(pt1, 50.0, 20.0)
    }

    @Test
    fun getAire() {
        assert(rec1.aire == 1000.0) {
            println("Erreur dans le calul aire")
        }
    }

    @Test
    fun getPerimetre() {
        with(rec1) {
            var per : Double = longueur + largeur
            per *= 2
            assertEquals(perimetre, per, 1e-7,  "Erreur dans le calul perimetre")
        }
    }

    @Test
    fun getAncrage() {
        assert(rec1.ancrage == pt1) {
            println("Erreur dans la lecture du point ancrage")
        }
        rec1.ancrage = pt2
        assert(rec1.ancrage == pt2) {
            println("Erreur dans la lecture du point ancrage")
        }
    }

    @Test
    fun getLargeur() {
        assertEquals(rec1.largeur, 50.0, 1e-4)
    }

    @Test
    fun getLongueur() {
        assertEquals(rec1.longueur, 20.0, 1e-4)
    }

}