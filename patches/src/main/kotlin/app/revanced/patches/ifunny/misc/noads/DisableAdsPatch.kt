package app.revanced.patches.ifunny.misc.noads

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val noAdsPatch = bytecodePatch(
    name = "Disable ads",
    description = "Completely disable ads."
) {
    compatibleWith("mobi.ifunny"("10.15.11"))

    execute {
        disableAdsFingerprint.method.replaceInstructions(
            0,
            """
                 const/4 v0, 0x1
                 return v0
            """,
        )
    }
}
