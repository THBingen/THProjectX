
import java.lang.Math.random


// Hätte jedem Zug eine Id gegeben und diese dann in der späteren scenario Funktion abrufen lassen.
// Das mit dem Fahrplan fällt mir jedoch schwer, inwiefern man ausgeben kann wo und wann der Zug fahren soll...
//




class Trains (val TrainId: MutableList<Int> = MutableList(12, 1), val WantsToDrive: MutableList){

    var delayed: Boolean = false
    var status : Boolean  = random()


    fun gettingDeleyed() {
        this.delayed = true
    }



}




