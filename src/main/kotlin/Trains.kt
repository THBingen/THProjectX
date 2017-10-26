
import java.lang.Math.random
import kotlin.reflect.KProperty


// Hätte jedem Zug eine Id gegeben und diese dann in der späteren scenario Funktion abrufen lassen.
// Das mit dem Fahrplan fällt mir jedoch schwer, inwiefern man ausgeben kann wo und wann der Zug fahren soll...
//




class Trains (var TrainId :Int, var SegmentWish : Int)

    var drivePermission : Boolean = true
    //var announcedSegment : Int = 0


    fun PermissiongetCanceled() {
        drivePermission = false
    }


   /* fun announceSegment() {
        var announcedSegment

        announcedSegment  =

        return announcedSegment
    }*/





