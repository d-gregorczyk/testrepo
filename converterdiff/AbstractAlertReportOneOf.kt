package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertReport
import org.somda.protosdc.biceps.model.EpisodicAlertReport
import org.somda.protosdc.biceps.model.PeriodicAlertReport

data class AbstractAlertReportOneOf(
    sealed class AbstractAlertReportOneOf {
        data class ChoiceAbstractAlertReport(val value: AbstractAlertReport) : AbstractAlertReportOneOf()
        data class ChoiceEpisodicAlertReport(val value: EpisodicAlertReport) : AbstractAlertReportOneOf()
        data class ChoicePeriodicAlertReport(val value: PeriodicAlertReport) : AbstractAlertReportOneOf()
    }
)
