import java.time.LocalDate
import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return (LocalDate.of(this.year, this.month, this.dayOfMonth).toEpochDay() - LocalDate.of(other.year, other.month, other.dayOfMonth).toEpochDay()).toInt()
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
