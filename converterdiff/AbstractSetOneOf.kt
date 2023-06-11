package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.Activate
import org.somda.protosdc.biceps.model.SetAlertState
import org.somda.protosdc.biceps.model.SetComponentState
import org.somda.protosdc.biceps.model.SetContextState
import org.somda.protosdc.biceps.model.SetMetricState
import org.somda.protosdc.biceps.model.SetString
import org.somda.protosdc.biceps.model.SetValue

sealed class AbstractSetOneOf {
    data class ChoiceAbstractSet(val Choice: AbstractSet) : AbstractSetOneOf()
    data class ChoiceActivate(val Choice: Activate) : AbstractSetOneOf()
    data class ChoiceSetAlertState(val Choice: SetAlertState) : AbstractSetOneOf()
    data class ChoiceSetComponentState(val Choice: SetComponentState) : AbstractSetOneOf()
    data class ChoiceSetContextState(val Choice: SetContextState) : AbstractSetOneOf()
    data class ChoiceSetMetricState(val Choice: SetMetricState) : AbstractSetOneOf()
    data class ChoiceSetString(val Choice: SetString) : AbstractSetOneOf()
    data class ChoiceSetValue(val Choice: SetValue) : AbstractSetOneOf()
}
