package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.GetContainmentTree
import org.somda.protosdc.biceps.model.GetContextStates
import org.somda.protosdc.biceps.model.GetContextStatesByFilter
import org.somda.protosdc.biceps.model.GetContextStatesByIdentification
import org.somda.protosdc.biceps.model.GetDescriptor
import org.somda.protosdc.biceps.model.GetDescriptorsFromArchive
import org.somda.protosdc.biceps.model.GetLocalizedText
import org.somda.protosdc.biceps.model.GetMdDescription
import org.somda.protosdc.biceps.model.GetMdState
import org.somda.protosdc.biceps.model.GetMdib
import org.somda.protosdc.biceps.model.GetStatesFromArchive
import org.somda.protosdc.biceps.model.GetSupportedLanguages

sealed class AbstractGetOneOf {
    data class ChoiceAbstractGet(val Choice: AbstractGet) : AbstractGetOneOf()
    data class ChoiceGetContainmentTree(val Choice: GetContainmentTree) : AbstractGetOneOf()
    data class ChoiceGetContextStates(val Choice: GetContextStates) : AbstractGetOneOf()
    data class ChoiceGetContextStatesByFilter(val Choice: GetContextStatesByFilter) : AbstractGetOneOf()
    data class ChoiceGetContextStatesByIdentification(val Choice: GetContextStatesByIdentification) : AbstractGetOneOf()
    data class ChoiceGetDescriptor(val Choice: GetDescriptor) : AbstractGetOneOf()
    data class ChoiceGetDescriptorsFromArchive(val Choice: GetDescriptorsFromArchive) : AbstractGetOneOf()
    data class ChoiceGetLocalizedText(val Choice: GetLocalizedText) : AbstractGetOneOf()
    data class ChoiceGetMdDescription(val Choice: GetMdDescription) : AbstractGetOneOf()
    data class ChoiceGetMdState(val Choice: GetMdState) : AbstractGetOneOf()
    data class ChoiceGetMdib(val Choice: GetMdib) : AbstractGetOneOf()
    data class ChoiceGetStatesFromArchive(val Choice: GetStatesFromArchive) : AbstractGetOneOf()
    data class ChoiceGetSupportedLanguages(val Choice: GetSupportedLanguages) : AbstractGetOneOf()
}
