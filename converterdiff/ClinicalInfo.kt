package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.LocalizedText
import org.somda.protosdc.biceps.model.Measurement
import org.somda.protosdc.biceps.model.MeasurementValidity
import org.somda.protosdc.biceps.model.Range

data class ClinicalInfo (
    val extensionElement: Extension? = null,
    val type: CodedValue? = null,
    val code: CodedValue? = null,
    val criticality: Criticality? = null,
    val description: List<LocalizedText> = listOf(),
    val relatedMeasurement: List<RelatedMeasurement> = listOf(),
) {
    data class Criticality (
        val enumType: EnumType,
    ) {
        enum class EnumType {
            Lo, Hi
        }
    }
    data class RelatedMeasurement (
        val value: Measurement,
        val referenceRange: List<ReferenceRange> = listOf(),
        val validityAttr: MeasurementValidity? = null,
    ) {
        data class ReferenceRange (
            val range: Range,
            val meaning: CodedValue? = null,
        )
    }
}
