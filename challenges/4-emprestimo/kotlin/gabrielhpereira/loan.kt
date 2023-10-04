import java.text.DecimalFormat
import kotlin.math.pow

fun main() {
  val list = readln().split(",").toList()
  println(DecimalFormat("#.##").format(list[0].toDouble() * (1.0 + list[1].toInt() / 100.0).pow(list[2].toInt())))
}