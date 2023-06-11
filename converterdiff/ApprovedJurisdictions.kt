package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf

data class ApprovedJurisdictions (
    val approvedJurisdiction: List<InstanceIdentifierOneOf> = listOf(),
)
