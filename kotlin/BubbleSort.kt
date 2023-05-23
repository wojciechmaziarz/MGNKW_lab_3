fun main() {
    val tab = arrayOf(7, 2, 10, 3, 5, 8)

    println("Tablica przed sortowaniem:")
    printArray(tab)

    bubbleSort(tab)

    println("Tabica po sortowaniu:")
    printArray(tab)
}

fun bubbleSort(tab: Array<Int>) {
    var n = tab.size
    var swapped: Boolean

    do {
        swapped = false
        for (i in 1 until n) {
            if (tab[i - 1] > tab[i]) {
                val temp = tab[i - 1]
                tab[i - 1] = tab[i]
                tab[i] = temp
                swapped = true
            }
        }
        n--
    } while (swapped)
}

fun printArray(tab: Array<Int>) {
    for (num in tab) {
        print("$num ")
    }
    println()
}