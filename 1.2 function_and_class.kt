fun main(args: Array<String>){

    var myObj = MyFirstClass()  // This is the Object of the MyFirst Class. Hear you can't use "new" Keyword
    myObj.display()    // calling the display Function
    myObj.add(14,6)  // calling the add Function
}

class MyFirstClass{

    // Function
    fun display(){
        var myName:String
        myName = "Google"
        println(myName)
    }

    // Function
    fun add(a: Int,b: Int){
        var sum = a + b;
        println("Sum is $sum");
    }
}
