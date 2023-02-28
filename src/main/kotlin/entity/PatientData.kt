/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entity

/**
 * Module with all data for the [Patient] entity.
 */
object PatientData {

    /** The identifier of the patient given its [code]. */
    data class TaxCode(val code: String)

    /** The [value] of [Height] of the patient given its measure [unit]. */
    data class Height(val value: Double, val unit: LengthUnit)

    /** The [value] of [Weight] of the patient given its measure [unit]. */
    data class Weight(val value: Double, val unit: MassUnit)

    /** The length measure unit. */
    enum class LengthUnit {
        CENTIMETER, METER
    }

    /** The mass measure unit. */
    enum class MassUnit {
        KILOGRAM, GRAM
    }

    /** The blood groups enum. */
    enum class BloodGroup {
        A_NEGATIVE,
        A_POSITIVE,
        B_NEGATIVE,
        B_POSITIVE,
        ZERO_NEGATIVE,
        ZERO_POSITIVE,
        AB_NEGATIVE,
        AB_POSITIVE
    }

    /** The gender enum. */
    enum class Gender {
        MALE, FEMALE
    }
}
