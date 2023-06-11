package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.PatientContextDescriptor
import org.somda.protosdc.biceps.model.LocationContextDescriptor
import org.somda.protosdc.biceps.model.EnsembleContextDescriptor
import org.somda.protosdc.biceps.model.OperatorContextDescriptor
import org.somda.protosdc.biceps.model.WorkflowContextDescriptor
import org.somda.protosdc.biceps.model.MeansContextDescriptor

data class SystemContextDescriptor (
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
    val patientContext: PatientContextDescriptor? = null,
    val locationContext: LocationContextDescriptor? = null,
    val ensembleContext: List<EnsembleContextDescriptor> = listOf(),
    val operatorContext: List<OperatorContextDescriptor> = listOf(),
    val workflowContext: List<WorkflowContextDescriptor> = listOf(),
    val meansContext: List<MeansContextDescriptor> = listOf(),
)
