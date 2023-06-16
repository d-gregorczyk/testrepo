package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.Gender
import org.somda.protosdc.extensions.codedattribute.EquipmentIdentifier

sealed class BicepsExtensions {
    data class ChoiceGender(val value: Gender) : BicepsExtensions()
    data class ChoiceEquipmentIdentifier(val value: EquipmentIdentifier) : BicepsExtensions()
}
