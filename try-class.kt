fun <T>printArray(arr: Array<T>) {
    for (n in arr) { println(n) }
}

fun tryVarAndVal() {
    println("tryVarAndVal start")
    // mutable
    var a = 20
    a = a + 30
    // immutable
    val b = 10
    println("a: $a")
    println("b: $b")
    println("tryVarAndVal end")

}

fun tryArray() {
    println("tryArray start")
    var numArray = arrayOf(1, 2, 3)
    println("numArray")
    printArray(numArray)
    numArray[1] = 20
    println("numArray")
    printArray(numArray)
    println("tryArray end")
}

fun tryList() {
    println("tryList start")
    var numList = listOf(1, 2, 3)
    println("numList")
    for (n in numList) { println(n) }
    // listOfはimmutableなリストを返却するため、以下はエラーになる
    // numList.add(4)

    // varで宣言しているので、参照を変更できる
    numList = listOf(10, 20, 30, 40)
    println("numList")
    for (n in numList) { println(n) }

    // 参照先のリストがimmutableなため以下はエラーになる
    // numList[1] = 200

    var mutableNumList = mutableListOf(1, 2, 3)
    println("mutableNumList ")
    for (n in mutableNumList) { println(n) }

    mutableNumList.add(4)
    println("mutableNumList ")
    for (n in mutableNumList) { println(n) }

    mutableNumList[1] = 20
    println("mutableNumList ")
    for (n in mutableNumList) { println(n) }

    println("tryList end")
}

fun createUser(id: String, name: String, country: String, university: String, age: Int): String {
    return "${id}, ${name}, ${country}, ${university}, ${age}"
}

fun tryNamedArgument() {
    val user1 = createUser(
        id = "1",
        name = "Taro",
        country = "Japan",
        university = "A University",
        age = 20
    )

    val user2 = createUser(
        // 部分的に引数名を指定することも可能
        "2",
        "Jiro",
        country = "Japan",
        university = "B University",
        age = 22
    )

    // 引数名を省略しても、引数の順番で指定できる
    val user3 = createUser(
        "3",
        "Saburo",
        "Japan",
        "C University",
        24
    )
    println(user1)
    println(user2)
    println(user3)
}

fun main() {
    tryVarAndVal()
    tryArray()
    tryList()
    tryNamedArgument()
}

// elvis operator
// companion object
// data class
// object
// inline function
// lamda式
// package/import
// Java new features
