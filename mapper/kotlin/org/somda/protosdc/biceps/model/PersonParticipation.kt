package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PersonReference
import org.somda.protosdc.biceps.model.CodedValue

data class PersonParticipation(
    val personReference: PersonReference,
val role: List<CodedValue> = listOf(),
)
