import kotlin.math.min

fun main() {
	val hourModifier = (60*60)
	val minuteModifier = (60)
    val setOneHour = readln().toInt() * hourModifier
    val setOneMinute = readln().toInt() * minuteModifier
    val setOneSecond = readln().toInt()
    val setTwoHour = readln().toInt() * hourModifier
    val setTwoMinute = readln().toInt() * minuteModifier
    val setTwoSecond = readln().toInt()
	val firstSetTotal = (setOneHour + setOneMinute + setOneSecond)
	val secondSetTotal = (setTwoHour + setTwoMinute + setTwoSecond)
	println(secondSetTotal - firstSetTotal)
}