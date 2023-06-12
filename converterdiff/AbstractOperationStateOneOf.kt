package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationState
import org.somda.protosdc.biceps.model.ActivateOperationState
import org.somda.protosdc.biceps.model.SetAlertStateOperationState
import org.somda.protosdc.biceps.model.SetComponentStateOperationState
import org.somda.protosdc.biceps.model.SetContextStateOperationState
import org.somda.protosdc.biceps.model.SetMetricStateOperationState
import org.somda.protosdc.biceps.model.SetStringOperationState
import org.somda.protosdc.biceps.model.SetValueOperationState

data class AbstractOperationStateOneOf(
    sealed class AbstractOperationStateOneOf {
        data class ChoiceAbstractOperationState(val value: AbstractOperationState) : AbstractOperationStateOneOf()
        data class ChoiceActivateOperationState(val value: ActivateOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetAlertStateOperationState(val value: SetAlertStateOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetComponentStateOperationState(val value: SetComponentStateOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetContextStateOperationState(val value: SetContextStateOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetMetricStateOperationState(val value: SetMetricStateOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetStringOperationState(val value: SetStringOperationState) : AbstractOperationStateOneOf()
        data class ChoiceSetValueOperationState(val value: SetValueOperationState) : AbstractOperationStateOneOf()
    }
)
