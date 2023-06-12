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
    data class ChoiceAbstractDeviceComponentDescriptor(val value: AbstractDeviceComponentDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceAbstractComplexDeviceComponentDescriptor(val value: AbstractComplexDeviceComponentDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceBatteryDescriptor(val value: BatteryDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceChannelDescriptor(val value: ChannelDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceClockDescriptor(val value: ClockDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceMdsDescriptor(val value: MdsDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceScoDescriptor(val value: ScoDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceSystemContextDescriptor(val value: SystemContextDescriptor) : AbstractDeviceComponentDescriptorOneOf()
    data class ChoiceVmdDescriptor(val value: VmdDescriptor) : AbstractDeviceComponentDescriptorOneOf()
}
