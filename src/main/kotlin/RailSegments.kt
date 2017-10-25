
// Hier ähnlich wie bei den Trains, die Segmente bekommen eine ID, es dürfen ja maximal 5 sein
// Als nächstes dürfen ja nur 3 Züge pro Segment fahren, daher dann "TrainCapacity"

<<<<<<< HEAD
class RailSegments (val SegmentId: MutableList<Int>, val TrainCapacity: MutableList<Trains>) {
=======
class RailSegments (val SegmentId: MutableList<1...5> = mutablelistof (Int), val TrainCapacity: Int = 3) {

    fun announceCapacity(Trains: List<Trains>): Int {
        var capacityDemand: Int = 0

        for (train in trains) {
            if (train.wannaDrive)
                capacityDemand = capacityDemand + 1
        }
        return capacityDemand
    }


    fun checkForTrafficJam(demand: Int): Boolean {
        if (capacity < demand) {
            return true
        }
        return false
    }
>>>>>>> af74c89ab3b90fa9a6ae600e5a98716dd9484d63
}