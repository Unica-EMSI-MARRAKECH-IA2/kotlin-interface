package uca.shape

fun main() {
    val monCarré = Carré(Vecteur2D(10.0, 10.0), 50.0)
    println("aire du carré = ${monCarré.aire} et périmètre = ${monCarré.perimetre}")
}