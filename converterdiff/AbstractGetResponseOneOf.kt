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
    data class ChoiceAbstractGetResponse(val Choice: AbstractGetResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContainmentTreeResponse(val Choice: GetContainmentTreeResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesByFilterResponse(val Choice: GetContextStatesByFilterResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesByIdentificationResponse(val Choice: GetContextStatesByIdentificationResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetContextStatesResponse(val Choice: GetContextStatesResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetDescriptorResponse(val Choice: GetDescriptorResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetDescriptorsFromArchiveResponse(val Choice: GetDescriptorsFromArchiveResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetLocalizedTextResponse(val Choice: GetLocalizedTextResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdDescriptionResponse(val Choice: GetMdDescriptionResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdStateResponse(val Choice: GetMdStateResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetMdibResponse(val Choice: GetMdibResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetStatesFromArchiveResponse(val Choice: GetStatesFromArchiveResponse) : AbstractGetResponseOneOf()
    data class ChoiceGetSupportedLanguagesResponse(val Choice: GetSupportedLanguagesResponse) : AbstractGetResponseOneOf()
}
