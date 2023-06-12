package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.PersonReference
import org.somda.protosdc.biceps.model.PersonParticipation

data class PersonReferenceOneOf(
    sealed class PersonReferenceOneOf {
        data class ChoicePersonReference(val value: PersonReference) : PersonReferenceOneOf()
        data class ChoicePersonParticipation(val value: PersonParticipation) : PersonReferenceOneOf()
    }
)
