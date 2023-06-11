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
    data class ChoiceAbstractSetResponse(val Choice: AbstractSetResponse) : AbstractSetResponseOneOf()
    data class ChoiceActivateResponse(val Choice: ActivateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetAlertStateResponse(val Choice: SetAlertStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetComponentStateResponse(val Choice: SetComponentStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetContextStateResponse(val Choice: SetContextStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetMetricStateResponse(val Choice: SetMetricStateResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetStringResponse(val Choice: SetStringResponse) : AbstractSetResponseOneOf()
    data class ChoiceSetValueResponse(val Choice: SetValueResponse) : AbstractSetResponseOneOf()
}
