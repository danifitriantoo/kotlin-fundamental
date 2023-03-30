package example.myapp

//abstract class AquariumFish : FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color="gold"

}

class Shark: FishAction, FishColor {
    override val color= "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction,
        FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}



