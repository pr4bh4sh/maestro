package maestro.orchestra.yaml

import com.fasterxml.jackson.annotation.JsonCreator

data class YamlClearState(
    val appId: String? = null
) {
    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(appId: String) = YamlClearState(
            appId = appId
        )
    }
}
