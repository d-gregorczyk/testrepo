package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.AbstractAlertState
import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState
import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.AbstractDeviceComponentState
import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.AbstractMultiState
import org.somda.protosdc.biceps.model.AbstractOperationState
import org.somda.protosdc.biceps.model.ActivateOperationState
import org.somda.protosdc.biceps.model.AlertConditionState
import org.somda.protosdc.biceps.model.AlertSignalState
import org.somda.protosdc.biceps.model.AlertSystemState
import org.somda.protosdc.biceps.model.BatteryState
import org.somda.protosdc.biceps.model.ChannelState
import org.somda.protosdc.biceps.model.ClockState
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState
import org.somda.protosdc.biceps.model.EnsembleContextState
import org.somda.protosdc.biceps.model.EnumStringMetricState
import org.somda.protosdc.biceps.model.LimitAlertConditionState
import org.somda.protosdc.biceps.model.LocationContextState
import org.somda.protosdc.biceps.model.MdsState
import org.somda.protosdc.biceps.model.MeansContextState
import org.somda.protosdc.biceps.model.NumericMetricState
import org.somda.protosdc.biceps.model.OperatorContextState
import org.somda.protosdc.biceps.model.PatientContextState
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState
import org.somda.protosdc.biceps.model.ScoState
import org.somda.protosdc.biceps.model.SetAlertStateOperationState
import org.somda.protosdc.biceps.model.SetComponentStateOperationState
import org.somda.protosdc.biceps.model.SetContextStateOperationState
import org.somda.protosdc.biceps.model.SetMetricStateOperationState
import org.somda.protosdc.biceps.model.SetStringOperationState
import org.somda.protosdc.biceps.model.SetValueOperationState
import org.somda.protosdc.biceps.model.StringMetricState
import org.somda.protosdc.biceps.model.SystemContextState
import org.somda.protosdc.biceps.model.VmdState
import org.somda.protosdc.biceps.model.WorkflowContextState

sealed class AbstractStateOneOf {
    data class ChoiceAbstractState(val value: AbstractState) : AbstractStateOneOf()
    data class ChoiceAbstractAlertState(val value: AbstractAlertState) : AbstractStateOneOf()
    data class ChoiceAbstractComplexDeviceComponentState(val value: AbstractComplexDeviceComponentState) : AbstractStateOneOf()
    data class ChoiceAbstractContextState(val value: AbstractContextState) : AbstractStateOneOf()
    data class ChoiceAbstractDeviceComponentState(val value: AbstractDeviceComponentState) : AbstractStateOneOf()
    data class ChoiceAbstractMetricState(val value: AbstractMetricState) : AbstractStateOneOf()
    data class ChoiceAbstractMultiState(val value: AbstractMultiState) : AbstractStateOneOf()
    data class ChoiceAbstractOperationState(val value: AbstractOperationState) : AbstractStateOneOf()
    data class ChoiceActivateOperationState(val value: ActivateOperationState) : AbstractStateOneOf()
    data class ChoiceAlertConditionState(val value: AlertConditionState) : AbstractStateOneOf()
    data class ChoiceAlertSignalState(val value: AlertSignalState) : AbstractStateOneOf()
    data class ChoiceAlertSystemState(val value: AlertSystemState) : AbstractStateOneOf()
    data class ChoiceBatteryState(val value: BatteryState) : AbstractStateOneOf()
    data class ChoiceChannelState(val value: ChannelState) : AbstractStateOneOf()
    data class ChoiceClockState(val value: ClockState) : AbstractStateOneOf()
    data class ChoiceDistributionSampleArrayMetricState(val value: DistributionSampleArrayMetricState) : AbstractStateOneOf()
    data class ChoiceEnsembleContextState(val value: EnsembleContextState) : AbstractStateOneOf()
    data class ChoiceEnumStringMetricState(val value: EnumStringMetricState) : AbstractStateOneOf()
    data class ChoiceLimitAlertConditionState(val value: LimitAlertConditionState) : AbstractStateOneOf()
    data class ChoiceLocationContextState(val value: LocationContextState) : AbstractStateOneOf()
    data class ChoiceMdsState(val value: MdsState) : AbstractStateOneOf()
    data class ChoiceMeansContextState(val value: MeansContextState) : AbstractStateOneOf()
    data class ChoiceNumericMetricState(val value: NumericMetricState) : AbstractStateOneOf()
    data class ChoiceOperatorContextState(val value: OperatorContextState) : AbstractStateOneOf()
    data class ChoicePatientContextState(val value: PatientContextState) : AbstractStateOneOf()
    data class ChoiceRealTimeSampleArrayMetricState(val value: RealTimeSampleArrayMetricState) : AbstractStateOneOf()
    data class ChoiceScoState(val value: ScoState) : AbstractStateOneOf()
    data class ChoiceSetAlertStateOperationState(val value: SetAlertStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetComponentStateOperationState(val value: SetComponentStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetContextStateOperationState(val value: SetContextStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetMetricStateOperationState(val value: SetMetricStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetStringOperationState(val value: SetStringOperationState) : AbstractStateOneOf()
    data class ChoiceSetValueOperationState(val value: SetValueOperationState) : AbstractStateOneOf()
    data class ChoiceStringMetricState(val value: StringMetricState) : AbstractStateOneOf()
    data class ChoiceSystemContextState(val value: SystemContextState) : AbstractStateOneOf()
    data class ChoiceVmdState(val value: VmdState) : AbstractStateOneOf()
    data class ChoiceWorkflowContextState(val value: WorkflowContextState) : AbstractStateOneOf()
}
