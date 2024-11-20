package uca.shape

open class Rectangle(
    override var ancrage : Vecteur2D,
    var largeur : Double,
    var longueur : Double
): IShape {
    override val aire: Double
        get() = largeur * longueur
    override val perimetre: Double
        get() = 2 * (largeur + longueur)
}

class Carré(
    override var ancrage : Vecteur2D,
    var côté : Double
) : Rectangle(ancrage, côté, côté) {}