package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentState
import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.BatteryState
import org.somda.protosdc.biceps.model.ChannelState
import org.somda.protosdc.biceps.model.ClockState
import org.somda.protosdc.biceps.model.MdsState
import org.somda.protosdc.biceps.model.ScoState
import org.somda.protosdc.biceps.model.SystemContextState
import org.somda.protosdc.biceps.model.VmdState

sealed class AbstractDeviceComponentStateOneOf {
    data class ChoiceAbstractDeviceComponentState(val value: AbstractDeviceComponentState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceAbstractComplexDeviceComponentState(val value: AbstractComplexDeviceComponentState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceBatteryState(val value: BatteryState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceChannelState(val value: ChannelState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceClockState(val value: ClockState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceMdsState(val value: MdsState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceScoState(val value: ScoState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceSystemContextState(val value: SystemContextState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceVmdState(val value: VmdState) : AbstractDeviceComponentStateOneOf()
}
