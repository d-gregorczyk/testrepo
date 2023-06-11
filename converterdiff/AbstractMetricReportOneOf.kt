package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricReport
import org.somda.protosdc.biceps.model.EpisodicMetricReport
import org.somda.protosdc.biceps.model.PeriodicMetricReport

sealed class AbstractMetricReportOneOf {
    data class ChoiceAbstractMetricReport(val Choice: AbstractMetricReport) : AbstractMetricReportOneOf()
    data class ChoiceEpisodicMetricReport(val Choice: EpisodicMetricReport) : AbstractMetricReportOneOf()
    data class ChoicePeriodicMetricReport(val Choice: PeriodicMetricReport) : AbstractMetricReportOneOf()
}