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
    data class ChoiceAbstractState(val Choice: AbstractState) : AbstractStateOneOf()
    data class ChoiceAbstractAlertState(val Choice: AbstractAlertState) : AbstractStateOneOf()
    data class ChoiceAbstractComplexDeviceComponentState(val Choice: AbstractComplexDeviceComponentState) : AbstractStateOneOf()
    data class ChoiceAbstractContextState(val Choice: AbstractContextState) : AbstractStateOneOf()
    data class ChoiceAbstractDeviceComponentState(val Choice: AbstractDeviceComponentState) : AbstractStateOneOf()
    data class ChoiceAbstractMetricState(val Choice: AbstractMetricState) : AbstractStateOneOf()
    data class ChoiceAbstractMultiState(val Choice: AbstractMultiState) : AbstractStateOneOf()
    data class ChoiceAbstractOperationState(val Choice: AbstractOperationState) : AbstractStateOneOf()
    data class ChoiceActivateOperationState(val Choice: ActivateOperationState) : AbstractStateOneOf()
    data class ChoiceAlertConditionState(val Choice: AlertConditionState) : AbstractStateOneOf()
    data class ChoiceAlertSignalState(val Choice: AlertSignalState) : AbstractStateOneOf()
    data class ChoiceAlertSystemState(val Choice: AlertSystemState) : AbstractStateOneOf()
    data class ChoiceBatteryState(val Choice: BatteryState) : AbstractStateOneOf()
    data class ChoiceChannelState(val Choice: ChannelState) : AbstractStateOneOf()
    data class ChoiceClockState(val Choice: ClockState) : AbstractStateOneOf()
    data class ChoiceDistributionSampleArrayMetricState(val Choice: DistributionSampleArrayMetricState) : AbstractStateOneOf()
    data class ChoiceEnsembleContextState(val Choice: EnsembleContextState) : AbstractStateOneOf()
    data class ChoiceEnumStringMetricState(val Choice: EnumStringMetricState) : AbstractStateOneOf()
    data class ChoiceLimitAlertConditionState(val Choice: LimitAlertConditionState) : AbstractStateOneOf()
    data class ChoiceLocationContextState(val Choice: LocationContextState) : AbstractStateOneOf()
    data class ChoiceMdsState(val Choice: MdsState) : AbstractStateOneOf()
    data class ChoiceMeansContextState(val Choice: MeansContextState) : AbstractStateOneOf()
    data class ChoiceNumericMetricState(val Choice: NumericMetricState) : AbstractStateOneOf()
    data class ChoiceOperatorContextState(val Choice: OperatorContextState) : AbstractStateOneOf()
    data class ChoicePatientContextState(val Choice: PatientContextState) : AbstractStateOneOf()
    data class ChoiceRealTimeSampleArrayMetricState(val Choice: RealTimeSampleArrayMetricState) : AbstractStateOneOf()
    data class ChoiceScoState(val Choice: ScoState) : AbstractStateOneOf()
    data class ChoiceSetAlertStateOperationState(val Choice: SetAlertStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetComponentStateOperationState(val Choice: SetComponentStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetContextStateOperationState(val Choice: SetContextStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetMetricStateOperationState(val Choice: SetMetricStateOperationState) : AbstractStateOneOf()
    data class ChoiceSetStringOperationState(val Choice: SetStringOperationState) : AbstractStateOneOf()
    data class ChoiceSetValueOperationState(val Choice: SetValueOperationState) : AbstractStateOneOf()
    data class ChoiceStringMetricState(val Choice: StringMetricState) : AbstractStateOneOf()
    data class ChoiceSystemContextState(val Choice: SystemContextState) : AbstractStateOneOf()
    data class ChoiceVmdState(val Choice: VmdState) : AbstractStateOneOf()
    data class ChoiceWorkflowContextState(val Choice: WorkflowContextState) : AbstractStateOneOf()
}
