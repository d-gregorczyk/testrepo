package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.CalibrationInfo
import org.somda.protosdc.biceps.model.PhysicalConnectorInfo
import org.somda.protosdc.biceps.model.ComponentActivation

data class AbstractDeviceComponentState(
    val abstractState: AbstractState,
    val calibrationInfo: CalibrationInfo? = null,
    val nextCalibration: CalibrationInfo? = null,
    val physicalConnector: PhysicalConnectorInfo? = null,
    val activationStateAttr: ComponentActivation? = null,
    val operatingHoursAttr: Int? = null,
    val operatingCyclesAttr: Int? = null,
)
