class NatureReserve {

    val zoo: MutableList<Animal> = mutableListOf(Bird(),Animal())
    val countIteration:Int = 5

    fun lifeCycle(){
        for (count in 0.. countIteration) {
            if (zoo.isEmpty()) {
                println("Заповедник пуст")
                return
            } else {
                for (animal in zoo.indices) {
                    when ((1..4).random()) {
                        1 -> zoo[animal].move()
                        2 -> zoo[animal].eating()
                        3 -> zoo[animal].sleep()
                        4 -> zoo.add(zoo[animal].reproduction())
                    }

                }
            }
            val iteration = zoo.iterator()
            while(iteration.hasNext()){
                var item = iteration.next()

                if (item.isTooOld){

                    iteration.remove()
                    println("${item.name} возраст ${item.currentAge} >= ${item.maxAge} удалено из списка")
                }

            }
        }
        println("В списке ${zoo.size} животных")
    }

}