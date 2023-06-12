package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.EnumStringMetricDescriptor
import org.somda.protosdc.biceps.model.NumericMetricDescriptor
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.StringMetricDescriptor

sealed class AbstractMetricDescriptorOneOf {
    data class ChoiceAbstractMetricDescriptor(val value: AbstractMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceDistributionSampleArrayMetricDescriptor(val value: DistributionSampleArrayMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceEnumStringMetricDescriptor(val value: EnumStringMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceNumericMetricDescriptor(val value: NumericMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceRealTimeSampleArrayMetricDescriptor(val value: RealTimeSampleArrayMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceStringMetricDescriptor(val value: StringMetricDescriptor) : AbstractMetricDescriptorOneOf()
}
