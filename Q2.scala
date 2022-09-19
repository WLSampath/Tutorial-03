//Q2)
object Q2{
     def main(args: Array[String])={

    def converter(c:Int):Double=
    {
    var fahrenheit=c*1.800+32.00
        return fahrenheit
    }

    var temperature=converter(35)
    println("35C temperature  = "+temperature+"F" )
    }
}