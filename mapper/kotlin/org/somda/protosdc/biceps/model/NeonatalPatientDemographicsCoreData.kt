package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PatientDemographicsCoreData
import org.somda.protosdc.biceps.model.Measurement
import org.somda.protosdc.biceps.model.PersonReferenceOneOf

data class NeonatalPatientDemographicsCoreData(
    val patientDemographicsCoreData: PatientDemographicsCoreData,
    val gestationalAge: Measurement? = null,
    val birthLength: Measurement? = null,
    val birthWeight: Measurement? = null,
    val headCircumference: Measurement? = null,
    val mother: PersonReferenceOneOf? = null,
)
