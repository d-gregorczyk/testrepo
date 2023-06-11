package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.InstanceIdentifier
import org.somda.protosdc.biceps.model.OperatingJurisdiction

sealed class InstanceIdentifierOneOf {
    data class ChoiceInstanceIdentifier(val Choice: InstanceIdentifier) : InstanceIdentifierOneOf()
    data class ChoiceOperatingJurisdiction(val Choice: OperatingJurisdiction) : InstanceIdentifierOneOf()
}
