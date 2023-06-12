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

data class AbstractGetOneOf(
    sealed class AbstractGetOneOf {
        data class ChoiceAbstractGet(val value: AbstractGet) : AbstractGetOneOf()
        data class ChoiceGetContainmentTree(val value: GetContainmentTree) : AbstractGetOneOf()
        data class ChoiceGetContextStates(val value: GetContextStates) : AbstractGetOneOf()
        data class ChoiceGetContextStatesByFilter(val value: GetContextStatesByFilter) : AbstractGetOneOf()
        data class ChoiceGetContextStatesByIdentification(val value: GetContextStatesByIdentification) : AbstractGetOneOf()
        data class ChoiceGetDescriptor(val value: GetDescriptor) : AbstractGetOneOf()
        data class ChoiceGetDescriptorsFromArchive(val value: GetDescriptorsFromArchive) : AbstractGetOneOf()
        data class ChoiceGetLocalizedText(val value: GetLocalizedText) : AbstractGetOneOf()
        data class ChoiceGetMdDescription(val value: GetMdDescription) : AbstractGetOneOf()
        data class ChoiceGetMdState(val value: GetMdState) : AbstractGetOneOf()
        data class ChoiceGetMdib(val value: GetMdib) : AbstractGetOneOf()
        data class ChoiceGetStatesFromArchive(val value: GetStatesFromArchive) : AbstractGetOneOf()
        data class ChoiceGetSupportedLanguages(val value: GetSupportedLanguages) : AbstractGetOneOf()
    }
)
