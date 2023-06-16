package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMultiState
import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.EnsembleContextState
import org.somda.protosdc.biceps.model.LocationContextState
import org.somda.protosdc.biceps.model.MeansContextState
import org.somda.protosdc.biceps.model.OperatorContextState
import org.somda.protosdc.biceps.model.PatientContextState
import org.somda.protosdc.biceps.model.WorkflowContextState

sealed class AbstractMultiStateOneOf {
    data class ChoiceAbstractMultiState(val value: AbstractMultiState) : AbstractMultiStateOneOf()
    data class ChoiceAbstractContextState(val value: AbstractContextState) : AbstractMultiStateOneOf()
    data class ChoiceEnsembleContextState(val value: EnsembleContextState) : AbstractMultiStateOneOf()
    data class ChoiceLocationContextState(val value: LocationContextState) : AbstractMultiStateOneOf()
    data class ChoiceMeansContextState(val value: MeansContextState) : AbstractMultiStateOneOf()
    data class ChoiceOperatorContextState(val value: OperatorContextState) : AbstractMultiStateOneOf()
    data class ChoicePatientContextState(val value: PatientContextState) : AbstractMultiStateOneOf()
    data class ChoiceWorkflowContextState(val value: WorkflowContextState) : AbstractMultiStateOneOf()
}
