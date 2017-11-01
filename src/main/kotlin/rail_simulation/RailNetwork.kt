package rail_simulation

//Liste segments ist eine Liste von einzelnen Railsegments
//Liste ist eine Reihenfolge von Elementen


class RailNetwork(val numberOfSegments: Int, val trainCapacity: Int) {
    //segments ist eine Liste aus 5 Segmenten mit je einer trainCapacity von max. 3 (aufgerufen durch die Klasse RailSegment)
    val segments = List(numberOfSegments, { RailSegment(trainCapacity) })

    val totalCapacity = numberOfSegments * trainCapacity


    fun runSimulation(trains: List<Train>) {

        for (train in trains) {
            //Sucht sich das richtige Segment indem es den Zug nach seinem zugehörigem Segment fragt (random -> siehe scenario in Main) und fügt diesem Segment anschließend den Zug hinzu
            val targetSegmentForTrain = segments[train.segmentIndex]
            targetSegmentForTrain.addTrain(train)
        }

        for (segment in segments) {
            segment.checkCapacity()
        }
    }

    fun remainingCapacity(): Int {
        var remainingCapacityTotal = 0
        for (segment in segments) {
            remainingCapacityTotal = segment.remainingCapacity() + remainingCapacityTotal


        }
        return remainingCapacityTotal
    }


}