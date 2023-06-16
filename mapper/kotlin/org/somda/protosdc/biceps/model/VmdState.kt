package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.OperatingJurisdiction

data class VmdState(
    val abstractComplexDeviceComponentState: AbstractComplexDeviceComponentState,
    val operatingJurisdiction: OperatingJurisdiction? = null,
)
