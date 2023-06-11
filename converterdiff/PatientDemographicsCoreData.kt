package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.BaseDemographics
import org.somda.protosdc.biceps.model.Sex
import org.somda.protosdc.biceps.model.PatientType
import org.somda.protosdc.biceps.model.Measurement
import org.somda.protosdc.biceps.model.CodedValue
import java.time.LocalDateTime
import java.time.LocalDate
import java.time.YearMonth
import java.time.Year

data class PatientDemographicsCoreData(
    val baseDemographics: BaseDemographics,
    val sex: Sex? = null,
    val patientType: PatientType? = null,
    val dateOfBirth: DateOfBirth? = null,
    val height: Measurement? = null,
    val weight: Measurement? = null,
    val race: CodedValue? = null,
) {
    sealed class DateOfBirth {
        data class ChoiceLocalDateTime(val Choice: LocalDateTime) : DateOfBirth()
        data class ChoiceLocalDate(val Choice: LocalDate) : DateOfBirth()
        data class ChoiceYearMonth(val Choice: YearMonth) : DateOfBirth()
        data class ChoiceYear(val Choice: Year) : DateOfBirth()
    }
}
