fun main() {
    val point = Point(2.3, 4.4)
    val point2 = Point(2.3, 4.5)

    println(point.toString())
    println(point == point2)
    println(point.getSymmetricObject())

    val audi = CarFactory().create("Audi")
    val maserati = CarFactory().create("Maserati")

    val boeing737 = AircraftFactory().create("Boeing737")
    val unknownBoeing = AircraftFactory().create("Boeing700")

    audi?.drive()
    maserati?.drive()
    boeing737?.fly()
    unknownBoeing?.fly()
}