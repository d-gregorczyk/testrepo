package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSetResponse
import org.somda.protosdc.biceps.model.ActivateResponse
import org.somda.protosdc.biceps.model.SetAlertStateResponse
import org.somda.protosdc.biceps.model.SetComponentStateResponse
import org.somda.protosdc.biceps.model.SetContextStateResponse
import org.somda.protosdc.biceps.model.SetMetricStateResponse
import org.somda.protosdc.biceps.model.SetStringResponse
import org.somda.protosdc.biceps.model.SetValueResponse

sealed class AbstractSetResponseOneOf {
    data class ChoiceAbstractSetResponse(val value: AbstractSetResponse) : AbstractSetResponseOneOf()
    data class ChoiceActivateResponse(val value: ActivateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetAlertStateResponse(val value: SetAlertStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetComponentStateResponse(val value: SetComponentStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetContextStateResponse(val value: SetContextStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetMetricStateResponse(val value: SetMetricStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetStringResponse(val value: SetStringResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetValueResponse(val value: SetValueResponse) : AbstractSetResponseOneOf()
}
