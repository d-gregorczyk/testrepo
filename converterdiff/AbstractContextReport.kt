package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractContextStateOneOf

data class AbstractContextReport (
    val abstractReport: AbstractReport,
    val reportPart: List<ReportPart> = listOf(),
) {
    data class ReportPart (
        val abstractReportPart: AbstractReportPart,
        val contextState: List<AbstractContextStateOneOf> = listOf(),
    )
}
