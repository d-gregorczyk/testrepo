package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.Handle

data class AbstractMultiState(
    val abstractState: AbstractState,
    val category: CodedValue? = null,
    val handleAttr: Handle,
)
