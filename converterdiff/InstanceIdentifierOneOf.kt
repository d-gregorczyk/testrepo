package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.InstanceIdentifier
import org.somda.protosdc.biceps.model.OperatingJurisdiction

data class InstanceIdentifierOneOf(
    sealed class InstanceIdentifierOneOf {
        data class ChoiceInstanceIdentifier(val value: InstanceIdentifier) : InstanceIdentifierOneOf()
        data class ChoiceOperatingJurisdiction(val value: OperatingJurisdiction) : InstanceIdentifierOneOf()
    }
)
