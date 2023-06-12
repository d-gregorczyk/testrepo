package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.Activate
import org.somda.protosdc.biceps.model.SetAlertState
import org.somda.protosdc.biceps.model.SetComponentState
import org.somda.protosdc.biceps.model.SetContextState
import org.somda.protosdc.biceps.model.SetMetricState
import org.somda.protosdc.biceps.model.SetString
import org.somda.protosdc.biceps.model.SetValue

data class AbstractSetOneOf(
    sealed class AbstractSetOneOf {
        data class ChoiceAbstractSet(val value: AbstractSet) : AbstractSetOneOf()
        data class ChoiceActivate(val value: Activate) : AbstractSetOneOf()
        data class ChoiceSetAlertState(val value: SetAlertState) : AbstractSetOneOf()
        data class ChoiceSetComponentState(val value: SetComponentState) : AbstractSetOneOf()
        data class ChoiceSetContextState(val value: SetContextState) : AbstractSetOneOf()
        data class ChoiceSetMetricState(val value: SetMetricState) : AbstractSetOneOf()
        data class ChoiceSetString(val value: SetString) : AbstractSetOneOf()
        data class ChoiceSetValue(val value: SetValue) : AbstractSetOneOf()
    }
)
