package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.Range

data class LimitAlertConditionDescriptor(
    val alertConditionDescriptor: AlertConditionDescriptor,
    val maxLimits: Range,
    val autoLimitSupportedAttr: Boolean? = null,
)
