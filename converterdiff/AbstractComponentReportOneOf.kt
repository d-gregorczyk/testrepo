package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComponentReport
import org.somda.protosdc.biceps.model.EpisodicComponentReport
import org.somda.protosdc.biceps.model.PeriodicComponentReport

sealed class AbstractComponentReportOneOf {
    data class ChoiceAbstractComponentReport(val Choice: AbstractComponentReport) : AbstractComponentReportOneOf()
    data class ChoiceEpisodicComponentReport(val Choice: EpisodicComponentReport) : AbstractComponentReportOneOf()
    data class ChoicePeriodicComponentReport(val Choice: PeriodicComponentReport) : AbstractComponentReportOneOf()
}
