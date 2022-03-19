class Point(x: Double, y: Double) {

    private var x: Double
    private var y: Double

    init {
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "x: ${x}; y: ${y};"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Point || x != other.x || y != other.y)
            return false

        return true
    }

    fun getSymmetricObject(): Point {
        return Point(x * -1, y * -1)
    }
}