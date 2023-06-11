package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.EnumStringMetricDescriptor
import org.somda.protosdc.biceps.model.NumericMetricDescriptor
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.StringMetricDescriptor

sealed class AbstractMetricDescriptorOneOf {
    data class ChoiceAbstractMetricDescriptor(val Choice: AbstractMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceDistributionSampleArrayMetricDescriptor(val Choice: DistributionSampleArrayMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceEnumStringMetricDescriptor(val Choice: EnumStringMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceNumericMetricDescriptor(val Choice: NumericMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceRealTimeSampleArrayMetricDescriptor(val Choice: RealTimeSampleArrayMetricDescriptor) : AbstractMetricDescriptorOneOf()
    data class ChoiceStringMetricDescriptor(val Choice: StringMetricDescriptor) : AbstractMetricDescriptorOneOf()
}
