package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.BatteryDescriptor
import org.somda.protosdc.biceps.model.ChannelDescriptor
import org.somda.protosdc.biceps.model.ClockDescriptor
import org.somda.protosdc.biceps.model.MdsDescriptor
import org.somda.protosdc.biceps.model.ScoDescriptor
import org.somda.protosdc.biceps.model.SystemContextDescriptor
import org.somda.protosdc.biceps.model.VmdDescriptor

sealed class AbstractDeviceComponentDescriptorOneOf {
    data class ChoiceAbstractDeviceComponentDescriptor(val Choice: AbstractDeviceComponentDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceAbstractComplexDeviceComponentDescriptor(val Choice: AbstractComplexDeviceComponentDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceBatteryDescriptor(val Choice: BatteryDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceChannelDescriptor(val Choice: ChannelDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceClockDescriptor(val Choice: ClockDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceMdsDescriptor(val Choice: MdsDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceScoDescriptor(val Choice: ScoDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceSystemContextDescriptor(val Choice: SystemContextDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceVmdDescriptor(val Choice: VmdDescriptor) : AbstractDeviceComponentDescriptorOneOf()
}
