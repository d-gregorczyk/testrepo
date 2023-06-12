package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextReport
import org.somda.protosdc.biceps.model.EpisodicContextReport
import org.somda.protosdc.biceps.model.PeriodicContextReport

sealed class AbstractContextReportOneOf {
    data class ChoiceAbstractContextReport(val value: AbstractContextReport) : AbstractContextReportOneOf()
    data class ChoiceEpisodicContextReport(val value: EpisodicContextReport) : AbstractContextReportOneOf()
    data class ChoicePeriodicContextReport(val value: PeriodicContextReport) : AbstractContextReportOneOf()
}
