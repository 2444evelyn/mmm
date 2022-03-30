fun main(){
    var car = Car("Toyota","baxe X","White",14)
    car.carry(20)
    car.identity("white","Subaru","legacy")
    car.calculateParkingFees(5)
    var bus= Bus("nissan","KDW","blue",24)
    bus.maxTripFare(150.0)
    bus.calculateParkingFees(12)




}
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int) {
        var x = people-capacity
        if(people ==capacity){
            }else println("over capacity by $x people")



    }
    fun identity(color: String, make:String, model: String){
        println("I am $color $make $model")

    }
    open fun calculateParkingFees(hours:Int): Int {
        var parkingFees = 20* hours
        println(parkingFees)
        return parkingFees

    }

}
class Bus( make:String, model:String, color:String,  capacity:Int):Car (make,model,color,capacity){
      fun maxTripFare(fare:Double ):Double{
          var maximumFare = fare *capacity
          println(maximumFare)
          return maximumFare
         }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var product=hours*capacity
        println(product)
        return(product)

    }
}





