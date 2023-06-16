package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AlertSystemDescriptor
import org.somda.protosdc.biceps.model.ScoDescriptor

data class AbstractComplexDeviceComponentDescriptor(
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
    val alertSystem: AlertSystemDescriptor? = null,
    val sco: ScoDescriptor? = null,
)
