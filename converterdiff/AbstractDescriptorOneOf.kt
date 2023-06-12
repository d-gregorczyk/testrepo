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

data class AbstractDescriptorOneOf(
    sealed class AbstractDescriptorOneOf {
        data class ChoiceAbstractDescriptor(val value: AbstractDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractAlertDescriptor(val value: AbstractAlertDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractComplexDeviceComponentDescriptor(val value: AbstractComplexDeviceComponentDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractContextDescriptor(val value: AbstractContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractDeviceComponentDescriptor(val value: AbstractDeviceComponentDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractMetricDescriptor(val value: AbstractMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractOperationDescriptor(val value: AbstractOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAbstractSetStateOperationDescriptor(val value: AbstractSetStateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceActivateOperationDescriptor(val value: ActivateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAlertConditionDescriptor(val value: AlertConditionDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAlertSignalDescriptor(val value: AlertSignalDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceAlertSystemDescriptor(val value: AlertSystemDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceBatteryDescriptor(val value: BatteryDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceChannelDescriptor(val value: ChannelDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceClockDescriptor(val value: ClockDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceDistributionSampleArrayMetricDescriptor(val value: DistributionSampleArrayMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceEnsembleContextDescriptor(val value: EnsembleContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceEnumStringMetricDescriptor(val value: EnumStringMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceLimitAlertConditionDescriptor(val value: LimitAlertConditionDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceLocationContextDescriptor(val value: LocationContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceMdsDescriptor(val value: MdsDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceMeansContextDescriptor(val value: MeansContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceNumericMetricDescriptor(val value: NumericMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceOperatorContextDescriptor(val value: OperatorContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoicePatientContextDescriptor(val value: PatientContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceRealTimeSampleArrayMetricDescriptor(val value: RealTimeSampleArrayMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceScoDescriptor(val value: ScoDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetAlertStateOperationDescriptor(val value: SetAlertStateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetComponentStateOperationDescriptor(val value: SetComponentStateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetContextStateOperationDescriptor(val value: SetContextStateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetMetricStateOperationDescriptor(val value: SetMetricStateOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetStringOperationDescriptor(val value: SetStringOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSetValueOperationDescriptor(val value: SetValueOperationDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceStringMetricDescriptor(val value: StringMetricDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceSystemContextDescriptor(val value: SystemContextDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceVmdDescriptor(val value: VmdDescriptor) : AbstractDescriptorOneOf()
        data class ChoiceWorkflowContextDescriptor(val value: WorkflowContextDescriptor) : AbstractDescriptorOneOf()
    }
)
