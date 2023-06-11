package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState
import org.somda.protosdc.biceps.model.EnumStringMetricState
import org.somda.protosdc.biceps.model.NumericMetricState
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState
import org.somda.protosdc.biceps.model.StringMetricState

sealed class AbstractMetricStateOneOf {
    data class ChoiceAbstractMetricState(val Choice: AbstractMetricState) : AbstractMetricStateOneOf()
    data class ChoiceDistributionSampleArrayMetricState(val Choice: DistributionSampleArrayMetricState) : AbstractMetricStateOneOf()
    data class ChoiceEnumStringMetricState(val Choice: EnumStringMetricState) : AbstractMetricStateOneOf()
    data class ChoiceNumericMetricState(val Choice: NumericMetricState) : AbstractMetricStateOneOf()
    data class ChoiceRealTimeSampleArrayMetricState(val Choice: RealTimeSampleArrayMetricState) : AbstractMetricStateOneOf()
    data class ChoiceStringMetricState(val Choice: StringMetricState) : AbstractMetricStateOneOf()
}
