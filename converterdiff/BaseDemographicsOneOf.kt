package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.BaseDemographics
import org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData
import org.somda.protosdc.biceps.model.PatientDemographicsCoreData

sealed class BaseDemographicsOneOf {
    data class ChoiceBaseDemographics(val value: BaseDemographics) : BaseDemographicsOneOf()
    data class ChoiceNeonatalPatientDemographicsCoreData(val value: NeonatalPatientDemographicsCoreData) : BaseDemographicsOneOf()
    data class ChoicePatientDemographicsCoreData(val value: PatientDemographicsCoreData) : BaseDemographicsOneOf()
}
