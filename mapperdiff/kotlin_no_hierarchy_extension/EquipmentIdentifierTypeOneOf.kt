package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierType
import org.somda.protosdc.extensions.codedattribute.EquipmentIdentifier

sealed class EquipmentIdentifierTypeOneOf {
    data class ChoiceEquipmentIdentifierType(val value: EquipmentIdentifierType) : EquipmentIdentifierTypeOneOf()
    data class ChoiceEquipmentIdentifier(val value: EquipmentIdentifier) : EquipmentIdentifierTypeOneOf()
}
