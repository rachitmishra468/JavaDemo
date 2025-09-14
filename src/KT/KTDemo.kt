package KT

import java.util.Arrays

data class Persone(val name : String){
    fun mark(): String{

        return "Rachit"
    }

}

fun main(args: Array<String>){

    System.out.printf("test")
    println("testuy")

  var tt=  Persone("Rachit").let {
        var t =it.name.length
        println(t)
        println(it.mark())
        t

    }

    println("LET ${tt}")

   var rr = Persone("suresh").run {
         var p = name.length
             "suresh name length is - "+ p

    }

    println(rr)



    var yy =with(Persone("suraj")){
         var p= this.name

        println(p)
        p


    }
    println("with -"+yy)

  var to=  Persone("sachin").apply {
       var t= this.name


    }.also {
        it.name.toString()
    }


    println(to.name)
}