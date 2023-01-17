package chapter04

class User(name: String, count: Int){
}
//init을 하고 싶으면 구분해서 해야합니다. (flutter의 void initState(){super.initState();} 부분)
class UserWithInit(name: String, count: Int){
    init{
        //이 init부분에서만 생성자의 변수를 사용할 수 있다(name, count)
        println("Here is init state")
    }
}
//생성자의 변수를 전체부분에서 사용하는 방법
class UserWithInitAndGlobal(name: String, count: Int){
    var globalName: String
    var globalCount: Int
    init{
        this.globalName = name
        this.globalCount = count
    }
    
    fun someFunction(){
        println("name : $globalName, count : $globalCount")
    }
}
//그러나 이때 주성생자와 보조생성자를 같이 사용하면 오류가 발생하므로 "반드시" 보조생성자에서 주생성자를 호출해야한다
class UsingConstructor(name: String){
    constructor(name: String, count: Int):this(name) {
        //this(name) 을 통해서 주생성자의 (name: String) 호출
    }
    constructor(name: String, count: Int, email: String):this(name, count){
        //위 constructor의 (name, count) 호출
    }
}
//또는 그냥 간편하게 주 생성자에 var이나 val을 붙여서 멤버 변수로 만들 수 있다.
class EasyInit(val name: String, val count: Int){
    fun someFun(){
        println("name: $name, count: $count")
    }
}

fun main(){
    val user = UserWithInitAndGlobal("jonghyun", 10)
}
