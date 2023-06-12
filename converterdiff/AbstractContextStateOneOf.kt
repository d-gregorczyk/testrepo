package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.EnsembleContextState
import org.somda.protosdc.biceps.model.LocationContextState
import org.somda.protosdc.biceps.model.MeansContextState
import org.somda.protosdc.biceps.model.OperatorContextState
import org.somda.protosdc.biceps.model.PatientContextState
import org.somda.protosdc.biceps.model.WorkflowContextState

sealed class AbstractContextStateOneOf {
    data class ChoiceAbstractContextState(val value: AbstractContextState) : AbstractContextStateOneOf()
    data class ChoiceEnsembleContextState(val value: EnsembleContextState) : AbstractContextStateOneOf()
    data class ChoiceLocationContextState(val value: LocationContextState) : AbstractContextStateOneOf()
    data class ChoiceMeansContextState(val value: MeansContextState) : AbstractContextStateOneOf()
    data class ChoiceOperatorContextState(val value: OperatorContextState) : AbstractContextStateOneOf()
    data class ChoicePatientContextState(val value: PatientContextState) : AbstractContextStateOneOf()
    data class ChoiceWorkflowContextState(val value: WorkflowContextState) : AbstractContextStateOneOf()
}
