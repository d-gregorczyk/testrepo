package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.GenderType
import org.somda.protosdc.extensions.codedattribute.Gender

sealed class GenderTypeOneOf {
    data class ChoiceGenderType(val value: GenderType) : GenderTypeOneOf()
    data class ChoiceGender(val value: Gender) : GenderTypeOneOf()
}
