package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf
import org.somda.protosdc.biceps.model.AlertSignalDescriptor
import kotlin.time.Duration

data class AlertSystemDescriptor(
    val abstractAlertDescriptor: AbstractAlertDescriptor,
val alertCondition: List<AlertConditionDescriptorOneOf> = listOf(),
val alertSignal: List<AlertSignalDescriptor> = listOf(),
    val maxPhysiologicalParallelAlarmsAttr: Int? = null,
    val maxTechnicalParallelAlarmsAttr: Int? = null,
    val selfCheckPeriodAttr: Duration? = null,
)
