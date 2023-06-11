package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.AlertSignalDescriptor
import org.somda.protosdc.biceps.model.AlertSystemDescriptor
import org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor

sealed class AbstractAlertDescriptorOneOf {
    data class ChoiceAbstractAlertDescriptor(val Choice: AbstractAlertDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertConditionDescriptor(val Choice: AlertConditionDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertSignalDescriptor(val Choice: AlertSignalDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceAlertSystemDescriptor(val Choice: AlertSystemDescriptor) : AbstractAlertDescriptorOneOf()
    data class ChoiceLimitAlertConditionDescriptor(val Choice: LimitAlertConditionDescriptor) : AbstractAlertDescriptorOneOf()
}
