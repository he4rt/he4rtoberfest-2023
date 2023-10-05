fun main(args: Array<String>) {
    val value  = args[0].toDouble()
    val cube = Math.pow(value, 3.0)
    println(cube.toInt())
}