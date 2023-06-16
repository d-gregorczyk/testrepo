package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertConditionState
import org.somda.protosdc.biceps.model.LimitAlertConditionState

sealed class AlertConditionStateOneOf {
    data class ChoiceAlertConditionState(val value: AlertConditionState) : AlertConditionStateOneOf()
    data class ChoiceLimitAlertConditionState(val value: LimitAlertConditionState) : AlertConditionStateOneOf()
}
