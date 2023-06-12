package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.LocalizedText
import org.somda.protosdc.biceps.model.Measurement
import org.somda.protosdc.biceps.model.MeasurementValidity
import org.somda.protosdc.biceps.model.Range

data class ClinicalInfo(
    val extensionElement: Extension? = null,
    val type: CodedValue? = null,
    val code: CodedValue? = null,
    data class Criticality(
        enum class EnumType {
            Lo,
            Hi,
        }
        val enumType: EnumType,
    )
    val criticality: Criticality? = null,
    val description: List<LocalizedText> = listOf(),
    data class RelatedMeasurement(
        val value: Measurement,
        data class ReferenceRange(
            val range: Range,
            val meaning: CodedValue? = null,
        )
        val referenceRange: List<ReferenceRange> = listOf(),
        val validityAttr: MeasurementValidity? = null,
    )
    val relatedMeasurement: List<RelatedMeasurement> = listOf(),
)
