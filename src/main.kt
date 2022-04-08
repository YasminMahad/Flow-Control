fun main() {
    oddNumbers(4)
    var totalSum = arrayOfNums(arrayOf("Mohammed", "Sara"))
    println(totalSum)
    robot(3)
    robot(17)
    multiple()


}

fun oddNumbers(digits:Int){
    for (digits in 1..100) {
        if (digits %2 != 0) {
            println(digits )
        }
    }

}

fun arrayOfNums(names:Array<String>):Int{
    var sum = 0
    names.forEach { char ->
        if (char.length >5){
            sum ++
        }
    }
    return sum
}

fun robot(guest:Int) {
    if (guest < 6){
        println("Glass of milk")
    }
    else if (guest >6 && guest < 15  ){
        println("Bottle of Fanta Orange")
    }
    else {
        println("Bottle of Coca Cola")
    }
}

fun multiple(){
    for (numbers in 1..100)
        if (numbers %3 ==0 && numbers%5 ==0){
            println("FizzBuzz")
        }
    else if(numbers%3 ==0){
        println("Fizz")
    }
    else if (numbers%5 ==0){
        println("Buzz")
    }
    else {
        println(numbers)
    }
}