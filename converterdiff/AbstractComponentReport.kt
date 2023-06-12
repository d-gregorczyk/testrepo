package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf

data class AbstractComponentReport(
    val abstractReport: AbstractReport,
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val componentState: List<AbstractDeviceComponentStateOneOf> = listOf(),
    )
    val reportPart: List<ReportPart> = listOf(),
)
