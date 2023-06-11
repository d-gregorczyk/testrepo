package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf

data class PatientContextState (
    val abstractContextState: AbstractContextState,
    val coreData: PatientDemographicsCoreDataOneOf? = null,
)
