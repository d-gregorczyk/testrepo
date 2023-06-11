package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PatientDemographicsCoreData
import org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData

sealed class PatientDemographicsCoreDataOneOf {
    data class ChoicePatientDemographicsCoreData(val Choice: PatientDemographicsCoreData) : PatientDemographicsCoreDataOneOf()
    data class ChoiceNeonatalPatientDemographicsCoreData(val Choice: NeonatalPatientDemographicsCoreData) : PatientDemographicsCoreDataOneOf()
}
