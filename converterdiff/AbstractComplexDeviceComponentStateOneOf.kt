package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.MdsState
import org.somda.protosdc.biceps.model.VmdState

sealed class AbstractComplexDeviceComponentStateOneOf {
    data class ChoiceAbstractComplexDeviceComponentState(val value: AbstractComplexDeviceComponentState) : AbstractComplexDeviceComponentStateOneOf()
    data class ChoiceMdsState(val value: MdsState) : AbstractComplexDeviceComponentStateOneOf()
    data class ChoiceVmdState(val value: VmdState) : AbstractComplexDeviceComponentStateOneOf()
}
