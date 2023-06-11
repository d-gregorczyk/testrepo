package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationState
import org.somda.protosdc.biceps.model.ActivateOperationState
import org.somda.protosdc.biceps.model.SetAlertStateOperationState
import org.somda.protosdc.biceps.model.SetComponentStateOperationState
import org.somda.protosdc.biceps.model.SetContextStateOperationState
import org.somda.protosdc.biceps.model.SetMetricStateOperationState
import org.somda.protosdc.biceps.model.SetStringOperationState
import org.somda.protosdc.biceps.model.SetValueOperationState

sealed class AbstractOperationStateOneOf {
    data class ChoiceAbstractOperationState(val Choice: AbstractOperationState) : AbstractOperationStateOneOf()
    data class ChoiceActivateOperationState(val Choice: ActivateOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetAlertStateOperationState(val Choice: SetAlertStateOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetComponentStateOperationState(val Choice: SetComponentStateOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetContextStateOperationState(val Choice: SetContextStateOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetMetricStateOperationState(val Choice: SetMetricStateOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetStringOperationState(val Choice: SetStringOperationState) : AbstractOperationStateOneOf()
    data class ChoiceSetValueOperationState(val Choice: SetValueOperationState) : AbstractOperationStateOneOf()
}
