package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierType

data class EquipmentIdentifier(
    val equipmentIdentifierType: EquipmentIdentifierType,
    val mustUnderstandAttr: Boolean? = null,
)
