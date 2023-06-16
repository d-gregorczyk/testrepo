package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.LocalizedText

data class SystemErrorReport(
    val abstractReport: AbstractReport,
val reportPart: List<ReportPart> = listOf(),
) {
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val errorCode: CodedValue,
        val errorInfo: LocalizedText? = null,
    )
}
