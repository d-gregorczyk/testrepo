package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.ActivateOperationDescriptor
import org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor

sealed class AbstractSetStateOperationDescriptorOneOf {
    data class ChoiceAbstractSetStateOperationDescriptor(val value: AbstractSetStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceActivateOperationDescriptor(val value: ActivateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetAlertStateOperationDescriptor(val value: SetAlertStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetComponentStateOperationDescriptor(val value: SetComponentStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetContextStateOperationDescriptor(val value: SetContextStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetMetricStateOperationDescriptor(val value: SetMetricStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
}
