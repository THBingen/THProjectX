import org.junit.Assert.*
import org.junit.Test

class RailSegmentsKtTest ()



@Test
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
        return SegmentCountList     }

