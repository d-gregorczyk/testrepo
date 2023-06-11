package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertConditionState
import org.somda.protosdc.biceps.model.Range
import org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits
import org.somda.protosdc.biceps.model.AlertActivation

data class LimitAlertConditionState(
    val alertConditionState: AlertConditionState,
    val limits: Range,
    val monitoredAlertLimitsAttr: AlertConditionMonitoredLimits,
    val autoLimitActivationStateAttr: AlertActivation? = null,
)
