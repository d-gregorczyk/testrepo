package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension

data class BaseDemographics(
    val extensionElement: Extension? = null,
    val givenname: String? = null,
    val middlename: List<String> = listOf(),
    val familyname: String? = null,
    val birthname: String? = null,
    val title: String? = null,
)
