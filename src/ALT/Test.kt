package ALT

// Employes(id , name, salary  , department )
//show


//


data class  Employee(val id: Int, val name: String,val  salary : Long ,val  department : String )

fun main() {
   val employee = listOf(Employee(10, "AP" , 10000 ,"IT" ),
       Employee(12, "ER" , 50000 ,"IT" ),
       Employee(13, "AIP" , 60000 ,"HR" ),
       Employee(14, "APO" , 5000 ,"HR" )
       )

    // department , salary
    val salaryby = employee.groupBy { it.department }.mapValues { e->e.value.sumOf { it.salary } }

    salaryby.forEach { (d , total)-> println("$d total salary $total") }
}