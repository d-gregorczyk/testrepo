package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextDescriptor
import org.somda.protosdc.biceps.model.EnsembleContextDescriptor
import org.somda.protosdc.biceps.model.LocationContextDescriptor
import org.somda.protosdc.biceps.model.MeansContextDescriptor
import org.somda.protosdc.biceps.model.OperatorContextDescriptor
import org.somda.protosdc.biceps.model.PatientContextDescriptor
import org.somda.protosdc.biceps.model.WorkflowContextDescriptor

sealed class AbstractContextDescriptorOneOf {
    data class ChoiceAbstractContextDescriptor(val Choice: AbstractContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceEnsembleContextDescriptor(val Choice: EnsembleContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceLocationContextDescriptor(val Choice: LocationContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceMeansContextDescriptor(val Choice: MeansContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceOperatorContextDescriptor(val Choice: OperatorContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoicePatientContextDescriptor(val Choice: PatientContextDescriptor) : AbstractContextDescriptorOneOf()
    data class ChoiceWorkflowContextDescriptor(val Choice: WorkflowContextDescriptor) : AbstractContextDescriptorOneOf()
}
