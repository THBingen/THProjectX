import java.util.

fun main (args: Array<String>) = Unit




fun testScenarioWithInternList() {

    // Creation of sufficient cars for local testing without using CSV input for now
    val Train1: Trains = Trains(TrainId = 1, wannaDrive = true)
    val Train2: Trains = Trains(TrainId = 2, wannaDrive = true)
    val Train3: Trains = Trains(TrainId = 3, wannaDrive = true)
    val Train4: Trains = Trains(TrainId = 4, wannaDrive = true)
    val Train5: Trains = Trains(TrainId = 5, wannaDrive = true)
    val Train6: Trains = Trains(TrainId = 6, wannaDrive = true)
    val Train7: Trains = Trains(TrainId = 7, wannaDrive = true)
    val Train8: Trains = Trains(TrainId = 8, wannaDrive = true)
    val Train9: Trains = Trains(TrainId = 9, wannaDrive = true)
    val Train10: Trains = Trains(TrainId = 10, wannaDrive = true)
    val Train11: Trains = Trains(TrainId = 11, wannaDrive = true)
    val Train12: Trains = Trains(TrainId = 12, wannaDrive = true)


    val testList: List<Trains> = listOf(Train1, Train2, Train3, Train4, Train5, Train6, Train7, Train8, Train9, Train10, Train11, Train12)

}