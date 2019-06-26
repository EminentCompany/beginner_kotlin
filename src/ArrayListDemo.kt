fun main(args:Array<String>) {

    var arraylist = ArrayList<String>()
    arraylist.add("mostafa")
    arraylist.add("kamel")
    arraylist.add("abo kamel")
    arraylist.add("mohamed")

    println("First name:" + arraylist.get(0))
    arraylist.set(0, " Ahmed Ail")

    println(" all element by object")
    for (item in arraylist) {
        println(item)
    }

    println(" all element by index")
    for (index in 0..arraylist.size - 1) {
        println(arraylist.get(index))
    }

    // Search
    if (arraylist.contains("mostafa")) {
        println(" name is found")
    } else {
        println(" name is not found")
    }

}