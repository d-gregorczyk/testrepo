package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PatientDemographicsCoreData
import org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData

data class PatientDemographicsCoreDataOneOf(
    sealed class PatientDemographicsCoreDataOneOf {
        data class ChoicePatientDemographicsCoreData(val value: PatientDemographicsCoreData) : PatientDemographicsCoreDataOneOf()
        data class ChoiceNeonatalPatientDemographicsCoreData(val value: NeonatalPatientDemographicsCoreData) : PatientDemographicsCoreDataOneOf()
    }
)
