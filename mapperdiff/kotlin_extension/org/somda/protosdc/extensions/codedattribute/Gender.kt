package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.GenderType

data class Gender(
    val genderType: GenderType,
    val mustUnderstandAttr: Boolean? = null,
)
