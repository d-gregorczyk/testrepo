package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationDescriptor
import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.ActivateOperationDescriptor
import org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetStringOperationDescriptor
import org.somda.protosdc.biceps.model.SetValueOperationDescriptor

sealed class AbstractOperationDescriptorOneOf {
    data class ChoiceAbstractOperationDescriptor(val Choice: AbstractOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceAbstractSetStateOperationDescriptor(val Choice: AbstractSetStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceActivateOperationDescriptor(val Choice: ActivateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetAlertStateOperationDescriptor(val Choice: SetAlertStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetComponentStateOperationDescriptor(val Choice: SetComponentStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetContextStateOperationDescriptor(val Choice: SetContextStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetMetricStateOperationDescriptor(val Choice: SetMetricStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetStringOperationDescriptor(val Choice: SetStringOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetValueOperationDescriptor(val Choice: SetValueOperationDescriptor) : AbstractOperationDescriptorOneOf()
}
