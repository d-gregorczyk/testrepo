package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.ActivateOperationDescriptor
import org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor

sealed class AbstractSetStateOperationDescriptorOneOf {
    data class ChoiceAbstractSetStateOperationDescriptor(val Choice: AbstractSetStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceActivateOperationDescriptor(val Choice: ActivateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetAlertStateOperationDescriptor(val Choice: SetAlertStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetComponentStateOperationDescriptor(val Choice: SetComponentStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetContextStateOperationDescriptor(val Choice: SetContextStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
    data class ChoiceSetMetricStateOperationDescriptor(val Choice: SetMetricStateOperationDescriptor) : AbstractSetStateOperationDescriptorOneOf()
}
