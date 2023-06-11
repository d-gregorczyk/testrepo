package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PersonReference
import org.somda.protosdc.biceps.model.PersonParticipation

sealed class PersonReferenceOneOf {
    data class ChoicePersonReference(val value: PersonReference) : PersonReferenceOneOf()
    data class ChoicePersonParticipation(val value: PersonParticipation) : PersonReferenceOneOf()
}
