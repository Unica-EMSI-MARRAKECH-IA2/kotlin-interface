import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import uca.shape.Rectangle
import uca.shape.Vecteur2D
import kotlin.random.Random

class RectangleTest {

    var pt1 = Vecteur2D(10.0, 10.0)
    var pt2 = Vecteur2D(10.0, 15.0)
    var longueur = 50.0
    var largeur = 20.0
    var rec1 = Rectangle(pt1, largeur, longueur)

    @BeforeEach
    fun setUp() {
        longueur = Random.nextDouble(-10.0, 10.0)
        largeur = Random.nextDouble(-10.0, 10.0)
        val x = Random.nextDouble(-10.0, 10.0)
        val y = Random.nextDouble(-10.0, 10.0)
        pt1 = Vecteur2D(x, y)
        rec1 = Rectangle(pt1, largeur, longueur)
    }

    @Test
    fun getAire() {
        val assumedArea = longueur * largeur
        assert(rec1.aire == assumedArea) {
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
        assertEquals(rec1.largeur, largeur, 1e-4)
    }

    @Test
    fun getLongueur() {
        assertEquals(rec1.longueur, longueur, 1e-4)
    }
}