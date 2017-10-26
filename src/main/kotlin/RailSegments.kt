
// Hier ähnlich wie bei den Trains, die Segmente bekommen eine ID, es dürfen ja maximal 5 sein
// Als nächstes dürfen ja nur 3 Züge pro Segment fahren, daher dann "TrainCapacity"

import java.util.*
import javax.swing.text.Segment
import kotlin.collections.ArrayList


class RailSegments (var segments: RailSegments = 5)

var Segments : MutableList<Int> = mutableListOf(1,2,3,4,5)
    var TrackCapacity : Int = 3
    var TrainOnSegment1 : Int = 0
    var TrainOnSegment2 : Int = 0
    var TrainOnSegment3 : Int = 0
    var TrainOnSegment4 : Int = 0
    var TrainOnSegment5 : Int = 0



    fun announceSegmentCapacity (SegmentList: ):  List<SegmentId> {
        segmentList =
        for (Segments in SegmentId {

           return TrackCapacity
        }

    return TrackCapacity
    }


fun denyPermission (TrackCapacity : Int): Boolean {
        if (TrainOnSegment1 <=3  ) {
            return true
        }
        return false
    }

fun  countTrainsOnSegments (TrainId : List<Trains> ) : List<Int> {


    for(Trains in TrainId){
        if (Trains.SegmentWish == 1)
            TrainOnSegment1++

        else if (Trains.SegmentWish == 2) {
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

        var SegmentCountList :  MutableList<Int> = mutableListOf(TrainOnSegment1,TrainOnSegment2,TrainOnSegment3,TrainOnSegment4,TrainOnSegment5)
        return SegmentCountList
    }

fun compareCountListWithTrackCapacity () {

}


fun simulateRailTraffic( TrainId : List<Trains>){
    countTrainsOnSegments()
    if (SegmentCountList  < TrackCapacity){{


    }
    }
}


