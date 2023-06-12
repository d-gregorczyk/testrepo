package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractAlertReport
import org.somda.protosdc.biceps.model.AbstractComponentReport
import org.somda.protosdc.biceps.model.AbstractContextReport
import org.somda.protosdc.biceps.model.AbstractMetricReport
import org.somda.protosdc.biceps.model.AbstractOperationalStateReport
import org.somda.protosdc.biceps.model.DescriptionModificationReport
import org.somda.protosdc.biceps.model.EpisodicAlertReport
import org.somda.protosdc.biceps.model.EpisodicComponentReport
import org.somda.protosdc.biceps.model.EpisodicContextReport
import org.somda.protosdc.biceps.model.EpisodicMetricReport
import org.somda.protosdc.biceps.model.EpisodicOperationalStateReport
import org.somda.protosdc.biceps.model.ObservedValueStream
import org.somda.protosdc.biceps.model.OperationInvokedReport
import org.somda.protosdc.biceps.model.PeriodicAlertReport
import org.somda.protosdc.biceps.model.PeriodicComponentReport
import org.somda.protosdc.biceps.model.PeriodicContextReport
import org.somda.protosdc.biceps.model.PeriodicMetricReport
import org.somda.protosdc.biceps.model.PeriodicOperationalStateReport
import org.somda.protosdc.biceps.model.SystemErrorReport
import org.somda.protosdc.biceps.model.WaveformStream

sealed class AbstractReportOneOf {
    data class ChoiceAbstractReport(val value: AbstractReport) : AbstractReportOneOf()
    data class ChoiceAbstractAlertReport(val value: AbstractAlertReport) : AbstractReportOneOf()
    data class ChoiceAbstractComponentReport(val value: AbstractComponentReport) : AbstractReportOneOf()
    data class ChoiceAbstractContextReport(val value: AbstractContextReport) : AbstractReportOneOf()
    data class ChoiceAbstractMetricReport(val value: AbstractMetricReport) : AbstractReportOneOf()
    data class ChoiceAbstractOperationalStateReport(val value: AbstractOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceDescriptionModificationReport(val value: DescriptionModificationReport) : AbstractReportOneOf()
    data class ChoiceEpisodicAlertReport(val value: EpisodicAlertReport) : AbstractReportOneOf()
    data class ChoiceEpisodicComponentReport(val value: EpisodicComponentReport) : AbstractReportOneOf()
    data class ChoiceEpisodicContextReport(val value: EpisodicContextReport) : AbstractReportOneOf()
    data class ChoiceEpisodicMetricReport(val value: EpisodicMetricReport) : AbstractReportOneOf()
    data class ChoiceEpisodicOperationalStateReport(val value: EpisodicOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceObservedValueStream(val value: ObservedValueStream) : AbstractReportOneOf()
    data class ChoiceOperationInvokedReport(val value: OperationInvokedReport) : AbstractReportOneOf()
    data class ChoicePeriodicAlertReport(val value: PeriodicAlertReport) : AbstractReportOneOf()
    data class ChoicePeriodicComponentReport(val value: PeriodicComponentReport) : AbstractReportOneOf()
    data class ChoicePeriodicContextReport(val value: PeriodicContextReport) : AbstractReportOneOf()
    data class ChoicePeriodicMetricReport(val value: PeriodicMetricReport) : AbstractReportOneOf()
    data class ChoicePeriodicOperationalStateReport(val value: PeriodicOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceSystemErrorReport(val value: SystemErrorReport) : AbstractReportOneOf()
    data class ChoiceWaveformStream(val value: WaveformStream) : AbstractReportOneOf()
}
