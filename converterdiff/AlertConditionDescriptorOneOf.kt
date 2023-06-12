package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor

data class AlertConditionDescriptorOneOf(
    sealed class AlertConditionDescriptorOneOf {
        data class ChoiceAlertConditionDescriptor(val value: AlertConditionDescriptor) : AlertConditionDescriptorOneOf()
        data class ChoiceLimitAlertConditionDescriptor(val value: LimitAlertConditionDescriptor) : AlertConditionDescriptorOneOf()
    }
)
