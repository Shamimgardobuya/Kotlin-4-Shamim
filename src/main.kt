fun main(){
    var names = arrayOf("Sylvia","Jane","Christine","Charity")
    println(names.contentToString())


 //  var cities = arrayOf("harare","mumbai","dodoma","jakarta")
 //  println(cities.contentToString().capitalize())

places()
    three()
 //var boys = arrayOf("Trevah","James","Tom",)
    man("James","Trevah","Tom")


    }






fun people(names:Array<String>){
    println(names.contentToString())


}
fun places() {
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { places ->
        println(places.capitalize())

    }
}
fun three(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    println(numbers[11])
    println(numbers.sortedArray().contentToString())
}
fun man(x:String,y:String,z:String):String{
    var boys ="$x $y $z"
    println(boys)
    return boys
}










