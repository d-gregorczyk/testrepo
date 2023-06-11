package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.GetContainmentTreeResponse
import org.somda.protosdc.biceps.model.GetContextStatesByFilterResponse
import org.somda.protosdc.biceps.model.GetContextStatesByIdentificationResponse
import org.somda.protosdc.biceps.model.GetContextStatesResponse
import org.somda.protosdc.biceps.model.GetDescriptorResponse
import org.somda.protosdc.biceps.model.GetDescriptorsFromArchiveResponse
import org.somda.protosdc.biceps.model.GetLocalizedTextResponse
import org.somda.protosdc.biceps.model.GetMdDescriptionResponse
import org.somda.protosdc.biceps.model.GetMdStateResponse
import org.somda.protosdc.biceps.model.GetMdibResponse
import org.somda.protosdc.biceps.model.GetStatesFromArchiveResponse
import org.somda.protosdc.biceps.model.GetSupportedLanguagesResponse

sealed class AbstractGetResponseOneOf {
    data class ChoiceAbstractGetResponse(val value: AbstractGetResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContainmentTreeResponse(val value: GetContainmentTreeResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesByFilterResponse(val value: GetContextStatesByFilterResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesByIdentificationResponse(val value: GetContextStatesByIdentificationResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesResponse(val value: GetContextStatesResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetDescriptorResponse(val value: GetDescriptorResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetDescriptorsFromArchiveResponse(val value: GetDescriptorsFromArchiveResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetLocalizedTextResponse(val value: GetLocalizedTextResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdDescriptionResponse(val value: GetMdDescriptionResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdStateResponse(val value: GetMdStateResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdibResponse(val value: GetMdibResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetStatesFromArchiveResponse(val value: GetStatesFromArchiveResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetSupportedLanguagesResponse(val value: GetSupportedLanguagesResponse) : AbstractGetResponseOneOf()
}
