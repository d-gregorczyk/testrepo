package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractMetricStateOneOf

data class AbstractMetricReport(
    val abstractReport: AbstractReport,
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val metricState: List<AbstractMetricStateOneOf> = listOf(),
    )
    val reportPart: List<ReportPart> = listOf(),
)
