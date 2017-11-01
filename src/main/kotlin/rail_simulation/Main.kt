package rail_simulation

import com.univocity.parsers.common.record.Record
import com.univocity.parsers.csv.CsvParser
import com.univocity.parsers.csv.CsvParserSettings
import com.univocity.parsers.csv.CsvWriter
import com.univocity.parsers.csv.CsvWriterSettings
import java.util.*

fun main(args: Array<String>) {

    scenario()
    

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


    val railNetwork = RailNetwork(numberOfSegments, trainCapacity = 3)

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
    var numberOfSegments = 0
    var trainCapacity = 0

// Einrichten des Parsers
    val settings = CsvParserSettings()
    settings.format.setLineSeparator("\n")
    settings.isHeaderExtractionEnabled = false

    val csvParser = CsvParser(settings)

    val reader = FileAccess().getReader("/" + fileName)

    val allRows: MutableList<Record> = csvParser.parseAllRecords(reader)

    // lesen der Werte aus der CSV für jede Zeile
    for (record in allRows) {
        // train_Id und numberOfSegments wurden ersetzt durch column
        // sinnvollere Benennung da wir nur noch eine Zeile mehr in unserer CSV nehmen; Segment Anzahl und die Kapazität
        val column1_String: String = record.values[0]
        val column2_String: String = record.values[1]

        // Wenn die Anzahl der Segmente 0 ist, dann wandle mir den Wert aus der jeweiligen Spalte zu einem Int
        if (numberOfSegments == 0) {

            numberOfSegments = column1_String.toInt()

            trainCapacity = column2_String.toInt()

            //dient nur zum Test ob er auch die richtigen zeilen liest
            println("number of segments: $numberOfSegments, train capacity: $trainCapacity")

        } else {

            val trainId_Int: Int = column1_String.toInt()
            val segmentForTrain_Int: Int = column2_String.toInt()

            trainsOnCSV.add(Train(trainId = trainId_Int, segmentIndex = segmentForTrain_Int))
        }

    }

    val railNetwork = RailNetwork(numberOfSegments, trainCapacity)

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