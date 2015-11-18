fun main(args: Array<String>) {

    val list1 = listOf(1,2,3)

    val sum1 = Sum.calculate(list1)

    val list2 = listOf(5)

    val sum2 = Sum.calculate(list2)

    val list3 = listOf<Int>()

    val sum3 = Sum.calculate(list3)

    println(sum1)
    println(sum2)
    println(sum3)

}