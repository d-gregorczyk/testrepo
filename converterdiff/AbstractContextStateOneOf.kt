package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.EnsembleContextState
import org.somda.protosdc.biceps.model.LocationContextState
import org.somda.protosdc.biceps.model.MeansContextState
import org.somda.protosdc.biceps.model.OperatorContextState
import org.somda.protosdc.biceps.model.PatientContextState
import org.somda.protosdc.biceps.model.WorkflowContextState

sealed class AbstractContextStateOneOf {
    data class ChoiceAbstractContextState(val Choice: AbstractContextState) : AbstractContextStateOneOf()
    data class ChoiceEnsembleContextState(val Choice: EnsembleContextState) : AbstractContextStateOneOf()
    data class ChoiceLocationContextState(val Choice: LocationContextState) : AbstractContextStateOneOf()
    data class ChoiceMeansContextState(val Choice: MeansContextState) : AbstractContextStateOneOf()
    data class ChoiceOperatorContextState(val Choice: OperatorContextState) : AbstractContextStateOneOf()
    data class ChoicePatientContextState(val Choice: PatientContextState) : AbstractContextStateOneOf()
    data class ChoiceWorkflowContextState(val Choice: WorkflowContextState) : AbstractContextStateOneOf()
}
