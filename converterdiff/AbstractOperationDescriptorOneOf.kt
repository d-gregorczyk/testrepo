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
    data class ChoiceAbstractOperationDescriptor(val value: AbstractOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceAbstractSetStateOperationDescriptor(val value: AbstractSetStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceActivateOperationDescriptor(val value: ActivateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetAlertStateOperationDescriptor(val value: SetAlertStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetComponentStateOperationDescriptor(val value: SetComponentStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetContextStateOperationDescriptor(val value: SetContextStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetMetricStateOperationDescriptor(val value: SetMetricStateOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetStringOperationDescriptor(val value: SetStringOperationDescriptor) : AbstractOperationDescriptorOneOf()
    data class ChoiceSetValueOperationDescriptor(val value: SetValueOperationDescriptor) : AbstractOperationDescriptorOneOf()
}
