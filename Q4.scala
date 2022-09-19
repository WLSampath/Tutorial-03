//Q4)
object Q4{
        def main(args: Array[String])={
        def totalcost(C:Int)={
        var cost=0.00
        if(C<=50)
        {
        cost=(C*24.95*(60/100))+(3*C)
        }
else
        {
        cost=C*24.95*60/100+(3*50)+(0.75*(C-50))
        }
        cost
        }
        var tCost=totalcost(60)
        println("Total cost Rs:"+tCost)
    }
}