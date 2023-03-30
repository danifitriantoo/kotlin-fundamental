package example.myapp

fun buildAquarium() {
    /** instance, mewarisi properti yang dimiliki oleh Aquarium() **/
    val myAquarium = Aquarium()
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}