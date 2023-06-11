package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.AlertSignalDescriptor
import org.somda.protosdc.biceps.model.AlertSystemDescriptor
import org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor

sealed class AbstractAlertDescriptorOneOf {
    data class ChoiceAbstractAlertDescriptor(val value: AbstractAlertDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertConditionDescriptor(val value: AlertConditionDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertSignalDescriptor(val value: AlertSignalDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertSystemDescriptor(val value: AlertSystemDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceLimitAlertConditionDescriptor(val value: LimitAlertConditionDescriptor) : AbstractAlertDescriptorOneOf()
}
