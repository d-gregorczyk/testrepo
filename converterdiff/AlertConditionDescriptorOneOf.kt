package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor

sealed class AlertConditionDescriptorOneOf {
    data class ChoiceAlertConditionDescriptor(val Choice: AlertConditionDescriptor) : AlertConditionDescriptorOneOf()
    data class ChoiceLimitAlertConditionDescriptor(val Choice: LimitAlertConditionDescriptor) : AlertConditionDescriptorOneOf()
}
