package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDescriptor
import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AbstractContextDescriptor
import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.AbstractOperationDescriptor
import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.ActivateOperationDescriptor
import org.somda.protosdc.biceps.model.AlertConditionDescriptor
import org.somda.protosdc.biceps.model.AlertSignalDescriptor
import org.somda.protosdc.biceps.model.AlertSystemDescriptor
import org.somda.protosdc.biceps.model.BatteryDescriptor
import org.somda.protosdc.biceps.model.ChannelDescriptor
import org.somda.protosdc.biceps.model.ClockDescriptor
import org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.EnsembleContextDescriptor
import org.somda.protosdc.biceps.model.EnumStringMetricDescriptor
import org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor
import org.somda.protosdc.biceps.model.LocationContextDescriptor
import org.somda.protosdc.biceps.model.MdsDescriptor
import org.somda.protosdc.biceps.model.MeansContextDescriptor
import org.somda.protosdc.biceps.model.NumericMetricDescriptor
import org.somda.protosdc.biceps.model.OperatorContextDescriptor
import org.somda.protosdc.biceps.model.PatientContextDescriptor
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor
import org.somda.protosdc.biceps.model.ScoDescriptor
import org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor
import org.somda.protosdc.biceps.model.SetStringOperationDescriptor
import org.somda.protosdc.biceps.model.SetValueOperationDescriptor
import org.somda.protosdc.biceps.model.StringMetricDescriptor
import org.somda.protosdc.biceps.model.SystemContextDescriptor
import org.somda.protosdc.biceps.model.VmdDescriptor
import org.somda.protosdc.biceps.model.WorkflowContextDescriptor

sealed class AbstractDescriptorOneOf {
    data class ChoiceAbstractDescriptor(val Choice: AbstractDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractAlertDescriptor(val Choice: AbstractAlertDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractComplexDeviceComponentDescriptor(val Choice: AbstractComplexDeviceComponentDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractContextDescriptor(val Choice: AbstractContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractDeviceComponentDescriptor(val Choice: AbstractDeviceComponentDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractMetricDescriptor(val Choice: AbstractMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractOperationDescriptor(val Choice: AbstractOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAbstractSetStateOperationDescriptor(val Choice: AbstractSetStateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceActivateOperationDescriptor(val Choice: ActivateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAlertConditionDescriptor(val Choice: AlertConditionDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAlertSignalDescriptor(val Choice: AlertSignalDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceAlertSystemDescriptor(val Choice: AlertSystemDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceBatteryDescriptor(val Choice: BatteryDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceChannelDescriptor(val Choice: ChannelDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceClockDescriptor(val Choice: ClockDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceDistributionSampleArrayMetricDescriptor(val Choice: DistributionSampleArrayMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceEnsembleContextDescriptor(val Choice: EnsembleContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceEnumStringMetricDescriptor(val Choice: EnumStringMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceLimitAlertConditionDescriptor(val Choice: LimitAlertConditionDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceLocationContextDescriptor(val Choice: LocationContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceMdsDescriptor(val Choice: MdsDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceMeansContextDescriptor(val Choice: MeansContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceNumericMetricDescriptor(val Choice: NumericMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceOperatorContextDescriptor(val Choice: OperatorContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoicePatientContextDescriptor(val Choice: PatientContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceRealTimeSampleArrayMetricDescriptor(val Choice: RealTimeSampleArrayMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceScoDescriptor(val Choice: ScoDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetAlertStateOperationDescriptor(val Choice: SetAlertStateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetComponentStateOperationDescriptor(val Choice: SetComponentStateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetContextStateOperationDescriptor(val Choice: SetContextStateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetMetricStateOperationDescriptor(val Choice: SetMetricStateOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetStringOperationDescriptor(val Choice: SetStringOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSetValueOperationDescriptor(val Choice: SetValueOperationDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceStringMetricDescriptor(val Choice: StringMetricDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceSystemContextDescriptor(val Choice: SystemContextDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceVmdDescriptor(val Choice: VmdDescriptor) : AbstractDescriptorOneOf()
    data class ChoiceWorkflowContextDescriptor(val Choice: WorkflowContextDescriptor) : AbstractDescriptorOneOf()
}
