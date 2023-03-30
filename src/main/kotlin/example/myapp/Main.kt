package example.myapp

fun buildAquarium() {
    /** instance, mewarisi properti yang dimiliki oleh Aquarium() **/
//    val myAquarium = Aquarium(numberOfFish = 29)
//    myAquarium.printSize()
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}