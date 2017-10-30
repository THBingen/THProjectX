package rail_simulation

import com.univocity.parsers.common.record.Record
import com.univocity.parsers.csv.CsvParser
import com.univocity.parsers.csv.CsvParserSettings
import com.univocity.parsers.csv.CsvWriter
import com.univocity.parsers.csv.CsvWriterSettings
import java.util.*

fun main(args: Array<String>) {

    scenario()

    
    external(fileName = "TrainSchedule.csv")


    simulateCSV()

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

fun external(fileName: String): MutableList<Train> {
    val trainsOnCSV = mutableListOf<Train>()
    val numberOfSegments = 5

// Einrichten des Parsers
    val settings = CsvParserSettings()
    settings.format.setLineSeparator("\n")
    settings.isHeaderExtractionEnabled = true

    val csvParser = CsvParser(settings)

    val reader = FileAccess().getReader("/" + fileName)

    val allRows: MutableList<Record> = csvParser.parseAllRecords(reader)

    // Abänderung der Input Werte von "String" zu 'Int' zur Weiterbearbeitung
    for (record in allRows) {
        val trainId_String: String = record.values[0]
        val numberOfSegments_String: String = record.values[1]

        val trainId_Int: Int = trainId_String.toInt()
        val numberOfSegments_Int: Int = numberOfSegments_String.toInt()

        trainsOnCSV.add(Train(trainId = trainId_Int, segmentIndex = numberOfSegments_Int))
    }

    val railNetwork = RailNetwork(numberOfSegments)

    railNetwork.runSimulation(trainsOnCSV)

    for (train in trainsOnCSV) {
        val delayMessage: String = if (train.delayed) {
            "is delayed"
        } else {
            "is on time"
        }

        println("Train ${train.trainId} wants to drive on Segment ${train.segmentIndex + 1} and  ${delayMessage}")
    }
    return trainsOnCSV
}

// printResultsToCSV geht den anderen Weg herum: Übergabe von 'Int' zu 'String'
fun printResultsToCSV(results: List<Train>, outputFile: String = "TrainScheduleResults.csv") {


    val writer = FileAccess().getWriter(outputFile)

    val csvWriter = CsvWriter(writer, CsvWriterSettings())


    val trainRows: MutableList<Array<Any>> = mutableListOf()
    val id = "TrainID"
    val delay = "Delayed"
    val row: Array<Any> = arrayOf(id, delay)
    trainRows.add(row)

    for (result in results) {
        val id = result.trainId.toString()
        val delay = result.delayed.toString()
        val row: Array<Any> = arrayOf(id, delay)
        trainRows.add(row)
    }
    csvWriter.writeRowsAndClose(trainRows)
}


fun simulateCSV() {

    val trainsFromCSV: List<Train> = external(fileName = "TrainSchedule.csv")

    printResultsToCSV(results = trainsFromCSV, outputFile = "TrainScheduleResults.csv")
}