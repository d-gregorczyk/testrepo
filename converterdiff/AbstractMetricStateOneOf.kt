package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState
import org.somda.protosdc.biceps.model.EnumStringMetricState
import org.somda.protosdc.biceps.model.NumericMetricState
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState
import org.somda.protosdc.biceps.model.StringMetricState

sealed class AbstractMetricStateOneOf {
    data class ChoiceAbstractMetricState(val value: AbstractMetricState) : AbstractMetricStateOneOf()
    data class ChoiceDistributionSampleArrayMetricState(val value: DistributionSampleArrayMetricState) : AbstractMetricStateOneOf()
    data class ChoiceEnumStringMetricState(val value: EnumStringMetricState) : AbstractMetricStateOneOf()
    data class ChoiceNumericMetricState(val value: NumericMetricState) : AbstractMetricStateOneOf()
    data class ChoiceRealTimeSampleArrayMetricState(val value: RealTimeSampleArrayMetricState) : AbstractMetricStateOneOf()
    data class ChoiceStringMetricState(val value: StringMetricState) : AbstractMetricStateOneOf()
}
