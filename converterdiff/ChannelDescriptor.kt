package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf

data class ChannelDescriptor(
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
    val metric: List<AbstractMetricDescriptorOneOf> = listOf(),
)
