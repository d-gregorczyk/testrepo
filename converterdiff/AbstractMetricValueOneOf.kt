package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue
import org.somda.protosdc.biceps.model.NumericMetricValue
import org.somda.protosdc.biceps.model.SampleArrayValue
import org.somda.protosdc.biceps.model.StringMetricValue

sealed class AbstractMetricValueOneOf {
    data class ChoiceAbstractMetricValue(val Choice: AbstractMetricValue) : AbstractMetricValueOneOf()
    data class ChoiceNumericMetricValue(val Choice: NumericMetricValue) : AbstractMetricValueOneOf()
    data class ChoiceSampleArrayValue(val Choice: SampleArrayValue) : AbstractMetricValueOneOf()
    data class ChoiceStringMetricValue(val Choice: StringMetricValue) : AbstractMetricValueOneOf()
}
