<<<<<<< HEAD

// Hätte jedem Zug eine Id gegeben und diese dann in der späteren scenario Funktion abrufen lassen.
// Das mit dem Fahrplan fällt mir jedoch schwer, inwiefern man ausgeben kann wo und wann der Zug fahren soll...

class Trains (val TrainId: MutableList<Int>, val wish: Boolean  ) {
=======
import java.util.Random

class Trains (val TrainId: MutableList<1...12> = mutablelistof(Int), val WantsToDrive: MutableList<>  ){

    var delayed: Boolean = false
    var status: Boolean = Random()


    fun gettingDelayed() {
        this.delayed = true
    }
>>>>>>> af74c89ab3b90fa9a6ae600e5a98716dd9484d63


}




