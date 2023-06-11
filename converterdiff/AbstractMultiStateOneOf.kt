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
    data class ChoiceAbstractMultiState(val Choice: AbstractMultiState) : AbstractMultiStateOneOf()
    data class ChoiceAbstractContextState(val Choice: AbstractContextState) : AbstractMultiStateOneOf()
    data class ChoiceEnsembleContextState(val Choice: EnsembleContextState) : AbstractMultiStateOneOf()
    data class ChoiceLocationContextState(val Choice: LocationContextState) : AbstractMultiStateOneOf()
    data class ChoiceMeansContextState(val Choice: MeansContextState) : AbstractMultiStateOneOf()
    data class ChoiceOperatorContextState(val Choice: OperatorContextState) : AbstractMultiStateOneOf()
    data class ChoicePatientContextState(val Choice: PatientContextState) : AbstractMultiStateOneOf()
    data class ChoiceWorkflowContextState(val Choice: WorkflowContextState) : AbstractMultiStateOneOf()
}
