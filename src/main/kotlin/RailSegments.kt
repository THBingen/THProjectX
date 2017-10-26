
// Hier ähnlich wie bei den Trains, die Segmente bekommen eine ID, es dürfen ja maximal 5 sein
// Als nächstes dürfen ja nur 3 Züge pro Segment fahren, daher dann "TrainCapacity"

import java.util.^


class RailSegments (val SegmentId :  )

    var TrainCapacity : Int = 3

    fun announceCapacity(SegmentId: List<RailSegments>): Int {
        var capacityDemand: Int = 0

    return TrainCapacity
    }






    fun denyPermission (TrainCa): Boolean {
        if (TrainCapacity >= 1) {
            return true
        }
        return false
    }
