package maestro.orchestra.yaml

import com.fasterxml.jackson.annotation.JsonCreator

data class YamlTakeScreenshot(
    val path: String
) {

    companion object {

        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(path: String): YamlTakeScreenshot {
            return YamlTakeScreenshot(
                path = path
            )
        }
    }
}
