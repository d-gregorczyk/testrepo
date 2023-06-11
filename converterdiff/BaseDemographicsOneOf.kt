package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.BaseDemographics
import org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData
import org.somda.protosdc.biceps.model.PatientDemographicsCoreData

sealed class BaseDemographicsOneOf {
    data class ChoiceBaseDemographics(val Choice: BaseDemographics) : BaseDemographicsOneOf()
    data class ChoiceNeonatalPatientDemographicsCoreData(val Choice: NeonatalPatientDemographicsCoreData) : BaseDemographicsOneOf()
    data class ChoicePatientDemographicsCoreData(val Choice: PatientDemographicsCoreData) : BaseDemographicsOneOf()
}
