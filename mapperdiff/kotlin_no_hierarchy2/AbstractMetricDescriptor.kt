package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.MetricCategory
import org.somda.protosdc.biceps.model.DerivationMethod
import org.somda.protosdc.biceps.model.MetricAvailability
import kotlin.time.Duration
import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.EntryRef

data class AbstractMetricDescriptor(
    val abstractDescriptor: AbstractDescriptor,
    val unit: CodedValue,
    val bodySite: List<CodedValue> = listOf(),
    val relation: List<Relation> = listOf(),
    val metricCategoryAttr: MetricCategory,
    val derivationMethodAttr: DerivationMethod? = null,
    val metricAvailabilityAttr: MetricAvailability,
    val maxMeasurementTimeAttr: Duration? = null,
    val maxDelayTimeAttr: Duration? = null,
    val determinationPeriodAttr: Duration? = null,
    val lifeTimePeriodAttr: Duration? = null,
    val activationDurationAttr: Duration? = null,
) {
    data class Relation(
        val extensionElement: Extension? = null,
        val code: CodedValue? = null,
        val identification: InstanceIdentifierOneOf? = null,
        val kindAttr: KindAttr,
        val entriesAttr: EntryRef,
    ) {
        data class KindAttr(
            val enumType: EnumType,
        ) {
            enum class EnumType {
                Rcm,
                PS,
                SST,
                ECE,
                DCE,
                Oth,
            }
        }
    }
}
