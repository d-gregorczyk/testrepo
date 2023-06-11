package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertState
import org.somda.protosdc.biceps.model.AlertConditionState
import org.somda.protosdc.biceps.model.AlertSignalState
import org.somda.protosdc.biceps.model.AlertSystemState
import org.somda.protosdc.biceps.model.LimitAlertConditionState

sealed class AbstractAlertStateOneOf {
    data class ChoiceAbstractAlertState(val value: AbstractAlertState) : AbstractAlertStateOneOf()
    data class ChoiceAlertConditionState(val value: AlertConditionState) : AbstractAlertStateOneOf()
    data class ChoiceAlertSignalState(val value: AlertSignalState) : AbstractAlertStateOneOf()
    data class ChoiceAlertSystemState(val value: AlertSystemState) : AbstractAlertStateOneOf()
    data class ChoiceLimitAlertConditionState(val value: LimitAlertConditionState) : AbstractAlertStateOneOf()
}
