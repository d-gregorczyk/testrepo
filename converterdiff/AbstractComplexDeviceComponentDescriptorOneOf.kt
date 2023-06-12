package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.MdsDescriptor
import org.somda.protosdc.biceps.model.VmdDescriptor

data class AbstractComplexDeviceComponentDescriptorOneOf(
    sealed class AbstractComplexDeviceComponentDescriptorOneOf {
        data class ChoiceAbstractComplexDeviceComponentDescriptor(val value: AbstractComplexDeviceComponentDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
        data class ChoiceMdsDescriptor(val value: MdsDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
        data class ChoiceVmdDescriptor(val value: VmdDescriptor) : AbstractComplexDeviceComponentDescriptorOneOf()
    }
)
