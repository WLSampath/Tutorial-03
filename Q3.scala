//Q3)
object Q3{
    def main(args: Array[String])={

    def volume(r:Int):Double=
    {
    var v=4.0/3.0*math.Pi*r*r*r
    return v
    }

    var vol=volume(5)
    println("Volume of sphere = "+vol)
}
}
