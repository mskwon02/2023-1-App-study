package chapter04_inheritance

//코틀린에서는 클래스끼리 상속을 허용하지 않는다. 때문에 상속을 위해서는 상위 클래스에서 open 키워드를 붙여주어야한다.
open class SuperClass(name: String){

}
class SubClass(name: String):SuperClass(name) {
    //:SuperClass() 가 상위 클래스를 상속받는다는 의미이다.
}

//오버라이딩으로 상위 클래스의 변수나 함수를 재정의할 수 있다.
open class SuperOverridingClass(){
    open var someData = 10
    open fun someFunction(){
        println("this is superclass")
    }
}
class SuboverridingClass(): SuperOverridingClass(){
    override var someData = 20
    override fun someFunction(){
        println("change to subclass")
    }
}


/*************************************** 
public :  모든 파일, 모든 클래스   에서 접근가능
internal: 같은 모듈, 같은 모듈     에서 접근가능
protected:사용 불가, 상속 관계클래스에서 접근가능
private:  파일 내부, 클래스 내부    에서 접근가능

모듈이란 gradle이나 maven등 같은 빌드 도구안 그니까 프로젝트 단위 내부에서 사용가능
***************************************/

fun main(){
    val obj = SuboverridingClass()
    obj.someFunction()
}
