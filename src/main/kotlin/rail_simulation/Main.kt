package rail_simulation

import java.util.* //Strg B zum Aufruf

fun main(args: Array<String>) {

    scenario()


}

fun scenario() {
    val random = Random()
    val trains = mutableListOf<Train>()
    val numberOfSegments = 5
    for (trainId in 1..12) {
        //erspart mir jeden Train einzeln aufzuschreiben

        val train = Train(trainId, random.nextInt(numberOfSegments))  //random ist eine Fkt die über java.util.random importiert wird.
        // Parameter von numberOfSegments heist:"bound": steht dabei für die maximale Anzahl, also zwischen 0 und 4 in unserem Bsp. 0 wird mitgezählt -> für Segmente

        trains.add(train)  // Füge der Liste trains unseren oben erzeugten train hinzu
    }


    val railNetwork = RailNetwork(numberOfSegments)

    railNetwork.runSimulation(trains)

    for (train in trains) {
        val delayMessage: String = if (train.delayed) {
            "is delayed"
        } else {
            "is on time"
        }

        println("Train ${train.trainId} wants to drive on Segment ${train.segmentIndex + 1} and  ${delayMessage}")
    }
}

fun external() {
    val trains = mutableListOf<Train>()
    val numberOfSegments = 5


// CSV Dateien einlesen für TrainId und Segments -> fehlt hier noch
// Liste aus Trains muss gebaut werden
    val railNetwork = RailNetwork(numberOfSegments)

    railNetwork.runSimulation(trains)

    for (train in trains) {
        val delayMessage: String = if (train.delayed) {
            "is delayed"
        } else {
            "is on time"
        }

        println("Train ${train.trainId} wants to drive on Segment ${train.segmentIndex + 1} and  ${delayMessage}")
    }
}