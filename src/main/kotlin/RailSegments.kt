
// Hier ähnlich wie bei den Trains, die Segmente bekommen eine ID, es dürfen ja maximal 5 sein
// Als nächstes dürfen ja nur 3 Züge pro Segment fahren, daher dann "TrainCapacity"

import java.util.*
import javax.swing.text.Segment
import kotlin.collections.ArrayList


class RailSegments (val SegmentId: MutableList<Int> = mutableListOf(1,2,3,4,5) )

    var TrainCapacity : Int = 3
    var TrainOnSegment1 : Int = 0
    var TrainOnSegment2 : Int = 0
    var TrainOnSegment3 : Int = 0
    var TrainOnSegment4 : Int = 0
    var TrainOnSegment5 : Int = 0



    fun announceSegmentCapacity (SegmentId: Int): Int {
        for (SegmentId in RailSegments) {

           return TrainCapacity
        }

    return TrainCapacity
    }


fun denyPermission (TrainCapacity : Int): Boolean {
        if (TrainCapacity == 0) {
            return true
        }
        return false
    }

fun countTrainsOnSegments (TrainId : List<Trains> ){


    for(Trains in TrainId){
        when (Trains.SegmentWish == 1)
            TrainOnSegment1++
        else
            if (Trains.SegmentWish == 2) {
                TrainOnSegment2++
            }

        else if (Trains.SegmentWish == 3) {
                TrainOnSegment3++
            }

            else if (Trains.SegmentWish == 4) {
                TrainOnSegment4++
            }
            else if (Trains.SegmentWish == 5) {
                TrainOnSegment5++
            }

        }

        return ArrayList(5,)
    }

fun simulateRailTraffic(){
    countTrainsOnSegments(SegmentWish = List<[SegmentWish: >)
}


