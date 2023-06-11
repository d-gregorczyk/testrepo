package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.LocalizedTextContent
import org.somda.protosdc.biceps.model.LocalizedText

sealed class LocalizedTextContentOneOf {
    data class ChoiceLocalizedTextContent(val Choice: LocalizedTextContent) : LocalizedTextContentOneOf()
    data class ChoiceLocalizedText(val Choice: LocalizedText) : LocalizedTextContentOneOf()
}
