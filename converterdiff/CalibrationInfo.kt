package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CalibrationState
import org.somda.protosdc.biceps.model.CalibrationType
import org.somda.protosdc.biceps.model.Timestamp
import org.somda.protosdc.biceps.model.LocalizedText
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.Measurement

data class CalibrationInfo(
    val extensionElement: Extension? = null,
    data class CalibrationDocumentation(
        val documentation: List<LocalizedText> = listOf(),
        data class CalibrationResult(
            val code: CodedValue,
            val value: Measurement,
        )
        val calibrationResult: List<CalibrationResult> = listOf(),
    )
    val calibrationDocumentation: List<CalibrationDocumentation> = listOf(),
    val componentCalibrationStateAttr: CalibrationState? = null,
    val typeAttr: CalibrationType? = null,
    val timeAttr: Timestamp? = null,
)
