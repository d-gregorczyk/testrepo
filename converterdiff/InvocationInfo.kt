package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.TransactionId
import org.somda.protosdc.biceps.model.InvocationState
import org.somda.protosdc.biceps.model.InvocationError
import org.somda.protosdc.biceps.model.LocalizedText

data class InvocationInfo(
    val extensionElement: Extension? = null,
    val transactionId: TransactionId,
    val invocationState: InvocationState,
    val invocationError: InvocationError? = null,
    val invocationErrorMessage: List<LocalizedText> = listOf(),
)
