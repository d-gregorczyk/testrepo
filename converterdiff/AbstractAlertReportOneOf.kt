package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertReport
import org.somda.protosdc.biceps.model.EpisodicAlertReport
import org.somda.protosdc.biceps.model.PeriodicAlertReport

sealed class AbstractAlertReportOneOf {
    data class ChoiceAbstractAlertReport(val Choice: AbstractAlertReport) : AbstractAlertReportOneOf()
    data class ChoiceEpisodicAlertReport(val Choice: EpisodicAlertReport) : AbstractAlertReportOneOf()
    data class ChoicePeriodicAlertReport(val Choice: PeriodicAlertReport) : AbstractAlertReportOneOf()
}
