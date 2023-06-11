package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.OperatingJurisdiction
import org.somda.protosdc.biceps.model.MdsOperatingMode

data class MdsState (
    val abstractComplexDeviceComponentState: AbstractComplexDeviceComponentState,
    val operatingJurisdiction: OperatingJurisdiction? = null,
    val langAttr: String? = null,
    val operatingModeAttr: MdsOperatingMode? = null,
)
