package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.StringMetricDescriptor
import org.somda.protosdc.biceps.model.EnumStringMetricDescriptor

sealed class StringMetricDescriptorOneOf {
    data class ChoiceStringMetricDescriptor(val Choice: StringMetricDescriptor) : StringMetricDescriptorOneOf()
    data class ChoiceEnumStringMetricDescriptor(val Choice: EnumStringMetricDescriptor) : StringMetricDescriptorOneOf()
}
