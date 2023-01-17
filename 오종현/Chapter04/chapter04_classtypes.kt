package chapter04_classtypes


//클래스를 선언하고 클래스의 이름으로 바로 접근하려면 companion object 키워드로 선언해야한다.
//이때 object 클래스는 익명 클래스로 이름이 없으므로 클래스를 선언하면서 동시에 객체를 생성해야한다.
class MyClass{
    companion object{
        var data = 10
        fun someFun(){
            println(data)
        }
    }
}
fun main(){
    MyClass.data = 20
    MyClass.some()
}
