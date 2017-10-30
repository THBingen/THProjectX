package rail_simulation

import org.junit.Assert.*
import org.junit.Test

class TrainTest {

    @Test
    fun trainsAreInitiallyOnTime() {

        val train = Train(1, 1)
        //val delayed = false

        assertEquals(false, train.delayed)
    }

    @Test
    fun getSegmentIndexReturnsCorrectSegment() {

        val train = Train(5, (575))

        assertEquals(575, train.segmentIndex)


    }
}