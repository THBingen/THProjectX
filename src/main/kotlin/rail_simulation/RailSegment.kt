package rail_simulation

// Val trainsOnSegment beschreibt Züge und nicht die Kapazität. -> besteht aus einer Liste die die Klasse Train entählt
// Wir können keine Liste aussagen lassen wie viele Elemente sie beinhalten soll. Man kann sie aber abfragen wie viele sie in diesem Moment hat Bsp: 'trainsOnSegment.size'

// private sorgt dafür dass die Variable von außen nicht lesbar und schreibbar ist.
class RailSegment(private val trainCapacity: Int) {
    private val trainsOnSegment = mutableListOf<Train>()


    fun addTrain(train: Train) {

        trainsOnSegment.add(train)
    }


    fun checkCapacity() {

        // Wir vergleichen die Kapazität des Segments mit der Anzahl der Züge die dem Segment zugeordnet werden -> 'size' gibt die Anzahl aus.
        if (trainCapacity < trainsOnSegment.size) {

            for (index in 1..trainsOnSegment.size - trainCapacity) {

                trainsOnSegment[index - 1].delayed = true
            }

        }

    }

    // Verbleibende Kapazität für genau "das Segment"
    fun remainingCapacity(): Int {

        val capacityDiff = trainCapacity - trainsOnSegment.size
        if (capacityDiff <= 0) {
            return 0

        } else {
            return capacityDiff
        }


    }


}