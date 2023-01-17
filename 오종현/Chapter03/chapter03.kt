package chap03.types

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun main(){
    //val은 수정불가능한 타입(flutter에서 final이랑 비슷한 느낌인듯함)
    //var은 수정가능한 타입(flutter에서 기본 값)
    //lateinit(flutter에서 late 이랑 똑같음)
    //lazy(flutter에서 async, await 과 유사하게 사용되는듯?)
    val lazydata: Int by lazy{
        println("특정기능 미리 수행")
        10
    }
    //Unit function. return 없어도 되는 함수(flutter의 void 함수와 유사한 느낌)
    fun unitfunc(): Unit{
        println(10+20)
    }


    /*******************data types*******************/
    //array 타입 & 사용
    val arrayType:Array<Int> = Array(3, {0})
    arrayType[0] = 10
    arrayType.set(2, 30)

    //불변 listOf. add,set 불가능
    var list = listOf<Int>(10, 20, 30)
    //가변 mutableList. add,set 가능
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40) //바로 add가능
    mutableList.set(0, 50) //덮어쓰기

    //불변 mapOf. add,set 불가능
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(map.get("one"))
    //가변 mutableMapOf. add,set 가능
    var mutableMap = mutableMapOf<String, Strinng>(Pair("one", "hello"), Pair("two", "world"))
    mutableMap[3] = "add"
    mutableMap.put("four", "w")
    /*******************************************/


    /******************unique code style*************************/
    var mydata = 10
    when (mydata) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        is String -> println("data is String")
        30, 40 -> println("data is 30 or 40")
        in 1..10 -> println("data is 1~10의 값을 가져요.")
        else -> {
            println("data is not valid data")
        }
    }

    var fordata = arrayOf<Int>(10, 20, 30)
    for(i in 1..10){...} //1부터 10까지 실행
    for(i in 1 until 10){...} //1부터 9까지 실행
    for(i in 2..10 step 2){...} //2부터 10까지 2씩 증가
    for(i in 10 downTo 1){...} //10부터 1까지 1씩 감소
    for(i in data.indices){...} //fordata 길이만큼 실행 0,1,2
    for((index, value) in data.withIndex()){...} //fordata 안의 index,value 사용
    /*******************************************/
}
