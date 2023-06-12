package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractContextStateOneOf

data class AbstractContextReport(
    val abstractReport: AbstractReport,
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val contextState: List<AbstractContextStateOneOf> = listOf(),
    )
    val reportPart: List<ReportPart> = listOf(),
)
