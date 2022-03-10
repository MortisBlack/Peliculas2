package urrego.jesus.peliculas

import java.math.BigInteger

/*
    Con solo poner los atributos dentro de los parentesis, kotlin genera
    tdo el codigo necesario de una clase negocio
 */
data class Pelicula(val id: Int, var name: String, var year: String, var description: String, var duration: String, var img: Int) {
}