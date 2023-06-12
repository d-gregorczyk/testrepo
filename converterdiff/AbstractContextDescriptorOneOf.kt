package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextDescriptor
import org.somda.protosdc.biceps.model.EnsembleContextDescriptor
import org.somda.protosdc.biceps.model.LocationContextDescriptor
import org.somda.protosdc.biceps.model.MeansContextDescriptor
import org.somda.protosdc.biceps.model.OperatorContextDescriptor
import org.somda.protosdc.biceps.model.PatientContextDescriptor
import org.somda.protosdc.biceps.model.WorkflowContextDescriptor

sealed class AbstractContextDescriptorOneOf {
    data class ChoiceAbstractContextDescriptor(val value: AbstractContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceEnsembleContextDescriptor(val value: EnsembleContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceLocationContextDescriptor(val value: LocationContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceMeansContextDescriptor(val value: MeansContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceOperatorContextDescriptor(val value: OperatorContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoicePatientContextDescriptor(val value: PatientContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceWorkflowContextDescriptor(val value: WorkflowContextDescriptor) : AbstractContextDescriptorOneOf()
}
