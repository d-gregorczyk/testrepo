package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.ApprovedJurisdictions
import org.somda.protosdc.biceps.model.ChannelDescriptor

data class VmdDescriptor(
    val abstractComplexDeviceComponentDescriptor: AbstractComplexDeviceComponentDescriptor,
    val approvedJurisdictions: ApprovedJurisdictions? = null,
val channel: List<ChannelDescriptor> = listOf(),
)
