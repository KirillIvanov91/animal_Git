open class Animal(
    val name: String = "Неизвестное животное",
    var energy: Int = 10,
    val maxAge: Int = 1,
    var weight: Int = 8
) {
    var currentAge: Int = 0

    var isTooOld = currentAge >= maxAge
        get() {
            return currentAge >= maxAge
        }

    open fun move() {
        energy -= 5
        weight -= 1
        println("$name - передвигается, возраст $currentAge")
        currentAge++

    }

    fun eating() {
        energy += 3
        weight += 1
        currentAge++
        println("$name - кушает, возраст $currentAge")

    }

    fun sleep() {
        energy += 5
        currentAge++
        println("$name - спит, возраст $currentAge")

    }

    open fun reproduction(): Animal {
        name
        maxAge
        energy = 5
        weight = 1
        currentAge = 0
        println(
            "Родилось животное $name" +
                    " энергия $energy максимальный возраст $maxAge" +
                    " вес $weight возраст $currentAge"
        )
        return Animal(name, energy, maxAge, weight)

    }
}