
// Hier ähnlich wie bei den Trains, die Segmente bekommen eine ID, es dürfen ja maximal 5 sein
// Als nächstes dürfen ja nur 3 Züge pro Segment fahren, daher dann "TrainCapacity"

import java.util.^

class RailSegments (val SegmentId : MutableList <1...5> = Mutablelistof (Int) )

    var TrainCapacity : Int = 3

    fun announceCapacity(Trains: List<Trains>): Int {
        var capacityDemand: Int = 0

    return TrainCapacity
    }




        for (train in Trains) {
            if (trains.)
                TrainCapacity = TrainCapacity - 1
        }
        return TrainCapacity
    }


    fun denyPermission (TrainCa): Boolean {
        if (capacity < demand) {
            return true
        }
        return false
    }
