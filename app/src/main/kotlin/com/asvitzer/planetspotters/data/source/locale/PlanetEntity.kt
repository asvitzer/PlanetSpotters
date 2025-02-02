package com.asvitzer.planetspotters.data.source.locale

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.asvitzer.planetspotters.data.model.Planet
import java.util.Date
import java.util.UUID

@Entity(tableName = "planets")
data class PlanetEntity(
    @PrimaryKey var planetId: String,

    var name: String = "",

    var distanceLy: Float = 1.0F,

    var discovered: Date = Date(),
) {
    fun toPlanet(): Planet {
        return Planet(
            planetId = planetId,
            name = name,
            distanceLy = distanceLy,
            discovered = discovered
        )
    }
}

fun Planet.toPlanetEntity(): PlanetEntity {
    return PlanetEntity(
        planetId = planetId ?: UUID.randomUUID().toString(),
        name = name,
        distanceLy = distanceLy,
        discovered = discovered
    )
}