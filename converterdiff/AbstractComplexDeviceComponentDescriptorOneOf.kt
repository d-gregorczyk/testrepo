package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.MdsDescriptor
import org.somda.protosdc.biceps.model.VmdDescriptor

sealed class AbstractComplexDeviceComponentDescriptorOneOf {
    data class ChoiceAbstractComplexDeviceComponentDescriptor(val Choice: AbstractComplexDeviceComponentDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
    data class ChoiceMdsDescriptor(val Choice: MdsDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
    data class ChoiceVmdDescriptor(val Choice: VmdDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
}
