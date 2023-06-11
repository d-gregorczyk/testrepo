package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.BaseDemographicsOneOf

data class OperatorContextState(
    val abstractContextState: AbstractContextState,
    val operatorDetails: BaseDemographicsOneOf? = null,
)
