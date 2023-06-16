package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf

data class ScoDescriptor(
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
    val operation: List<AbstractOperationDescriptorOneOf> = listOf(),
)
