package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractOperationStateOneOf

data class AbstractOperationalStateReport(
    val abstractReport: AbstractReport,
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val operationState: List<AbstractOperationStateOneOf> = listOf(),
    )
    val reportPart: List<ReportPart> = listOf(),
)
