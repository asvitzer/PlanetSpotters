package com.asvitzer.planetspotters.data.model

import java.util.Date

data class Planet(
    var planetId: String?,
    var name: String,
    var distanceLy: Float,
    var discovered: Date,
)