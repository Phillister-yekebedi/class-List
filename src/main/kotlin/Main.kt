fun main() {
    numberInAscendingOrder()
    println(allNames("Wycliffe","Yekebedi", "Myles").contentToString())
    var human = listOf(
        Humans("John", 32,3, 60.5),
        Humans("Paul",20,3, 50.0),
        Humans("Dosantos",48,65,78.9)
        )
    var sortedHumans = human.sortedByDescending { it.age }
    println(sortedHumans)

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

fun numberInAscendingOrder(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    val number = numbers[1]+ numbers[5]
    println(number)

    val index = numbers.indexOf(158)
    println(index)

    val sortedNumbers = numbers.sort()
    println(sortedNumbers)


}

//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
//Sort the list in order of descending age (2 points)
data class Humans(val name: String, val age: Int, val height: Int, val weight: Double){

}

//3. Create a function that takes in 3 names and returns a string array containing all 3 names.
fun allNames(name1:String, name2: String , name3: String):Array<String>{
    val names = arrayOf(name1,name2,name3)
    return names

}

//4. Write a function that takes in a list of Car objects each with a registration and mileage
//attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class Car (val regestration: String, val mileage): Int{
    fun mileage(cars :List<Car>): Int{
        var total = car.fold(0.0){ acc, car ->+car.mileage}
    }


}



