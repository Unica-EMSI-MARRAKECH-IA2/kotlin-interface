package uca.shape

import kotlin.time.measureTimedValue

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

class Carre(
    override var ancrage : Vecteur2D,
    cote : Double
) : Rectangle(ancrage, cote, cote) {
    var cote: Double
    get() {
        return largeur
    }
    set(value) {
        largeur = value
        longueur = value
    }
}