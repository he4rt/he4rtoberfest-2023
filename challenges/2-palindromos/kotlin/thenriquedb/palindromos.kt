fun main(args: Array<String>) {
    if(args.isEmpty()) {
        println("Error")
        return
    }

    val value = args[0].lowercase()

    println(value.equals(value.reversed()))
}
