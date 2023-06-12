package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.LocalizedTextContent
import org.somda.protosdc.biceps.model.LocalizedText

data class LocalizedTextContentOneOf(
    sealed class LocalizedTextContentOneOf {
        data class ChoiceLocalizedTextContent(val value: LocalizedTextContent) : LocalizedTextContentOneOf()
        data class ChoiceLocalizedText(val value: LocalizedText) : LocalizedTextContentOneOf()
    }
)
