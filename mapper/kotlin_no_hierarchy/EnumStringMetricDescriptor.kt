package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.StringMetricDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.Measurement

data class EnumStringMetricDescriptor(
    val stringMetricDescriptor: StringMetricDescriptor,
val allowedValue: List<AllowedValue> = listOf(),
) {
    data class AllowedValue(
        val value: String,
        val type: CodedValue? = null,
        val identification: InstanceIdentifierOneOf? = null,
        val characteristic: Measurement? = null,
    )
}
