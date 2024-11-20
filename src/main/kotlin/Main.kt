package uca.shape

fun main() {
    val monCarre = Carré(Vecteur2D(10.0, 10.0), 50.0)
    println("aire du carré = ${monCarre.aire} et périmètre = ${monCarre.perimetre}")
}