package uca.shape

fun main() {
    var monCarre = Carre(Vecteur2D(10.0, 10.0), 50.0)
    println("aire du carré = ${monCarre.aire} et périmètre = ${monCarre.perimetre}")
    monCarre.cote = 12.0
    println("aire du carré = ${monCarre.aire} et périmètre = ${monCarre.perimetre}")
}