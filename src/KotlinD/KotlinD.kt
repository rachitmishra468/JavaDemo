package KotlinD

 data class Emp(val ID : Int, val Name : String, val Depatment : String){}

class KotlinD {

     fun main(array: Array<String>){
         val employee = Emp(1, "Rachit", "IT")
         println(employee)
    }



}