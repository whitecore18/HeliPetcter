fun main() {
    // Создание экземпляра класса Helicopter
    val alligator = Helicopter("Alligator", 5000.0, 250.0, 3000.0)
    println("Спроектировали вертолет с названием ${alligator.name}, скоростью полета ${alligator.flightSpeed}, весом ${alligator.takeoffWeight}, высотой полета ${alligator.maxFlightHeight}.")

    // Создание экземпляра класса Pet
    val myPet = Pet(5.5, "Барсик", PetType.CAT)
    println("Домашнее животное: ${myPet.type}, Кличка: ${myPet.nickname}, Вес: ${myPet.weight}")

    // Приведение переменной с плавающей точкой к целочисленному типу
    val floatingPointNumber: Double = 5.87
    val integerNumber: Int = floatingPointNumber.toInt()
    println("Целочисленное значение: $integerNumber")
}