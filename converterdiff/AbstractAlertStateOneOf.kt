package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertState
import org.somda.protosdc.biceps.model.AlertConditionState
import org.somda.protosdc.biceps.model.AlertSignalState
import org.somda.protosdc.biceps.model.AlertSystemState
import org.somda.protosdc.biceps.model.LimitAlertConditionState

sealed class AbstractAlertStateOneOf {
    data class ChoiceAbstractAlertState(val Choice: AbstractAlertState) : AbstractAlertStateOneOf()
    data class ChoiceAlertConditionState(val Choice: AlertConditionState) : AbstractAlertStateOneOf()
    data class ChoiceAlertSignalState(val Choice: AlertSignalState) : AbstractAlertStateOneOf()
    data class ChoiceAlertSystemState(val Choice: AlertSystemState) : AbstractAlertStateOneOf()
    data class ChoiceLimitAlertConditionState(val Choice: LimitAlertConditionState) : AbstractAlertStateOneOf()
}
