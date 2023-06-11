package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.MdsState
import org.somda.protosdc.biceps.model.VmdState

sealed class AbstractComplexDeviceComponentStateOneOf {
    data class ChoiceAbstractComplexDeviceComponentState(val Choice: AbstractComplexDeviceComponentState) : AbstractComplexDeviceComponentStateOneOf()
    data class ChoiceMdsState(val Choice: MdsState) : AbstractComplexDeviceComponentStateOneOf()
    data class ChoiceVmdState(val Choice: VmdState) : AbstractComplexDeviceComponentStateOneOf()
}
