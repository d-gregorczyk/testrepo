package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Retrievability

sealed class BicepsExtensions {
    data class ChoiceRetrievability(val value: Retrievability) : BicepsExtensions()
}
