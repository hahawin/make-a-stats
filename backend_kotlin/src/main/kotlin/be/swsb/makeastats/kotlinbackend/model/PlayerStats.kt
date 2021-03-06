package be.swsb.makeastats.kotlinbackend.model

data class PlayerStats(val id: Int,
                       val player: String,
                       val totalKills: Int,
                       val amountOfMatchesPlayed: Int,
                       val killsPerMatch: Float) {
    companion object {
        fun fromPlayernames(names: Iterable<String>): List<PlayerStats> =
                names.map { name -> PlayerStats(0, name, 0, 0, 0f) }
    }
}

typealias PlayerName = String