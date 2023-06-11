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
    data class ChoiceAbstractDeviceComponentState(val Choice: AbstractDeviceComponentState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceAbstractComplexDeviceComponentState(val Choice: AbstractComplexDeviceComponentState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceBatteryState(val Choice: BatteryState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceChannelState(val Choice: ChannelState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceClockState(val Choice: ClockState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceMdsState(val Choice: MdsState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceScoState(val Choice: ScoState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceSystemContextState(val Choice: SystemContextState) : AbstractDeviceComponentStateOneOf()
    data class ChoiceVmdState(val Choice: VmdState) : AbstractDeviceComponentStateOneOf()
}
