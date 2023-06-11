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
    data class ChoiceAbstractReport(val Choice: AbstractReport) : AbstractReportOneOf()
    data class ChoiceAbstractAlertReport(val Choice: AbstractAlertReport) : AbstractReportOneOf()
    data class ChoiceAbstractComponentReport(val Choice: AbstractComponentReport) : AbstractReportOneOf()
    data class ChoiceAbstractContextReport(val Choice: AbstractContextReport) : AbstractReportOneOf()
    data class ChoiceAbstractMetricReport(val Choice: AbstractMetricReport) : AbstractReportOneOf()
    data class ChoiceAbstractOperationalStateReport(val Choice: AbstractOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceDescriptionModificationReport(val Choice: DescriptionModificationReport) : AbstractReportOneOf()
    data class ChoiceEpisodicAlertReport(val Choice: EpisodicAlertReport) : AbstractReportOneOf()
    data class ChoiceEpisodicComponentReport(val Choice: EpisodicComponentReport) : AbstractReportOneOf()
    data class ChoiceEpisodicContextReport(val Choice: EpisodicContextReport) : AbstractReportOneOf()
    data class ChoiceEpisodicMetricReport(val Choice: EpisodicMetricReport) : AbstractReportOneOf()
    data class ChoiceEpisodicOperationalStateReport(val Choice: EpisodicOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceObservedValueStream(val Choice: ObservedValueStream) : AbstractReportOneOf()
    data class ChoiceOperationInvokedReport(val Choice: OperationInvokedReport) : AbstractReportOneOf()
    data class ChoicePeriodicAlertReport(val Choice: PeriodicAlertReport) : AbstractReportOneOf()
    data class ChoicePeriodicComponentReport(val Choice: PeriodicComponentReport) : AbstractReportOneOf()
    data class ChoicePeriodicContextReport(val Choice: PeriodicContextReport) : AbstractReportOneOf()
    data class ChoicePeriodicMetricReport(val Choice: PeriodicMetricReport) : AbstractReportOneOf()
    data class ChoicePeriodicOperationalStateReport(val Choice: PeriodicOperationalStateReport) : AbstractReportOneOf()
    data class ChoiceSystemErrorReport(val Choice: SystemErrorReport) : AbstractReportOneOf()
    data class ChoiceWaveformStream(val Choice: WaveformStream) : AbstractReportOneOf()
}
