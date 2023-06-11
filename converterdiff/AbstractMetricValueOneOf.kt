package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue
import org.somda.protosdc.biceps.model.NumericMetricValue
import org.somda.protosdc.biceps.model.SampleArrayValue
import org.somda.protosdc.biceps.model.StringMetricValue

sealed class AbstractMetricValueOneOf {
    data class ChoiceAbstractMetricValue(val value: AbstractMetricValue) : AbstractMetricValueOneOf()
    data class ChoiceNumericMetricValue(val value: NumericMetricValue) : AbstractMetricValueOneOf()
    data class ChoiceSampleArrayValue(val value: SampleArrayValue) : AbstractMetricValueOneOf()
    data class ChoiceStringMetricValue(val value: StringMetricValue) : AbstractMetricValueOneOf()
}
