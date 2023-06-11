package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.StringMetricState
import org.somda.protosdc.biceps.model.EnumStringMetricState

sealed class StringMetricStateOneOf {
    data class ChoiceStringMetricState(val value: StringMetricState) : StringMetricStateOneOf()
    data class ChoiceEnumStringMetricState(val value: EnumStringMetricState) : StringMetricStateOneOf()
}
