package com.example.myapplication

class User {
    var name = "eunji"
    constructor(name: String) {
        this.name = name
    }

    fun someFun() {
        println("name: $name")
    }
}

class User1(name: String, age: Int) {
    var name: String
    var age: Int
    init {
        this.name = name
        this.age = age
        println("i am init")
    }
}

class User2(var name: String, var age: Int) {
    init {
        println("name: $name, age: $age")
    }
}

class User3(var name: String, var age: Int) {
    constructor(name: String, age: Int, count: Int): this(name, age) {
        // statements
    }
    constructor(name: String, age: Int, count: Int, email: String): this(name, age, count) {
        // statements
    }
}

/*** inheritance ***/
open class Super(name: String) {
    open var data = 10
    open fun superFun() {
        println("i am superfun: $data")
    }
}

class Sub(name: String): Super(name) {
    override fun superFun() {
        println("override function")
    }
}

/*** visibility modifier (최상위에서) ***/
/*** public: every file
    internal: same module
    protected: no use
    private: same file ***/

class vis {
    /*** visibility modifier (클래스 멤버에서) ***/
    /*** public: every class
    internal: same module
    protected: on sub class
    private: same class ***/
}

/*** data class ***/
class NonDataClass(val name: String, val email: String, val age: Int)

data class DataClass(val name: String, var email: String, val age: Int)

/*** object class ***/
val objt = object: Super("eunji") {
    override var data = 10
    fun some() {
        println("data: $data")
    }
}

/*** companion class ***/
// no need to demonstrate object
class MyClass {
    companion object {
        var data = 10
        fun some() {
            println(data)
        }
    }
}

fun main() {
    val user = User("kim")  // Kotlin do not use "new" keyword
    user.someFun()

    val user1 = User1("eunji", 21)  // i am init

    val obj = Sub("eunji")
    obj.superFun()

    var non1 = NonDataClass("eunji", ".com", 21)
    var non2 = NonDataClass("eunji", ".com", 21)
    var data1 = DataClass("eunji", ".com", 21)
    var data2 = DataClass("eunji", ".com", 21)
    var isSame = non1.equals(non2)  // false
    var isSameData = data1.equals(data2)  // true (only compare main constructor)

    println(non1.toString())  // not valuable
    println(data1.toString())  // valuable

    MyClass.data = 20
}
