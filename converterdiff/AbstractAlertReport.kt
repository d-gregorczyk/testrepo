package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractAlertStateOneOf

data class AbstractAlertReport(
    val abstractReport: AbstractReport,
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val alertState: List<AbstractAlertStateOneOf> = listOf(),
    )
    val reportPart: List<ReportPart> = listOf(),
)
