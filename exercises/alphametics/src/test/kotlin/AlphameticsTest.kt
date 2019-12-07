import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AlphameticsTest {

    @Test
    fun `puzzle with three letters`() {
        assertEquals(
                mapOf("I" to 1, "B" to 9, "L" to 0),
                Alphametics.solve("I + BB = ILL"))
    }

    @Test
    fun `solution must have unique value for each letter`() {
        assertNull(Alphametics.solve("A == B"))
    }

    @Test
    fun `leading zero solution is invalid`() {
        assertNull(Alphametics.solve("ACA + DD == BD"))
    }

    @Test
    fun `puzzle with two digits final carry`() {
        assertEquals(
                mapOf("A" to 9, "B" to 1, "C" to 0),
                Alphametics.solve("A + A + A + A + A + A + A + A + A + A + A + B == BCC"))
    }

    @Test
    fun `puzzle with four letters`() {
        assertEquals(
                mapOf("A" to 9, "S" to 2, "M" to 1, "O" to 0),
                Alphametics.solve("AS + A == MOM"))
    }

    @Test
    fun `puzzle with six letters`() {
        assertEquals(
                mapOf("N" to 7, "O" to 4, "T" to 9, "L" to 1, "A" to 0, "E" to 2),
                Alphametics.solve("NO + NO + TOO == LATE"))
    }

    @Test
    fun `puzzle with seven letters`() {
        assertEquals(
                mapOf("E" to 4, "G" to 2, "H" to 5, "I" to 0, "L" to 1, "S" to 9, "T" to 7),
                Alphametics.solve("HE + SEES + THE == LIGHT"))
    }

    @Test
    fun `puzzle with eight letters`() {
        assertEquals(
                mapOf("S" to 9, "E" to 5, "N" to 6, "D" to 7, "M" to 1, "O" to 0, "R" to 8, "Y" to 2),
                Alphametics.solve("SEND + MORE == MONEY"))
    }

    @Test
    fun `puzzle with ten letters`() {
        assertEquals(
                mapOf("A" to 5, "D" to 3, "E" to 4, "F" to 7, "G" to 8, "N" to 0, "O" to 2, "R" to 1, "S" to 6, "T" to 9),
                Alphametics.solve("AND + A + STRONG + OFFENSE + AS + A + GOOD == DEFENSE"))
    }

    @Test
    fun `puzzle with ten letters and 199 addends`() {
        assertEquals(
                mapOf("A" to 1, "E" to 0, "F" to 5, "H" to 8, "I" to 7, "L" to 2, "O" to 6, "R" to 3, "S" to 4, "T" to 9),
                Alphametics.solve("THIS + A + FIRE + THEREFORE + FOR + ALL + HISTORIES + I + TELL + A + TALE + " +
                        "THAT + FALSIFIES + ITS + TITLE + TIS + A + LIE + THE + TALE + OF + THE + LAST + FIRE + " +
                        "HORSES + LATE + AFTER + THE + FIRST + FATHERS + FORESEE + THE + HORRORS + THE + LAST + " +
                        "FREE + TROLL + TERRIFIES + THE + HORSES + OF + FIRE + THE + TROLL + RESTS + AT + THE + " +
                        "HOLE + OF + LOSSES + IT + IS + THERE + THAT + SHE + STORES + ROLES + OF + LEATHERS + " +
                        "AFTER + SHE + SATISFIES + HER + HATE + OFF + THOSE + FEARS + A + TASTE + RISES + AS + " +
                        "SHE + HEARS + THE + LEAST + FAR + HORSE + THOSE + FAST + HORSES + THAT + FIRST + HEAR + " +
                        "THE + TROLL + FLEE + OFF + TO + THE + FOREST + THE + HORSES + THAT + ALERTS + RAISE + " +
                        "THE + STARES + OF + THE + OTHERS + AS + THE + TROLL + ASSAILS + AT + THE + TOTAL + " +
                        "SHIFT + HER + TEETH + TEAR + HOOF + OFF + TORSO + AS + THE + LAST + HORSE + FORFEITS + " +
                        "ITS + LIFE + THE + FIRST + FATHERS + HEAR + OF + THE + HORRORS + THEIR + FEARS + THAT + " +
                        "THE + FIRES + FOR + THEIR + FEASTS + ARREST + AS + THE + FIRST + FATHERS + RESETTLE + " +
                        "THE + LAST + OF + THE + FIRE + HORSES + THE + LAST + TROLL + HARASSES + THE + FOREST + " +
                        "HEART + FREE + AT + LAST + OF + THE + LAST + TROLL + ALL + OFFER + THEIR + FIRE + HEAT + " +
                        "TO + THE + ASSISTERS + FAR + OFF + THE + TROLL + FASTS + ITS + LIFE + SHORTER + AS + " +
                        "STARS + RISE + THE + HORSES + REST + SAFE + AFTER + ALL + SHARE + HOT + FISH + AS + " +
                        "THEIR + AFFILIATES + TAILOR + A + ROOFS + FOR + THEIR + SAFE == FORTRESSES"))
    }

}
