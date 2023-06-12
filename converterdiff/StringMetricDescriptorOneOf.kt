package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.StringMetricDescriptor
import org.somda.protosdc.biceps.model.EnumStringMetricDescriptor

data class StringMetricDescriptorOneOf(
    sealed class StringMetricDescriptorOneOf {
        data class ChoiceStringMetricDescriptor(val value: StringMetricDescriptor) : StringMetricDescriptorOneOf()
        data class ChoiceEnumStringMetricDescriptor(val value: EnumStringMetricDescriptor) : StringMetricDescriptorOneOf()
    }
)
