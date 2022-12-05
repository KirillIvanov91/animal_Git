class Bird(name: String = "Птичка", energy: Int = 3, maxAge: Int = 1, weight: Int = 1) :
    Animal(name, energy, maxAge, weight) {
    override fun move() {
        super.move()
        println("$name летит, возраст $currentAge")
    }

    override fun reproduction(): Bird {

        super.reproduction()
        return Bird(name, energy, maxAge, weight)
    }

fun birdAtack(){
}
}