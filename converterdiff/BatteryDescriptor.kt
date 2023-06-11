package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.Measurement

data class BatteryDescriptor (
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
    val capacityFullCharge: Measurement? = null,
    val capacitySpecified: Measurement? = null,
    val voltageSpecified: Measurement? = null,
)
