package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMultiState
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.ContextAssociation
import org.somda.protosdc.biceps.model.ReferencedVersion
import org.somda.protosdc.biceps.model.Timestamp

data class AbstractContextState(
    val abstractMultiState: AbstractMultiState,
val validator: List<InstanceIdentifierOneOf> = listOf(),
val identification: List<InstanceIdentifierOneOf> = listOf(),
    val contextAssociationAttr: ContextAssociation? = null,
    val bindingMdibVersionAttr: ReferencedVersion? = null,
    val unbindingMdibVersionAttr: ReferencedVersion? = null,
    val bindingStartTimeAttr: Timestamp? = null,
    val bindingEndTimeAttr: Timestamp? = null,
)
