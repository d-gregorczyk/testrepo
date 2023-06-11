package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PersonReference
import org.somda.protosdc.biceps.model.PersonParticipation

sealed class PersonReferenceOneOf {
    data class ChoicePersonReference(val Choice: PersonReference) : PersonReferenceOneOf()
    data class ChoicePersonParticipation(val Choice: PersonParticipation) : PersonReferenceOneOf()
}
